// public class practice {
//     public static void main(String args[]){
//         int a =10;
//         int b=5;
//         System.out.println(a);
//         System.out.println(b);
//         String name= "Tony Stark";
//         System.out.println(name);

//     }
    
// }



//print sum of two numbers
// public class practice {

//     public static void main(String args[]){
//         int a= 10;
//         int b= 5;
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }

//sum of two numbers using input from user 
// import java.util.*;

// public class practice{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int sum = a+b;
//         System.out.println(sum);
//     }
// }

//product of numberer
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int a = sc.nextInt();
//         int b= sc.nextInt();
//         int product =a*b;
//         System.out.println(product);
//     }
// }


//area of circle
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         float rad = sc.nextFloat();
//         float area=3.14f*rad*rad;
//         System.out.println(area);
//     }
// }


//loops
//print hello world using while loop 
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int counter =0;
//         while (counter<100){
//             System.out.println("hello world");
//             counter++;
//         }
//         System.out.println("printer HW 100x"); 
//     }
// }

//print number from 1 to 10

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int counter=1;
//         while(counter<=10){
//             System.out.println(counter);
//             counter++;
//         }
//     }
// }




//print number from 1 to n
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int range= sc.nextInt();
//         int counter=1;
//         while(counter<=range){
//             System.out.print(counter+ "");
//             counter++;
//         }
//         }
//     }


//print sum of  first n natural number
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();
//         int sum=0;
       

//         int i=1;
//        while(i<=n){
//         sum+=i;
//         i++;
//        }
//     System.out.println("sum is :"+ sum);
//     }
// }


// for loop
//  import java.util.*;
//  public class practice{
//     public static void main(String args[]){
//         for(int i=1;i<=10;i++){
//             System.out.println("hello world");
          
//         }
//     }
//  }

//pattern print 
// import java.util.*;
// public class practice{
//     public static void main(String args []){
//         for(int line=1;line<=4;line++){
//         System.out.println("****");
//         }
//     }
// }

//reverse print
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int n = 123456;
//         while(n>0){
//             int lastDigit=n%10;
//             System.out.print(lastDigit);
//             n=n/10;
        
//         }
//         System.out.println();
//     }
// }


// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int n = 347234;
//         int rev = 0;
//         while(n>0){
//             int lastDigit=n%10;
//             rev=(rev*10)+lastDigit;
//             n=n/10;
//         }
//         System.out.println(rev);

//     }
// }

//do while
// import java.util.*;
// public class practice{
//     public  static void main(String args[]){
//         int counter=1;
//         do{
//             System.out.println("hello World");
//             counter++;
//         }while(counter<=10);
        
//         }
//     }


