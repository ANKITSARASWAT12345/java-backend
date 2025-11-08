//selection sort

public class SelectionsSort {
    public static void main(String[] args) {
        int arr[]={6,3,9,1,7,10,5,9};
        int n=arr.length;

        System.out.println("Array before sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }

        selectionSort(arr, n);
        System.out.println();
        System.out.println("Array after sorting");
      
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    private static void selectionSort(int arr[],int n){
        int temp;
        int minIndex=-1;

        for(int i=0;i<n-1;i++){
            minIndex=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
                
            }
            temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
            
        }
    }
}
