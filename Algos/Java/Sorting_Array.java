public class Sorting_Array {

    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            int currPos=i;
            for(int j=i+1; j< arr.length ; j++){
                if(arr[currPos]>arr[j]){
                    currPos=j;
                }
            }
            int temp=arr[currPos];
            arr[currPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }

    public static void countingSort(int[] arr2){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i< arr2.length; i++){
            largest=Math.max(largest, arr2[i]);
        }

        int[] count=new int[largest+1];
        for(int i=0; i<arr2.length; i++){
            count[arr2[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr2[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr= {5,2,3,1,4};
        int[] arr2={2,3,1,1,4,6,6,2,3};

//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        printSort(arr);
        countingSort(arr2);
        printSort(arr2);
    }
}
