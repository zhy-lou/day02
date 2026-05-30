package demo1;

public class practice01 {
    static void main() {
//        for (int i = 1;i<=100;i++){
//            if (i%10 ==7||i /10%10== 7||i % 7==0){
//                System.out.println("过");
//                continue;
//            }
//            System.out.println(i);
//        }
        compare(10,20);
    }

    static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }

    static void compare(short s1, short s2) {
        System.out.println(s1 == s2);
    }

    static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
    }

    static void compare(long l1, long l2) {
        System.out.println(l1 == l2);
    }
}

