package class1;

import java.util.Scanner;
//机票价格计算
public class test1  {
    static void main() {
        //1.键盘录入机票原价，月份，头等舱经济舱
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的仓位：0.头等，1.经济舱");
        int seat = sc.nextInt();
        //2.先判断月份是淡季还是旺季
        if (month >= 5 && month <= 10){
            //3.继续判断当前机票是经济舱还是头等舱
            if (seat == 0) {
                ticket = (int) (ticket * 0.9);
            } else if (seat == 1) {
                ticket = (int) (ticket * 0.85);
            } else {
                System.out.println("没有这个舱位");
            }
            //旺季
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            if (seat == 0) {
                ticket = (int) (ticket * 0.7);
            } else if (seat == 1) {
                ticket = (int) (ticket * 0.65);
            } else {
                System.out.println("没有这个舱位");
            }
            }
            //淡季
         else {
            System.out.println("键盘录入的月份不合法");
        }
        //4.根据实际情况算出对应的价格
        System.out.println(ticket);
    }
//    public static int getPrice(int ticket,int seat,double v0,double v1){
//        if (seat==0){
//            ticket =(int) (ticket*v0);
//        }else if (seat ==1){
//            ticket =(int) (ticket*v1);
//        }else {
//            System.out.println("没有这个舱位");
//        }
//        return ticket;
//    }
}
