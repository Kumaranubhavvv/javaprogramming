// import java.util.Scanner;

// public class function {
//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//          System.out.println("Hello World");
//     }
//     public static void calculateSum(int num1,int num2){
//         int sum=num1+num2;
//         System.out.println("sum is:"+ sum);
       
       
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         calculateSum(a,b);
//     }
// }


//call by value
// import java.util.*;
// public class function{
//     public static void printHelloWorld(){
//         System.out.println("Hello World");       
//          System.out.println("Hello World");        
//          System.out.println("Hello World");

//      }
//      public static int calculateSum(int num1,int num2){
//         int sum=num1+num2;
//         return sum;
//  }



//  public static void swap(int a, int b){
//   int temp=a;
//     a=b;
//     b=temp;

//     System.out.println("a="+ a);
//      System.out.println("b="+ b);
  
//  }

//  public static void main(String args[]){
//     //swap-value exchange
//     int a=5;
//     int b= 10;

//    swap(a,b);
    
//  }
// }


//product of a and b
// import java.util.*;
// public class function{
//     public static int multiply(int a,int b){
//         int product =a*b;
//         return product;
//     }
//     public static void main(String args[]){
//         int a= 3;
//         int b=5;
//         int prod=multiply(a,b);
//         System.out.println("a*b="+prod);
//         prod= multiply(10,20);
//         System.out.println("a * b= "+ prod);


//     }
// }


//factorial of a number 
// import java.util.*;
// public class function{
//     public static int factorial(int n){
//         int f=1;

//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         return  f;
//     }
//     public static void main(String args[]){
//        System.out.println( factorial(4));
//     }
// }



//binomial coefficient
// import java.util.*;
// public class function{
//     public static int factorial(int n){
//         int f=1;

//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         return  f;
//     }
//     public static int bincoeff(int n,int r){
//         int fact_n=factorial(n);
//         int fact_r=factorial(r);
//         int fact_nmr=factorial(n-r);

//         int bincoeff=fact_n/(fact_r*fact_nmr);
//         return bincoeff;

//     }
//     public static  void main(String args[]){
//         System.out.println(bincoeff(5, 2));
//     }
// }



//function to add sum of two number
//import java.util.*;
// public class function{
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     //function to add of three numbers
//     public static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//         System.out.println(sum(3,5));
//         System.out.println(sum(5,2,1));
//     }
// }


//print wheather a number is  prime or not
// import java.util.*;
// public class function {

//     public static boolean isPrime(int n){
//         boolean isPrime=true;
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         return isPrime;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(12));
//     }
// }

//checck with optimised approach
// import java.util.*;
// public class function{
//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//        for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             return false;
//         }
//        }
//        return true;

//     }
//     public static void main(String args[]){
//         System.out.println(isPrime(7));
//     }
// }






import java.util.*;

public class Main {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void PrimeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        PrimeInRange(12);
    }
}




