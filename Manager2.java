package com.collection.demo;


    
   
import java.util.ArrayList;
import java.util.List;
public class Manager2 { 
    
    public static void main(String[] args) {		
        
        // TODO Auto-generated method stub			
        List List1 = new ArrayList(10);				
        List1.add(100);				
        List1.add(200);			
        List1.add(300);	
        List1.add(100);			
        List1.add(200);				
        List1.add(300);		
        List1.add(100);			
        System.out.println(List1);	
        List list2 = new ArrayList();		
        list2.add(10);		
        list2.add(20);		
        list2.add(30);		
        list2.add(100);	
        list2.add(200);			
        List1.add(list2);		
        //System.out.println(List1);		
        //List1.remove(3);	
        //System.out.println("After remove "+List1);			
        //List1.remove(list2);			
        List1.retainAll(list2);	
        System.out.println(List1);	
        System.out.println(list2); 
    } 
}