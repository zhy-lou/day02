package class1;

import java.util.Random;
import java.util.Scanner;

public class LotteryNumber {
    static void main() {

        int[] lotteryNumber = creatLotteryNumber( );
        printLotteryNumber(lotteryNumber);

        int[] myLotteryNumber = buyLotteryNumber();
        printLotteryNumber(lotteryNumber);

        getWinnerNumber(lotteryNumber,myLotteryNumber);
    }
    //判断arr2里的数据在arr1里出现了几次
    //arr2：用户购买的彩票号码
    //arr1：真正的彩票号码
    public static void getWinnerNumber(int[]arr1,int[]arr2){
        //判断前区中了几个号码
        int count1 = gerCount(arr1,arr2,0,4);
        //判断后区中了几个号码
        int count2 = gerCount(arr1,arr2,5,6);
        System.out.println(count1);
        System.out.println(count2);
    }

    public static int gerCount(int []arr1,int[]arr2,int start,int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            boolean flag = contains(arr2[i], arr1, start, end);
            if (flag) {
                count++;
            }
        }
        return count;
    }


    //用户自主选择一组彩票号码
    public static int []buyLotteryNumber(){
        int[] arr =new int[7];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 5;) {
            System.out.println("请输入第"+(i+1)+"个彩票号码：");
            int number = sc.nextInt();
            if (number<1||number>35){
                System.out.println("当前彩票号码不在范围当中，请重新选择.");
                continue;
            }
            boolean flag = contains(number, arr, 0, 4);
            if (flag){
                System.out.println("当前号码已存在，请重现选择");
                continue;
            }
            arr[i]=number;
            i++;
        }
        for (int i = 0; i < 2;) {
            System.out.println("请输入第"+(i+6)+"个彩票号码：");
            int number = sc.nextInt();
            if (number<1||number>12){
                System.out.println("当前彩票号码不在范围当中，请重新选择.");
                continue;
            }
            boolean flag = contains(number, arr, 5, 6);
            if (flag){
                System.out.println("当前号码已存在，请重现选择");
                continue;
            }
            arr[i +5]=number;
            i++;
        }
        return arr;
    }
    //随机生成一组彩票号码；
    public static int [] creatLotteryNumber(){
        int[] arr =new int[7];
        Random r = new Random();
        //生成前组的数字；
        for (int i = 0; i < 5;) {
            int number = r.nextInt(1,36);
            boolean flag =contains(number,arr,0,4);
            if (!flag){
                arr[i]=number;
                i++;
            }
        }
        //生成后组的数字；
        for (int i = 0; i < 2;) {
            int number = r.nextInt(1,12);
            boolean flag =contains(number,arr,5,6);
            if (!flag){
                arr[i + 5]=number;
                i++;
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();


        return arr;
    }
    //判断生成的数字是否重复；
    public static boolean contains(int number,int[]arr,int start,int end){
        for (int i = start; i <= end;i++ ) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;

    }
    public static void printLotteryNumber(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
