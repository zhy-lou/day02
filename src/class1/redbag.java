package class1;

import java.util.Random;

public class redbag {
    static void main() {
        int money = 20000;
        int n = 5;
        if (money < n) {
            System.out.println("金额不足");
        } else {
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int myMoney = r.nextInt((money - (n - i)) + 1);
                money = money - myMoney;
                System.out.println("第" + i + "个人，抢到" + myMoney + "分");
            }
            System.out.println("第" + n + "个人，抢到" + money + "分");
        }
    }
}
