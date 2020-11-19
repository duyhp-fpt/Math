package fu.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huynh Duy
 */
public class MathUtility {

    // class này chứa các hàm tiện ích dùng chung cho mọi nơi
    //do đó nó phải nên là static
    public static final double PI = 3.1415;

    //hàm tính n giai thừa, n>=0 && n<=20
    //nếu quá 20 tràn kiểu long
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("n must be >= 0 & <= 20");
//        if(n==0||n==1)
//            return 1;//0! = 1! = 1
//        //sống sót đến đây, thì n > 1 và <= 20 rồi
//       long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be >= 0 & <= 20");
        }
        if (n == 0 || n == 1) {
            return 1;//0! = 1! = 1
        }
        return n * getFactorial(n - 1);// đệ quy đó em
                                       // gọi lại mình với quy mô nhở hon
        //5! = 5 * 4!
        //4! = 4 * 3!
        // ...
        //2! = 2 * 1! (dừng)
        //n! = n * (n - 1)!
    }

}