// break statement 
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         for(int i=1;i<=5;i++){
//             if(i==3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.print("i am out of the loop");
//     }
// }

//elgible for vote 
// import java.util.*;
// public class practice{
// public static void main(String args[]){
//     int age=22;
//     if(age>=18){
//         System.out.println("adult:drive,vote");
//     }
//     else{
//         System.out.println("not adult");
//     }
//  }
// }


//largest of two numbers
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int A=17;
//         int B=5;

//         if(A>=B){
//             System.out.println("A is largest of 2");
//         }else{
//             System.out.println("Bis largest of 2");
//         }
//     }
// }

//even or odd
// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if(number%2==0){
//             System.out.println("Even");
//         }else{
//             System.out.println("odd");
//         }
//     }
// }


//check wheather number is even or odd./**

// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number:");
//         int num = sc.nextInt();

//         if(num>0){
//             System.out.println("positive number:");
            
//         }else if(num<0){
//                 System.out.println("negative number");
//             }else{
//                 System.out.println("Zero");
//             }

//             sc.close();
//         }
//     }





//***********************************************function******************************************************************************************************************************************************
// import java.util.*;
// public class practice{

//     public static void calculateSum(){
//      Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int sum = a+b;
//         System.out.println("sum is:"+sum);   
//     }
//     public static void main(String[] args) {
//        calculateSum();
//     }
// }





// import java.util.*;
// public class practice{
//     public static int  calculateSum(int num1,int num2){
//         int sum = num1+num2;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int  sum = calculateSum(a,b);
//         System.out.println("sum is : "+sum);
//     }
// }


//**************************call by value */
// import java.util.*;
// public class practice {

//     public static void swap(int a, int b){
//         //swap
//         int temp=a;
//         a=b;
//         b=temp;

//         System.out.println("a=" + a);
//         System.out.println("b="+ b);
//     }
//     public static void main(String args[]){
//         int a=5;
//         int b= 10;
//         swap(a,b);
//     }
// }


//product of two number 
//import java.util.*;
// public class practice{
//     public static int  multiply(int a,int b){
//         int product =a*b;
//         return product;
//     }
//     public static void main(String args[]){
//         int a =3;
//         int b= 5;
//         int prod=multiply(a,b);
//         System.out.println("a*b="+prod);
//     }
// }
        
// factorial of a number 
// import java.util.*;
// public class practice{
//     public static int factorial(int n){
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         return f;
//     }
//     public static void main(String args[]){
//         System.out.println(factorial(4));
//     }
// }


// check wheather a number is prime or not 
//import java.util.*;
// public class practice{
//    public static boolean isPrime(int n){
//     boolean isPrime= true;
//     for(int i=2;i<=n-1;i++){
//         if(n%i==0){
//             isPrime=false;
//             break;
//         }
//     }
//     return isPrime;
//    } 
//    public static void main(String args[]){
//     isPrime(5);
//    }
// }

//optimised approach
// import java.util.*;

// public class practice{

//     public static boolean isPrime(int n) {

//         if (n < 2) {
//             return false;
//         }

//         if (n == 2) {
//             return true;
//         }

//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String args[]) {

//         System.out.println(isPrime(2));
        

//     }
// }


//prime no in ranges
// import java.util.*;
// public class practice{
//     public static boolean isPrime(int n){
//         if(n<2){
//             return false;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void PrimeInRange(int n){
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)){
//                 System.out.println(i+"");
//             }

//             }
//             System.out.println();
//         }
//             public static void main(String args[]){
//                 PrimeInRange((20));
//             }
//         }
        
// import java.util.*;
// public class practice{
//     public static  decToBin(int n){
//         int binary[]=new int [n];
//         int index=0;
//         while(n>0){
//             binary[index]=n%2;
//             n=n/2;
//             index++;
//         }
//         System.out.print("binary Number=");
//         for(int i= index-1;i>=0;i--){
//             System.out.println("binary Number[i]");
//         }
//         System.out.println();

//     }
//     public static void main(String[]args){
//         Scanner sc =new Scannner(System.in);
//         System.out.print("enter decimal Number:");
//         int n= sc.nextInt(n);
//         decToBin(n);
//         sc.close();

//     }
// }



// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         int marks[]=new int[100];
//         Scanner sc =new Scanner(System.in);

//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();

//         System.out.println("phy:"+marks[0]);
//         System.out.println("chem:"+ marks[1]);
//         System.out.println("maths:"+ marks[2]);

//     }
// }


//bubble Sort
// import java.util.*;

// public class BasicSorting {

//     public static void bubbleSort(int arr[]) {

//         for (int turn = 0; turn < arr.length - 1; turn++) {

//             for (int j = 0; j < arr.length - 1 - turn; j++) {

//                 if (arr[j] > arr[j + 1]) {

//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                 }
//             }
//         }
//     }

//     public static void PrintArr(int arr[]) {

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String args[]) {

//         int arr[] = {5, 4, 1, 3, 2};

//         bubbleSort(arr);
//         PrintArr(arr);

//     }
// }


//SELECTION SORT



import java.util.*;

public class SelectionSort {

    public static void SelectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = {5, 4, 1, 3, 2};

        SelectionSort(arr);
        PrintArr(arr);
    }
}
