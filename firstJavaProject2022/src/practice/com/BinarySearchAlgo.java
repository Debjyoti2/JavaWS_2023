package practice.com;

import java.util.Arrays;

public class BinarySearchAlgo {

    public static void main(String[] args) {

        //find index of 23

        Integer[] arr= {72,23,8,2,91,56,38,16};
        int element=23;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.asList(arr));

        int left=0;
        int right=arr.length-1;
        while(right>left){
            int middleindex=(left+right)/2;
            if(element==arr[middleindex]){
                System.out.println("index :: " + middleindex);
                break;
            }
            else if(element>arr[middleindex]){
                right=middleindex;
            }
            else if(element<arr[middleindex]){
                left=middleindex;
            }
            else {
                System.out.println("Element Not Present !!");
            }

        }






    }
}
