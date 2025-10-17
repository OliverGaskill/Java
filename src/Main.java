import java.util.Scanner;

 class Main {
     static void main(String[] args) {



         Scanner sc = new Scanner(System.in);

         System.out.print("Enter age: ");
         int age = sc.nextInt();

         if(age >= 18 ){
             System.out.println("An adult doofus");

         } else if (age <= 0) {
             System.out.println("ain't born");


         } else{
             System.out.println("ur a kid");
         }


    }
}