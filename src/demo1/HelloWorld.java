package demo1;

public class HelloWorld {
     static void main() {
         int x =123454321;
         int temp = x;
         int num = 0;
         while (x != 0){
             int ge = x % 10;
             x = x/10;
             num = num*10 +ge;
         }
         System.out.println(num);
         System.out.println(num == temp);

     }
}

