package com .collection.demo;

import java.util.ArrayList;
public class Manager3 { 
    
    public static void main(String[] args) {	
        
        // TODO Auto-generated method stub 	
        ArrayList ar= new ArrayList();				
        ar.add(10);			
        ar.add(20);			
        ar.add(30);			
        ArrayList ar1= new ArrayList();		
        ar1.add(10);	
        ar1.add(20);		
        ar1.add(40);				
        //ar.remove(0);			
        //ar.add(ar1);	
        //System.out.println(ar);	
        //ar.removeAll(ar1);	
        //System.out.println(ar1);	
        ar.retainAll(ar1);		
        System.out.println(ar);		
        System.out.println(ar1);	
    } 
}