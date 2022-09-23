package com.collection.demo;
    
   
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Manager1 { 	
    
    public static void main(String[] args) {	
        
        // TODO Auto-generated method stub			
        int[] arr = new int[4];		
        arr[0]=1;	
        arr[2]=20;	
        arr[3]=40;					
        System.out.println("Arrays "+Arrays.binarySearch(arr, 10));			
        ArrayList list1 = new ArrayList();	
        list1.add("hello");	
        list1.add(true);	
        list1.add('a');		
        list1.add(new Object());	
        list1.add(10.0f);		
        list1.add(200);		
        list1.add(30);		
        list1.add(100);		
        list1.add(10);	
        list1.add(200);		
        list1.add(30);		
        list1.add(100);	
        list1.add(10);		
        list1.add(200);		
        list1.add(30);		
        list1.add(100);		
        list1.add(10);		
        list1.add(200);		
        list1.add(30);		
        list1.add(100);		
        list1.add(10);		
        list1.add("hello");		
        list1.add(30);		
        list1.add(100);	
        list1.add(10);	
        list1.add(200);		
        list1.add(30);	
        
        list1.add(100);		
        System.out.println("Collection : "+list1); 
    } 
}