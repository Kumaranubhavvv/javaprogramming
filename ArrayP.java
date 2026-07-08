//reverse  an array


   
// import java.util.*;
// public class ArrayP {

//     public static  void reverse(int numbers[]){
//         int first=0,last=numbers.length-1;

//         while(first<last){
//             int temp=numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first]=temp;

//             first++;
//             last--;
//         }
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         reverse(numbers);
//         for(int i=0;i<numbers.length;i++){
//             System.out.println(numbers[i]+" ");
//         }
//         System.out.println();
//     }
// } 



//binary search
// import java.util.*;
// public class ArrayP {

//     public static int binarySearch(int numbers[],int key){
//         int start=0,end=numbers.length-1;

//         while(start<=end){
//             int mid= (start + end)/2;

//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){
//                 start=mid+1;
//             } else{
//                 end=mid-1;
//             }
//         }
//         return-1;
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10,12,14};
//         int key=10;

//         System.out.println("index for key is :" + binarySearch(numbers, key));
//     }
// }


// smallest  numbers
//  import java.util.*;
// public class ArrayP{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0;i<numbers.length;i++){
        
//             if(largest<numbers[i]){
//                 largest=numbers[i];
//             }
            
//             if(smallest>numbers[i]){
//                 smallest=numbers[i];
//             }
//         }
//         System.out.println("smallest value:"+ smallest);
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[]={1,2,6,3,5};
//         System.out.println("largest value is:"+ getLargest(numbers));

//     }
// }

//largest of a number 
// import java.util.*;
// public class ArrayP{
//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest=numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[]={1,2,6,3,5};
//         System.out.println("largest value is:"+ getLargest(numbers));

//     }
// }


//print subarray
// import java.util.*;
// public class ArrayP{
//     public static void printSubarrays(int numbers[]){
//         for(int i=0;i<numbers.length;i++){
//           int start=i;
//             for(int j=i;j<numbers.length;j++){
//                 int  end=j;

//                 for(int k=start;k<=end;k++){//print
//                     System.out.print(numbers[k]+ " ");//subarrays
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         printSubarrays(numbers);
//     }

// }
