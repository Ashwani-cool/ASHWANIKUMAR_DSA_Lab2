package main;

public class Sorting {
    public int[] insertionSort(int[] arr){
        int size = arr.length;
        for(int i=0;i<size;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
