package class1;

public class test6 {
    static void main() {
        int[]arr = {0,1,2,2,3,0,4,2};
        int val =2;

        int slow =0;
        int fast =0;
        while (fast< arr.length){
            if (arr[fast] != val){
                arr[slow]=arr[fast];
            slow++;
            }
            fast++;
        }
        for (int i = 0; i < slow; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("有效个数有："+slow);
    }
}
