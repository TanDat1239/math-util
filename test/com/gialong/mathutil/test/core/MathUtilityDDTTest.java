/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.gialong.mathutil.test.core;

import com.gialong.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author admin
 */


//câu lệnh của JUnit báo hiệu phải Loop qua data 
//nhồi data expected/input vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilityDDTTest {
    
    //trả về mãng 2 chiều nhiều cặp expeced/input
    @Parameterized.Parameters //dùng để tham số hóa
                              //JUnit sẽ ngầm hiểu và chạy loop trong mãng để lấy từng dòng/cặp data
                              //Tên ko quan trọng, quan trọng là @, Parameters là mãng, Parameter là với từng cặp
    public static Object[][] initData(){
        return new Integer[][]{
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720},
        };
    }
    
    @Parameterized.Parameter(value = 0) //value = 0 map với giá trị mảng
    public int n; //biến được map với value (cột 0 của mãng)
    
    @Parameterized.Parameter(value = 1)
    public long expected; //biến map với expected (cột 1 của mảng)
    
    
    @Test
    public void testGetFatorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
