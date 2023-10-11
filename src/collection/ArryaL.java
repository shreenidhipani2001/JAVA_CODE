package collection;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArryaL {
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int  pidx=partition(arr,low,high);
			quickSort(arr, low, pidx-1);
			quickSort(arr, pidx+1, high);
		}
	}
	public static int partition(int arr[],int low,int high) {
		int i=low-1;
		int pivot=arr[high];
		for(int j=low;j<arr.length;j++)
		{
			if(arr[j]<pivot) {
				i++;
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	     i++;
	     int temp=arr[i];
	     arr[i]=pivot;
	     arr[high]=temp;
	     return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,12,2,23,3,24,34,4};
    quickSort(arr, 0, arr.length-1);
    for(int i=0;i<arr.length;i++) {
    	System.out.print(" "+arr[i]);
    }
      
       
       
       
	}

}
