package demo2;

public class test4 {
    static void main() {
        int[]arr ={1,2,3,4,5,6,7,8,9};
        int[] copy = copyOfRange(arr,3,8);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+" ");
        }
    }

    static int[] copyOfRange(int []arr,int from,int to) {
        int[] arr2 = new int[to - from];
        int index =0;
        for (int i = from; i < to; i++) {
            arr2[index] =arr[i];
            index++;
        }
        return arr2;
    }
}
