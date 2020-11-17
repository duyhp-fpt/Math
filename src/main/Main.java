/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fu.util.MathUtility;

/**
 *
 * @author Huynh Duy
 */
public class Main {
    public static void main(String[] args) {
        //2. test hàm = mắt
        System.out.println("5!: " + MathUtility.getFactorial(5));
        //                  expected: 120,      actual:
        //tao hy vọng mày ói về 120 khi tao gọi mày hàm giai thừa ấy
        
        //và test bộ data khác, test case, tình huống khác
        System.out.println("0!: " + MathUtility.getFactorial(0));
        //                  e: 1, a: 1 --> okie
        
        //e: ném về vùng ngoại lệ IllegalArgumentException nếu giai thừa -5
        System.out.println("-5!: " + MathUtility.getFactorial(-5));
    }
    //Code viết ra thì Developer phải test trước cái đã
    //có vài hình thwucs test code khác nhau
    //1. TDD, Test Driven Developer
        //Viết dàn khung cho hàm getFactorial(int n)
        //Sau đó dựng hàm test()
        //chạy thử coi xanh đỏ, đỏ nghĩa là lỗi, xanh nghĩa là ổn
        //cứ liên tục xanh đỏ như thế trong quá trình viết code
        //và sửa code, người ta gọi là lập trình hương theo thõa mãn việc test, TDD
    //2. sout(hàm kèm data) để coi kết quả ra sao, có đúng như mình kì vọng
        //nó phải trả về như thề hay không --> xem kết quả test = mắt
    //3. JOtionPane của bên javaDesktop để group để popup kết quả lên màn hình
        //vẫn xem bằng mắt
    //4. Viết 1 trang web gọi hàm xử lí..., hao sức quá
    
    //ta chơi cách 1 và 2
}
