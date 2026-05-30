package demo2;

public class text3 {
    static void main() {
        int[]arr ={1,4,5,6,7,8,67};

      boolean flag=  contains(arr,8);
        System.out.println(flag);
    }
    public static boolean contains(int[]arr,int number){
        for (int i = 0;i< arr.length;i++){
            if (arr[i]== number){
              return true;
            }
        }
        return false;
    }
}
