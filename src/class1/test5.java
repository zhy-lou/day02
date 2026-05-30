package class1;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        int[] scoreArr = getScores();
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(scoreArr[i]);
        }
        int max = getMax(scoreArr);
        int min = getMin(scoreArr);
        int sum = getSun(scoreArr);
        int avg = (sum - max - min) / (scoreArr.length - 2);
        System.out.println("选手的最终得分为: "+avg);
    }


    public static int getSun(int[]scoreArr){
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum +scoreArr[i];
        }
        return sum;
    }

    //求数组的最大值
    public static int getMax(int[] scoreArr) {
        int max = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (max > scoreArr[i]) {
                max = scoreArr[i];
            }
        }
        return max;
    }

    //求数组的最小值
    public static int getMin(int[] scoreArr) {
        int min = scoreArr[0];
        for (int i = 1; i < scoreArr.length; i++) {
            if (min < scoreArr[i]) {
                min = scoreArr[i];
            }
        }
        return min;
    }

    //数组记录评委的打分
    public static int[] getScores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，继续录入");
            }
        }
        return scores;
    }
}