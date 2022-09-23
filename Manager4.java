package com.collection.demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 
public class Manager4 extends ArrayList{ 
    
    public static void main(String[] args) {	
        
        // TODO Auto-generated method stub				
        Manager4 list = new Manager4();		
        list.add(1);	
        list.add(2);		
        list.add(3);		
        list.add(4);		
        list.add(5);		
        list.add(6);		
        list.add(7);	
        list.add("raja");	
        list.add(true);		
        list.add("abc");		
        list.add("ZXY");		
        list.add(4);	
        list.add(5);		
        list.add(6);		
        list.add(7);		
        list.add(8);			
        //list.removeRange(3, 7);	
        System.out.println(list);	
        //list.set(4, "raja");		
        //Collections.sort(list);		
        Comparator comp= Collections.reverseOrder();		
        Collections.sort(list,comp);	
        System.out.println(list);			
    } 
}