package com.practice.java;

public class mergeSortSecondStraw {
    public static void main(String args[]){
        int arr[] = {-18,0,1,20,-2};
        mergeSortSecondStraw mS = new mergeSortSecondStraw();
        mS.sort(arr,0,arr.length-1);
        for(int i =0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
    private void sort(int arr[], int l, int r){
        int m = l +((r-l)/2);
        if(l<r){
            sort(arr,l,m);
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    private void merge(int arr[],int l, int m, int r){
       int n1 = m-l+1;
       int n2 = r-m;
       int L[] = new int[n1];
       int R[] = new int[n2];
       int i=0,j=0,k=0;
       for( i=0; i<n1; i++){
           L[i] = arr[l+i];
       }
       for( j =0; j<n2; j++){
           R[j] =arr[m+1+j];
        }
       i=0;
       j=0;
       k=l;
       while(i <n1 && j<n2){
           if(L[i]<=R[j]) {
               arr[k] = L[i];
               i++;
           }
           else{
               arr[k] = R[j];
               j++;
           }
           k++;
       }
       while(i<n1){
           arr[k] =L[i];
           k++;
           i++;
       }
        while(j<n2){
            arr[k] =L[j];
            k++;
            j++;
        }



    }
}
