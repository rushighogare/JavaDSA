//MergeSort - Divide and merge by sorting 

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }
        sc.close();

        mergeSort(arr, 0, size-1);

        System.out.println("Sorted array is: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //for dividing array
    public static void mergeSort(int arr[], int low, int high){
        if(low>=high) return ;   //it means array is divided till last and only single element is remaining
        
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);  //divided left half
        mergeSort(arr, mid+1, high);    //divided right half
        
        //now merge them
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high){
        ArrayList<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }

        //if left array elements are remaining
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }

        //if right array elements are remaining
        while(right<=high){
            list.add(arr[right]);
            right++;
        }

        //shift it to original array (because always we wanted to merge it from low to high and not from 0 because it will overwrite previous values of original array)
        for(int i=low; i<=high; i++){
            arr[i]=list.get(i-low);
        }
    }
}
