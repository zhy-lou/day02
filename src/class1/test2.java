package class1;
//质数的判断
public class test2 {
    static void main(String[] args) {
        int count =0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < 100; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
                if (flag) {
                    System.out.println("当前数字"+i+"是质数");
                    count++;
                } else {
                    System.out.println("当前数字"+i+"不是一个质数");
                }
            }
        System.out.println("打印的质数为："+count);

//        int i = 7;
//        boolean flag = true;
//        for (int j = 2; j < 100; j++) {
//            if (i % j == 0) {
//                flag = false;
//                break;
//            }
//            if (flag) {
//                System.out.println("当前数字是质数");
//            } else {
//                System.out.println("当前数字不是一个质数");
//            }
//        }
        }
    }
