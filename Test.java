// public class Test {

//     public static void main(String args[]) {

//         System.out.println("Java Working");
//     }
// }



// import java.util.*;
// public class Test {
//     public static void main(String args[]) {
//        int a = 25;

//         long b = a;

//         System.out.println(b);
//     }
// }

//type casting//

// import java.util.*;
// public class Test {
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         float a = 25.12f;
//         int b = (int) a;
//         System.out.println(b);
//     }
// }


//to convert character to integer

// import  java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         char ch='a';
//         int number=ch;
//         System.out.println(number);
//     }
// }




//character to integer value acc to char 
// import  java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         char ch='a';
//         char ch2='b';
//         int number=ch;
//         int number2=ch2;
//         System.out.println(number);
//         System.out.println(number2);
//     }
// }

//type promotion in expression method 1
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         char a='a';
//         char b='b';
//         System.out.println((int)(b));
//         System.out.println((int)(a));
//         System.out.println(a);
//         System.out.println(b-a);
//     }
// }

// it will convert all float toh float or double 
// import java.util.*;

// public class Test {
//     public static void main(String args[]) {

//         int a = 10;
//         float b = 20.25f;
//         long c = 25;
//         double d = 30;

//         double ans = a + b + c + d;

//         System.out.println(ans);
//     }
// }

//urinary increment
// import java.util.*;
// public class  Test{
//     public static void main(String args[]){
//         int a=10;
//         int b=--a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


//urinary decrement
// import java.util.*;
// public class  Test{
//     public static void main(String args[]){
//         int a=10;
//         int b=a--;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


//conditional statement
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int age=26;
//         if(age>=18){
//             System.out.println("adult:drive,vote");
//         }
//         else{
//             System.out.println("not adult");
//         }
//     }
// }


// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int age=16;
//         if(age>=18){
//             System.out.println("adult:drive,vote");
//         }
//         if(age>13 && age<18){
//             System.out.println("teeneger");
//         }
//         else{
//             System.out.println("not adult");
//         }
//     }
// }



//print largest of  2 number 

// import java.util.*;
// public class Test {

//     public static void main(String args[]){
//         int A=1;
//         int B=5;

//         if(A>=B){
//             System.out.println("A is largest of 2");
//         }else{
//             System.out.println("B is largest of 2");
//         }
//     }
// }



//print if a number is odd or even
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();

//         if(number%2==0){
//             System.out.println("EVEN");
//         }else{
//             System.out.println("ODD");
//         }
//     }
// }

//else if statement
// import java.util.*;
// public class Test {

//     public static void main(String args[]){
//         int age= 23;
//          if (age>=18){
//             System.out.println("adult");

//          }
//           else if(age>=13 && age<18){
//             System.out.println("teenager");
//          }
//          else{
//             System.out.println("child");
//          }
//     }
// }

//INCOME CACULATOR
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int income=sc.nextInt();
//         int tax;

//         if(income<500000){
//             tax=0;
//         }
//         else if(income>=500000 && income<1000000){
//             tax=(int)(income*0.2);
//         }
//         else{
//             tax=(int)(income*0.3);
//         }
//         System.out.println("your tax is:" + tax);
//     }
// }

//print the largest of 3 number
// import java.util.*;
// public class Test{
//     public static  void main(String args[]){
//         int A=1,B=3,C=6;
//         if((A>=B)&&(A>=C)){
//             System.out.println("largest is A");

//         }
//         else if(B>=C){
//             System.out.println("largest is B");

//         }
//         else{
//             System.out.println("largest is C");
//         }
//     }
// }



//Terniary operator
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int number=4;
//         //terniary operator

//         String type=((number%2)==0)?"even":"odd";
//         System.out.println(type);
//     }
// }


// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int marks=67;
//         String reportCard=marks>=33?"PASS":"FAIL";
//         System.out.println(reportCard);
//     }

// }

//switch statement
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int number=2;
//         switch(number){
//             case 1:System.out.println("samosa");
//             case 2:System.out.println("burger");
//             case 3:System.out.println("mango shake");
//             default:System.out.println("we wake up");

//         }
//     }
// }

//break use
// import java.util.*;
//  public class Test{
//      public static void main(String args[]){
//         int number=2;
//         switch(number){
//              case 1:System.out.println("samosa");
//                      break;
//              case 2:System.out.println("burger");
//                      break;
//              case 3:System.out.println("mango shake");
//                      break;
//              default:System.out.println("we wake up");

//         }
//      }
//  }


//  calculator

// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a:");
//         int a=sc.nextInt();
//         System.out.println("enter b:");
//         int b=sc.nextInt();
//         System.out.println("enter operator:");7
//         char operator=sc.next().charAt(0);

