package com.xworkz.pratice;

import javax.xml.bind.Element;

public class BinarySearch {

    public static void main(String[] args) {

        int[] num = {10,20,30,40,50};

        int search = 10;

        int low = 0;
        int high = num.length -1;
        boolean found = false;

        while (low <= high){
            int mid = (low + high)/2;

            if (num[mid] == search){
                found = true;
                break;
            } else if (num[mid] < search) {
                low = mid + 1;

            }
            else {
                high = mid - 1;
            }

        }

        if(found){
            System.out.println("Element is found");
        }else {
            System.out.println("Element is not found");
        }
    }
}
