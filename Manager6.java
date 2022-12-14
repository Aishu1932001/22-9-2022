package com.collection.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Manager6 { 	
    
    public static void main(String[] args) {	
        
        // TODO Auto-generated method stub				
        //stream API			
        List<Integer> list=new ArrayList<Integer>();				
        list.add(40);		
        list.add(20);		
        list.add(90);	
        list.add(60);											
        list.stream().forEach(t -> System.out.println(t));			
        List<Integer> arraylistprintln = list.stream()		
        .filter(t -> t >20 )			
        .collect(Collectors.toList());	
        System.out.println(arraylistprintln);	
        System.out.println("=====================");			
        long counts =list.stream().filter(t -> t==10).count();
        System.out.println(counts);	
        System.out.println("====================");	
        System.out.println("=====================");		
        List<Integer> sortedList = list.stream().sorted((t1,t2)-> t1.compareTo(t2)).collect(Collectors.toList());				
        int value = sortedList.stream().max((t1,t2)-> t1.compareTo(t2)).get();			
        System.out.println(value);		
        System.out.println("sorting arrayList"+sortedList);			
        System.out.println("====================");		
        ArrayList<String > list1= new ArrayList<String>();			
        list1.add("java");			
        list1.add("python");			
        list1.add("Angular");		
        list1.add("Spring");	
        System.out.println(list1);	
        List<String> sprint = list1.stream().map(t->t.toUpperCase()).collect(Collectors.toList());					
        System.out.println(sprint);			
        sprint.stream()
        .forEach(System.out::println);			
        System.out.println("=================");			
        sprint.stream().filter(t -> true).limit(2).forEach(t -> System.out.println(t+","));						
    }
}
