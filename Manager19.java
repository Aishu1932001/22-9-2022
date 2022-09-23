package com.collection.demo;

import java.util.Hashtable;
class S{	
    
    int i;		
    S(int i){	
        
        this.i = i;
    }		
    @Override	
    public String toString() {		
        
        // TODO Auto-generated method stub	
        return ""+i;
    }}
public class Manager19 { 	
    
    public static void main(String[] args) {	
        
        Hashtable table1 = new Hashtable();	
        table1.put("val1", "Raja");	
        table1.put("val2", "kamal");		
        table1.put("val3", "magesh");	
        table1.put("val4", "ramu");	
        table1.put("val5", "kumar");
        table1.put(new S(10), "object S");			
        System.out.println(table1);
    } }