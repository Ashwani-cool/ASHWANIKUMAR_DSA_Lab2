package main;

import java.util.Scanner;

public class Transcation {
    public static int getNoOfTranscations(int[] transaction, int n, int targetValue) {
        int sum =0;
        for(int i=0;i<n;i++)
        {
            if(sum>= targetValue){
                return i;
            }
            sum =sum + transaction[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int n,noOfTarget,targetValue,result;
        System.out.println("enter the size of transaction array:");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if(n<=0){
            System.out.println("Size of array can not be 0 or negative !!!");
        }
        else{


            System.out.println("enter the values of array:");
            int[] transaction= new int[n];
            for(int i=0;i<n;i++)
            {
                int x;

                x= sc.nextInt();
                while(x<=0){
                    System.out.println("System does not accept 0 or negative transaction..");
                    return;
                }
                transaction[i] =x;
            }
            System.out.println("enter the total no of targets that needs to be achieved:");
            noOfTarget = sc.nextInt();
            while(noOfTarget>0) {

                System.out.println("enter the value of target: ");
                targetValue = sc.nextInt();
                if(targetValue==0){
                    System.out.println("System does not accept 0 or negative transaction..");
                    return;
                }
                result = getNoOfTranscations(transaction, n, targetValue);
                if (result == -1) {
                    System.out.println("Given target is not achieved !!");
                } else {
                    System.out.println(String.format("Target achieved after %d transactions.", result +1));
                }
                noOfTarget--;
            }
        }

    }



}
