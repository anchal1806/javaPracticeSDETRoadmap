package com.practice.java;


public class mergeSort {
    public static void main(String args[]) {
      //  int arr[] = {20, 19, 18, 15, 14, 21};
        int arr[] = {-18,0,1,20,-2};

        mergeSort mS = new mergeSort();
        mS.sort(arr,0,arr.length-1);
        int  i=0;
        while(i<arr.length) {
            System.out.print(" "+arr[i]);
            i++;
        }
    }

    private static void sort(int arr[],int l, int r){
        int m = l+((r-l)/2);
        if(l<r){
            sort(arr, l,m);
            sort(arr, m+1,r);
            merge(arr, l, m , r);
        }
    }

    private static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i =0; i<n1; i++){
            L[i]=arr[l+i];
        }
        for(int j =0; j<n2; j++){
            R[j]=arr[m+1+j];
        }
        int k = l;
        int i =0;
        int j =0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] =L[i];
                i++;
            }
            else{
                arr[k] =R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }

   /* private static void merge(int arr[],int l, int m, int r) {
     int n1 = m-l+1;
     int n2 = r-m;
     int i, j, k =0;
     int L[] = new int[n1];
     int R[] = new int[n2];
     for(i =0; i<n1; i++){
         L[i]= arr[l+i];
     }
     for(j =0; j<n2; j++){
            R[j]= arr[m+1+j];
     }
     i = 0;
     j =0;
     k=l;
     while(i<n1 && j<n2){
         if(L[i]<=R[j]){
             arr[k] = L[i];
             i++;
         }
         else{
             arr[k]=R[j];
             j++;
         }
         k++;
     }
     while(i<n1){
         arr[k] = L[i];
         i++;
         k++;
     }
     while(j<n2){
         arr[k] = R[j];
         j++;
         k++;
     }
 //return arr;
    }
    public static void sort(int arr[], int l, int r){
        int m = l+((r-l)/2);
        if(l < r){
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
*/
}
