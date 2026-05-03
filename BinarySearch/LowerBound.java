//Lower bound - lower bound is an index such as arr[index]>=target

package BinarySearch;

import java.util.Scanner;

public class LowerBound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter target for lower bound: ");
        int target=Integer.parseInt(sc.nextLine());

        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter numbers in array: ");
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        sc.close();
        
        // int ans=solveByLinear(target, arr);        //brute force
        int ans=solveByBinarySearch(target, arr);    //optimal


        System.out.println("Lower bound for given target is at index: "+ans);
    }

    public static int solveByLinear(int target, int arr[]){
        int ans=arr.length;  //keep initialized a hypothetical value, if target is not present then it will be answer
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=target){
                ans=i;
                break;
            }
        }

        return ans;
    }

    public static int solveByBinarySearch(int target, int arr[]){
        int ans=arr.length;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>=target){    //we may get smaller index in left 
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;   //search in right half
            }
        }

        return ans;
    }
}