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

// import java.util.*;
// public class StringDemo{
//     public static void printLetters(String str){
//         for(int i=0;i<str.length();i++){
//             System.out.print(str.charAt(i)+ " ");
//         }
//         System.out.println();
//     }
//     public static void main (String args[]){
//     String firstName="abhinav";
//     String lastName="kumar";
//     String fullName= firstName+" "+lastName;

//     printLetters(fullName);
//     }
// }


// import java.util.*;
// public class StringDemo{
//     public static float getShortestPath(String path){
//         int x=0,y=0;

//         for(int i=0;i<path.length();i++){
//             char dir=path.charAt(i);
//             //south
//             if(dir=='s'){
//                 y--;
//             }
//             //west
//             else if(dir=='w'){
//                 x--;
//             } 
//             //east
//             else{
//                 x++;
//             }
//             }
//             int x2=(x*x);
//             int y2=(y*y);
//             return (float) Math.sqrt(x2+y2);
//         }
//         public static void main(String args[]){
//             String path="WNEENESENNN";
//             System.out.println(getShortestPath(path));

//         }

//         }


// import java.util.*;
// public static void main (String args[]){
//     String s1="Anubhav";
//     String s2="Anubhav";
//     String s3=new String("Anubhav");

//     // if(s1==s2){
//     //     System.out.println("String are equal");

//     // }else{
//     //     System.out.println("String are not equal");
//     // }
//     // if(s1==s3){
//     //     System.out.println("String are equal");
//     // }else{
//     //     System.out.println("String are not equal ");
//     // }

//     if(s1.equals(s3)){
//         System.out.println("String are equal");
//     }else{
//         System.out.println("String are not equal");

//     }

// }



// import java.util.*;

// public class StringDemo {

//     public static String sUBString(String str, int si, int ei) {

//         String substr = "";

//         for (int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }

//         return substr;
//     }

//     public static void main(String args[]) {

//         String str = "Hello World";

//         System.out.println(sUBString(str, 0, 5));
//     }
// }


import java.util.*;
public class StringDemo{
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];

        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);

    }
}




