package BinarySearch;

import java.util.Scanner;

public class CountOccurences {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter target: ");
        int target=Integer.parseInt(sc.nextLine());

        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        int ans = countOccurencesByBinarySearch(arr, target);
        System.out.println("Occurences: "+ans);
    }

    public static int countOccurencesByBinarySearch(int arr[], int target){
        int first=findFirstOccurence(arr, target);
        if(first==-1) return 0;  //if first occurence is not found means target is not present in array

        int last=findLastOccurence(arr, target);
        return last-first+1;
    }

    public static int findFirstOccurence(int arr[], int target){
        int first=-1;
        int start=0, end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return first;
    }

    public static int findLastOccurence(int arr[], int target){
        int last=-1;
        int start=0, end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target){
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return last;
    }
}
