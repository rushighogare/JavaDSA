//Upper bound - smallest index such as arr[index]>target

package BinarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter target for upper bound: ");
        int target=Integer.parseInt(sc.nextLine());

        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        System.out.println("Enter numbers in array: ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        int ans=solveByBinarySearch(target, arr);
        System.out.println("Upper Bound for given target is: "+ans);
    }

    public static int solveByBinarySearch(int target, int arr[]){
        int ans=arr.length; 
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>target){    //only this condition is different in upper and lower bound, rest all is same
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return ans;
    }
}
