package class1;

import java.util.Random;

public class test3 {
    static void main(String[] args) {
//        定义方法实现随机产生一个五位数的验证码
//        验证码格式：
//        长度为5
//        前四位是大写或小写字母
//        最后一位是数字
        char[]chs =new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        String result ="";
        Random r =new Random();
        for (int i = 0; i < 4; i++) {
            int radomIndex = r.nextInt(chs.length);
           result= result + chs[radomIndex];
        }
        int number = r.nextInt(10);
        result =result +number;
        System.out.println(result);
    }
}

