package main;

import com.sun.codemodel.internal.JForEach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Denominations {
    public static void main(String[] args){
        int n,amount;
        System.out.println("enter the size of currency denominations:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("enter the currency denominations values:");
        int[] domination = new int[n];
        for(int i=0;i<n;i++){
            int x;
            x = sc.nextInt();
            domination[i]=x;
        }
        System.out.println("enter the amount you want to pay:");
        amount = sc.nextInt();
        HashMap<Integer,Integer>  hm= getPaymentApproach(domination,amount);
        System.out.println("Your payment approach in order to give min no of notes will be :-");
        for(Map.Entry<Integer,Integer> me :hm.entrySet()){
            System.out.println(String.format("%d:%d",me.getKey(),me.getValue()));
        }
    }

    public static HashMap getPaymentApproach(int[] domination, int amount) {
        Sorting sorting = new Sorting();
        domination = sorting.insertionSort(domination);
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        int n = domination.length;
        for(int i=n-1;i>=0;i--)
        {
            if(amount >= domination[i]){
                hm.put(domination[i],amount/domination[i]);
                amount = amount % domination[i];
            }
        }
        return hm;
    }

}
