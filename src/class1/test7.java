package class1;

public class test7 {
    static void main() {
        int []arr1={1,3,5,7,9};
        int []arr2={2,4};
        double number = findMedianSortedArrays(arr1,arr2);
        System.out.println(number);

    }
    public static double findMedianSortedArrays(int[]arr1,int[]arr2){
        int[]arr=new int[arr1.length+arr2.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index1 ==arr1.length){
                arr[i]= arr2[index2];
                index2++;
                continue;
            }
            if (index2==arr2.length){
                arr[i] =arr1[index1];
                index1 ++ ;
                continue;
            }
            if (arr1[index1] < arr2[index2]){
                arr[i] =arr1[index1];
                index1 ++ ;
            }else {
                arr[i] =arr2[index2];
                index2 ++ ;
            }

        }

        if (arr.length % 2 ==0){
         int num1 =arr[arr.length/2];
         int num2 =arr[arr.length/2+1];
         return (num1+num2)/2.0;
        }else {
            int num = arr[arr.length/2];
            return num /1.0;
        }


//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");
//        }
    }
}
