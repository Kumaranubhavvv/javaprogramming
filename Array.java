// import java.util.*;
// public class Array{
//     public static void main(String args[]){
//         int marks[]=new int [100];

//         Scanner sc = new Scanner(System.in);

//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();

//         System.out.println("phy: " + marks[0]);
//         System.out.println("chem: "+ marks[1]);
//         System.out.println("math :" + marks[2]);


//         marks[2]=100;
//         System.out.println("math: "+ marks[2]);

//         // to calculate percentage
//         int percentage=(marks[0]+marks[1]+marks[2])/3;
//         System.out.println("percentage= "+ percentage + "%");

//         // to calculate the length of array
//         System.out.println("length of array= "+marks.length);
//     }
// }



// import java.util.*;
// public class Array{
//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[]={97,98,99};//marks update due to call by reference
//         update(marks);
    
//     //print our marks

//     for(int i=0;i<marks.length;i++){
//         System.out.print(marks[i]+" ");
//     }
//     System.out.println();
// }
// }


//linear search

// import java.util.*;
// public class Array {
//      public static int linearSearch(int numbers[],int key){
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                 return i;

//             }
//         }
//         return -1;
//      }
//      public static void main(String args[]){
//         int numbers[]={2,4,6,8,10,12,14,16};
//         int key=10;

//         int index=linearSearch(numbers,key);
//         if(index==-1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("key is at index:" + index);
//         }

//      }

//   }

//largest of a number 
// import java.util.*;
// public class Array{
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

// smallest  numbers
//  import java.util.*;
// public class Array{
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



//binary search
// import java.util.*;
// public class Array {

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


//reverse  an array
// import java.util.*;
// public class Array{
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



//pairs in an array
// import java.util.*;
// public class Array{
//     public static void printPairs(int numbers[]){
//         for(int i=0;i<numbers.length;i++){
//             int curr=numbers[i];//2,4,6,8,10
//             for(int j=i+1;j<numbers.length;j++){
//                 System.out.print("(" + curr +"," + numbers[j]+ ")");
//             }
//             System.out.println();
//         }

//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         printPairs(numbers);
//     }

// }

//print subarray
// import java.util.*;
// public class Array{
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
    


//calculatal total
// import java.util.*;
// public class Array{
//     public static void printSubarrays(int numbers[]){
//         int ts=0;
//         for(int i=0;i<numbers.length;i++){
//           int start=i;
//             for(int j=i;j<numbers.length;j++){
//                 int  end=j;

//                 for(int k=start;k<=end;k++){//print
//                     System.out.print(numbers[k]+ " ");//subarrays
//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//       System.out.println("total subarrays=" + ts);
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         printSubarrays(numbers);
//     }

// }



//max subarray sum
// import  java.util.*;
// public class Array{
//     public static void maxSubarraySum(int numbers[]){
//         int currSum=0;
//         int maxSum =Integer.MIN_VALUE;

//         for(int i=0;i<numbers.length;i++){
//             int start=i;
//             for (int j=i;j<numbers.length;j++){
//                 int end = j;
//                 currSum =0;

//                 for(int k=start;k<=end;k++){
//                     currSum+=numbers[k];
//                 }
//                 if(maxSum<=currSum){
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);

//     }
//      public static void  main(String args[]){
//         int numbers[]={2,4,6,8,10};

//         maxSubarraySum(numbers);
//      }
// }

//calculate prefix array
// import java.util.*;
// public class Array{
//     public static void maxSubarraySum(int numbers[]){
//         int currSum=0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//         prefix[0]= numbers[0];
         

//          //calculate prefix array
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix [i-1] + numbers[i];
//         }

//         for(int i=0;i<numbers.length;i++){
//             int start=i;
//             for(int j=i;j<numbers.length;j++){
//                 int end =j;

//                 currSum= start==0 ?prefix[end]: prefix[end]-prefix[start-1];
//                 if(maxSum< currSum){
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String args[]){
//         int numbers[]={1,-2,6,-1,3};
//         maxSubarraySum(numbers);
//     }
// }


//kadanes 
// import java.util.*;
// public class Array{
//     public static void kadanes(int numbers[]){
//         int ms= Integer.MIN_VALUE;
//         int cs=0;

//         for(int i=0;i<numbers.length;i++){
//             cs = cs+numbers[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(cs,ms);
//         }
//         System.out.println("our max Subarray sum is :" + ms);
//     }
//     public static void main(String args[]){
//         int numbers[]={-2,-3,-4,-1,-2,-1,-5,-3};
//         kadanes(numbers);
//     }
// }

import java.util.*;
public class Array{
    public static int trappedRainwater(int height[]){
        int n= height.length;

        //calculate left max boundary-array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary-array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedRainwater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel=min(leftmax bound,rightmax bound)
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            //trappedWater=waterlevel-height[i]
            trappedRainwater+=waterlevel-height[i];
        }
        return trappedRainwater;

    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}