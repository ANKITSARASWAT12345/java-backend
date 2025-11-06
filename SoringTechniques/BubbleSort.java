//Bubble sort


class BubbleSort{
    public static void main(String[] args) {
        int arr[]={2,7,4,9,1,6};
        int n=arr.length;
        System.out.println("Array before sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }
        bubbleSort(arr, n);
      System.out.println();
        System.out.println("Array after sorting");
        for(int num:arr){
            System.out.print(num+" ");
        }


    }
    private static void bubbleSort(int arr[],int n){


        int temp;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}