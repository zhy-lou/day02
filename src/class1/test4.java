package class1;

public class test4 {
    //把一个数组里的元素复制到新数组里
    static void main() {
        int[] arr = {1, 2, 3, 4, 56, 7};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           newArr[i]=arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
