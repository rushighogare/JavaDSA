import java.util.Scanner;

public class UnionSortedArrays {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of first array: ");
        int size1=Integer.parseInt(sc.nextLine());
        int arr1[]=new int[size1];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<size1; i++){
            arr1[i]=Integer.parseInt(sc.next());
        }

        sc.nextLine();

        System.out.println("Enter size of second array: ");
        int size2=Integer.parseInt(sc.nextLine());
        int arr2[]=new int[size2];
        System.out.println("Enter elements of second array: ");
        for(int i=0; i<size2; i++){
            arr2[i]=Integer.parseInt(sc.next());
        }

        sc.close();
        makeUnion(arr1, arr2);
    }

    public static void makeUnion(int arr1[], int arr2[]){
        int finalArr[]=new int[arr1.length+arr2.length];
        int i=0;
        int left=0, right=0;

        while(left<arr1.length && right<arr2.length){
            if(arr1[left]<=arr2[right]){
                finalArr[i]=arr1[left];
                left++;
            }
            else{
                finalArr[i]=arr2[right];
                right++;
            }
            i++;
        }

        //if array1 is remaining with elements
        while(left<arr1.length){
            finalArr[i++]=arr1[left++];
        }

        //if array2 is remaining with elements
        while(right<arr2.length){
            finalArr[i++]=arr2[right++];
        }

        //print final result
        for(int j=0; j<finalArr.length; j++){
            System.out.print(finalArr[j]+" ");
        }
    }
}
