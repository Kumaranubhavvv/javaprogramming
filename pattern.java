// public class pattern {
//     public static void main(String args[]){
//         for(int line=1;line<=4;line++){
//             //one line
//             for(int star=1;star<=line;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
         
//         }
//     }



//print inverted pattern
// public class pattern {
//     public static void main(String args[]) {

//         int n = 7;

//         for(int line = 1; line <= n; line++) {

//             for(int star = 1; star <= n-line+1; star++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }



//print half-pyramid pattern
// public class pattern {

//     public static void main(String args[]){
//         int n=4;
//         for(int line=1;line<=n;line++){
//             for(int number=1;number<=line;number++){
//                  System.out.print(number);
//             }
//             System.out.println();
//         }
//     }
// }

//print characeristics pattern

// public class pattern{
//     public static void main (String args[]){
//         int n= 4;
//         char ch= 'A';
//         for(int line=1;line<=n;line++){
//             for(int chars=1; chars<=line;chars++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }


//print a hollow rectangle
// public class pattern{
//     public static void hollow_rectangle(int totRows,int totCols){
//         for(int i=1;i<=totRows;i++){
//             for(int j=1;j<=totCols;j++){
//                 if(i==1||i==totRows||j==1||j==totCols){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String args[]){
//         hollow_rectangle(4,5);
//     }
// }

public class pattern {
    public static void inverted_rotated_half_pyramid(int n) {
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_rotated_half_pyramid(7);
    }
}