//         switch(operator){
//             case '+':System.out.println(a+b);
//                       break;
//             case '-':System.out.println(a-b);
//                        break;
//             case '*':System.out.println(a*b);
//                        break;
//              case '/': System.out.println(a/b);
//                        break;
//             case '%':System.out.println(a%b);
//                        break;
//             default:System.out.println("wrong operator");
            
//         }
//     }
// }


//assignment question
// to check wheather a number is positive or negative


// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();

//         if(x>0){
//             System.out.println("x is greater than 0");
//         }else{
//             System.out.println("x is less or eqaul 0");
//         }
//     }
// }


// import java.util.*;
// public class Test{
//    public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter week number(1-7):");
//     int week=sc.nextInt();

//     switch(week){
//         case 1:
//             System.out.println("Monday");
//             break;
//         case 2:
//             System.out.println("tuesday");
//             break;
//         case 3:
//             System.out.println("Wednesday");
//             break;
//         case 4:
//             System.out.println("thrusday");
//             break;
//         case 5:
//             System.out.println("friday");
//             break;
//         case 6:
//             System.out.println("Saturday");
//             break;
//         case 7:
//             System.out.println("sunday");
//             break;

//         default:
//             System.out.println("invalid input! please enter week between 1-7.");
//     }
//    } 
// }


// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int counter=0;
//         while(counter<100){
//             System.out.println("hello world");
//             counter++;
//         }
//         System.out.println("printed  HW 100x");
//     }
// }


//print number from 1 to 10 using  while loop

// import java.util.*;
// public class Test{
//    public static void main(String args[]){
//     int counter=1;
//     while(counter<=10){
//         System.out.println(counter);
//         counter++;
//     } 
// }


// }


// import java.util.*;
// public class Test{
//    public static void main(String args[]){
//     int counter=1;
//     while(counter<=100){
//         System.out.println(counter+"");
//         counter++;
//     }
//     System.out.println();
// }


// }

//print number from 1 to n
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int range=sc.nextInt();
//         int counter=1;

//         while(counter<=range){
//             System.out.print(counter + " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }


//print the sum of first n natural number
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();


//         int sum=0;
//         int i=1;
//         while(i<=n){
//             sum+=i;
//             i++;
//         }
//         System.out.println("sum is:"+ sum);

//     }
// }

// for loop

// 

// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         for(int line =1;line<=4;line++){
//         System.out.println("****");
//         }
//     }
// }

//print revesse of a number

// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int n=10899;
//         while(n>0){
//             int lastDigit=n%10;
//             System.out.print(lastDigit+"");
//             n=n/10;
//         }
//         System.out.println();
//     }
// }

//print the orginal val by reverse
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         int n=10899;
//         int rev=0;

//         while(n>0){
//             int lastDigit=n%10;
//             rev=(rev*10)+lastDigit;
//             n=n/10;
//         }
//         System.out.println(rev);    }
// }





//do while
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
        
//        int counter=1;
//        do{
//         System.out.println("hello world");
//         counter++;
//        }
//        while(counter<=10);

       
//         }
//           }




//break statement
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
        
//        for(int i=1;i<=5;i++){
//         if(i==3){
//             break;
//         }
//        System.out.println(i);
//     }
//     System.out.println("i am out of the loop");

       
//         }
//   }
// import java.util.*;
// public class Test{
//     public static void main(String args[]){
        
//       for(int i=1;i<=5;i++){
//         if(i==3){
//             continue;
//         }
//         System.out.println(i);
//       }

       
//         }
//   }

//prime or not
// import java.util.*;
// public class Test{
//   public static void main(String args[]){
//     Scanner sc= new Scanner(System.in);
//     int n=sc.nextInt();

//     if(n==2){
//       System.out.println("n is prime");
//     } else{
//       boolean isPrime=true;
//       for(int i=2;i<=n-1;i++){
//         if(n%i==0){
//           isPrime= false;
//         }
//       }
//         if(isPrime ==true){
//           System.out.println("n is prime");

//         }else{
//           System.out.println("n is not prime");
//         }
//     }
//   }
// }


// reads the integer,and then print the sum of even and odd integers
// import java.util.*;

// public class Test {
//     public static void main(String args[]) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         int i = 1;

//         while(i <= n) {
//             sum += i;
//             i++;
//         }

//         System.out.println("sum is: " + sum);

//         if(sum % 2 == 0) {
//             System.out.println("sum is even number");
//         }
//         else {
//             System.out.println("sum is odd number");
//         }
//     }
// }


//print the factorial of a number
import java.util.*;
public class Test{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int factorial=1;

    for(int i=1;i<=n;i++){
      factorial=factorial*i;
    }
    System.out.println("factorial="+ factorial);
  }
}












