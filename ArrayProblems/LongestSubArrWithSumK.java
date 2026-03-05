import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubArrWithSumK {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");

        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        System.out.println("Enter sum K: ");
        int k=Integer.parseInt(sc.next());
        sc.close();

        // solveByBrute(arr, k);
        // solveByBetter(arr, k);    //hashing in hashmap
        solveByOptimal(arr, k);
    }

    //generate every subarray and check for them
    public static void solveByBrute(int arr[], int k){
        int maxLength=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==k){
                    maxLength=Math.max(maxLength, j-i+1);
                }
            }
        }

        System.out.println("The longest subarray with sum K have length: "+maxLength);
    }

    //hashing in hashmap  T.C --> O(NlogN), S.C --> O(N) --> Ordered map
    // T.C --> O(N), S.C --> O(N) unordered map best case
    // T.C --> O(N^2), S.C --> O(N) unordered map worst case
    //it is better solution for array consist only positive and zeroes, it can still be optimized
    //but it is optimal solution if array have positive, zeroes, negative
    public static void solveByBetter(int arr[], int k){

        //store prefix sum and index in it. Index to track the length
        Map<Integer, Integer> mpp=new HashMap<>();

        int maxLength=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==k){
                maxLength=Math.max(maxLength, i+1);
            }
            else if(mpp.containsKey(sum-k)){
                maxLength=Math.max(maxLength, i-mpp.get(sum-k)+1);    
            }
            

            //store only if current sum not exist in array 
            //reason of this exception is (if arr[i]=0)  dry run for [2, 0, 0, 3], if we not followed this check, it will give wrong answer 
            if(!mpp.containsKey(sum)){
                mpp.put(sum, i);
            }
        }

        System.out.println("The longest subarray with given sum K have length: "+maxLength);
    }


    //optimal - 2 pointer approach, only if array consist positive and zeroes
    // T. C --> O(2N), S. C --> O(1)
    public static void solveByOptimal(int arr[], int k){
        int i=0;
        int j=0;
        int sum=arr[0];
        int maxLength=Integer.MIN_VALUE;

        while(i<arr.length && j<arr.length){
            while(i<=j && sum>k){
                sum-=arr[i];
                i++;
            }

            if(sum==k){
                maxLength=Math.max(maxLength, j-i+1);
            }

            j++;   //here you have to increase first and then add that to sum, why? --> [2, 0, 0, 3] dry run this. It will skip ans
            if(j<arr.length) sum+=arr[j];
        }

        System.out.println("The longest subarray with sum K have length: "+maxLength);
    }
}
