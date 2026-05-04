//Floor - largest number in array <= target
//ceil - smallest number in array >= target

package BinarySearch;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter target for floor and ceil: ");
        int target=Integer.parseInt(sc.nextLine());

        System.out.println("Enter size of array: ");
        int size=Integer.parseInt(sc.nextLine());

        int arr[]=new int[size];
        System.out.println("Enter numbers in array: ");
        for(int i=0; i<size; i++){
            arr[i]=Integer.parseInt(sc.next());
        }

        int floor = calculateFloor(target, arr);
        int ceil = calculateCeil(target, arr);
        System.out.println("Floor: "+floor+" ceil: "+ceil);
    }

    public static int calculateFloor(int target, int arr[]){
        int floor=0;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<=target){
                floor=arr[mid];
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return floor;
    }

    public static int calculateCeil(int target, int arr[]){
        int ceil=0;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>=target){
                ceil=arr[mid];
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return ceil;
    }
}
