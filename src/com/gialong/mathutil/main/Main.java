/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gialong.mathutil.main;

import com.gialong.mathutil.core.MathUtil;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args){
        //Thử nghiệm hàm tính giải thừa coi đúng như thiết kế hay không
        //ta phải đưa ra các tình huống sử dụng trong thực tế
        //vd: -5 coi tính được hay ko
        //0
        //20
        //21
        //TEST CASEL: Một tình huonsg hàm/app/màn hình/tính năng được đưa vào sử dụng
        //giả lập hành vi xài của ai đó
        //TC: là một tình huống sử dụng, xài app hay hàm mà nó bao gồm:
        //INPUT: Data đầu vào cụ thể nào đó
        //OUTPUT: Đầu ra úng với xử lí của hàm/chức năng của app, dĩ nhiên dùng đầu vào để xử lí
        //KÌ VỌNG: mong hàm sẽ trả về value ứng với input
        //so sánh kì vọng - kết quả
        
        long expected = 120; //kì vọng chạy tính 5 giai thừa
        int n = 5; //input số giai thừa
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }    
}
