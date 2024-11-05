/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.gialong.mathutil.test.core;

import com.gialong.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author admin
 */
public class MathUtilityTest {
    //class sử dụng các hàm của JUnit để kiếm tra code tính giai thừa
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //tên nói lên case hàm kiểm thử (thành công/thất bại)
    //@Test là spvm ở hậu trường phối hợp JVM để chạy
    //hàm kiểm thành công
    //Có nhiều @Test ứng với nhiều CASE khác nhau
    @Test
    public void testGetFatorialGivenRightArgumentReturnsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        
        //hàm so sánh ACT và EXP có giống nhau hay không (đúng = xanh, sai = đỏ)
        Assert.assertEquals(expected, actual);
        
        //so sánh nhiều case cho ra kết quả tốt khác
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
    }
    
    //Hàm GetF() cho 2 trường hợp
    //input đúng [1..20] - tính đúng được n! - done
    //input sai <0, >20 - thiết kế hàm xuất ra ngoại lệ
    //rất mong xuất ra ngoại lệ khi n<0 || n>20
    //nếu N<0 N>20 -> ra ngoại lệ -> hàm đúng như kì vọng thiết kế(xanh)
    //nếu N<0 N>20 -> ko ra ngoại lệ -> hàm sai như kì vọng thiết kế(đỏ)
    
    //Test Case: n = -5 -> Expected: IllegalArgumentException
    //Ngoại lệ, bất thường không thể đo lường trên value
    //chỉ có thể đo lường bằng cách xem chúng có xuất hiện hay không
    //assertEqual() là so sánh 2 value nên không thể sử dụng trong tình huống này
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFatorialGivenWrongArgumentReturnsThrowException(){
        MathUtil.getFactorial(-5); //kì vọng trả về ngoại lệ NumberFormat...
    }
    
    //Trả về đỏ (Sai) do n = -5 không thuộc khoảng 0 - 20
    //Sai do không có trả về Ngoại Lệ
//    @Test//(expected = IllegalAccessError.class)
//    public void testGetFatorialGivenWrongArgumentReturnsThrowException(){
//        MathUtil.getFactorial(-5); //kì vọng trả về ngoại lệ NumberFormat...
//    }
    
    //màu đỏ (sai) do không phải ngoại lệ như kỳ vọng (người viết kỳ vọng sai)
//    @Test(expected = NumberFormatException.class)
//    public void testGetFatorialGivenWrongArgumentReturnsThrowException(){
//        MathUtil.getFactorial(-5); //kì vọng trả về ngoại lệ NumberFormat...
//    }
    
    
    //Một cách viết khác để bắt ngoại lệ
    
    //Cách 2: sử dụng lambda
    //test case: hàm sẽ trả về ngoại lệ với n = 21 -> trả về màu xanh (logic hàm đúng)
    @Test
    public void testGetFatorialGivenWrongArgumentReturnsThrowException_LambdaVersion(){
        
//        Assert.assertThrows(tham số 1: ngoại lệ muốn so sánh,
//                            tham số 2: đoạn code chạy để đưa ra ngoại lệ đó)
        Assert.assertThrows(IllegalArgumentException.class, 
                            () -> MathUtil.getFactorial(-5));
        //MathUtil.getFactorial(-5); //kì vọng trả về ngoại lệ 
    }
    
    //Cách 3: Try Catch
    @Test
    public void testGetFatorialGivenWrongArgumentReturnsThrowException_TryCatch(){
        
//        Chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //Code trả về có ngoại lệ nhưng chưa rõ có đúng ngoại lệ mà ta kỳ vọng hay không
            //Cần thêm code để kiểm soát ngoại lệ trả về đúng như ta mong muốn
            Assert.assertEquals("Invalid argument. N must be between 0 and 20", e.getMessage());
        } 
    }
}
