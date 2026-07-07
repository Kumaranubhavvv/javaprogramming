// import java.util.*;

// public class StringDemo {
//     public static void main(String args[]) {

//         char arr[] = {'a', 'b', 'c', 'd'};

//         String str1 = "abcd";
//         String str2 = new String("XYZ");

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();

//         System.out.println("Your name is: " + name);

//         System.out.println("str1 = " + str1);
//         System.out.println("str2 = " + str2);

//         sc.close();
//     }
// }


// to print  particular character in string
// import java.util.*;
// public class StringDemo{
//    public static void main (String args[]){
//     String firstName="abhinav";
//     String lastName="kumar";
//     String fullName= firstName+" "+lastName;
//     System.out.println(fullName.charAt(1));
//    } 
// }


// to print  all  character in string

import java.util.*;
public class StringDemo{
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
    String firstName="abhinav";
    String lastName="kumar";
    String fullName= firstName+" "+lastName;

    printLetters(fullName);
    }
}