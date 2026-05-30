package class1;

import java.util.Random;

public class test8 {
    static void main() {
        int []arr =new int[6];
        Random r =new Random();
        for (int i = 0; i < 1000; i++) {
            int vote = r.nextInt(0,6);
            arr[vote]++;
        }
        for (int i = 1; i < arr.length; i++) {
            System.out.println("第"+ i +"个候选人的得票数是"+arr[i]+"得票率是"+arr[i]*1.0/1000*100+"%");
        }
        //找出最多的票数
        int max =arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("票数最多的是："+max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                System.out.println("第"+ i +"个候选人的得票数是最多的");
            }
        }
        System.out.println("弃票数是："+arr[0]+"弃票率是"+arr[0]*1.0/1000*100+"%");
    }
}
