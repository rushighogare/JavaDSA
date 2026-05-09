//the index in rotated array which have minimum number is the count of rotation of array

package BinarySearch;

import java.util.Scanner;

public class RotationCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        sc.close();

        int ans=countRotationByBinarySearch(arr);
        System.out.println("The array is rotated "+ans+" times");
    }

    public static int countRotationByBinarySearch(int arr[]){
        int minElement=Integer.MAX_VALUE;
        int minElementIndex=-1;
        int start=0, end=arr.length-1;
        

        //same code which is used to find min element in rotated sorted array. The minor change we have to return index here.
        while(start<=end){
            int mid=start+(end-start)/2;
            

            //check if left half is sorted
            if(arr[start]<=arr[mid]){
                //if left half is sorted then lowest element for that half will always 'start' 
                if(arr[start]<minElement){
                    minElement=arr[start];
                    minElementIndex=start;
                }

                start=mid+1;
            }
            else{
                //if right half is sorted then lowest element for that half will alwasy 'mid' or 'left to the mid'
                if(arr[mid]<minElement){
                    minElement=arr[mid];
                    minElementIndex=mid;
                }

                end=mid-1;
            }
        }

        return minElementIndex;
    }
}
