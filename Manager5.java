package com.collection.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Manager5 {	
    
    static List<Employee> employess=new ArrayList<Employee>();	
    static {	
        
        employess.add(new Employee("raj","kamal",500.50,List.of("project 1","project 2","project 3") ));		
        employess.add(new Employee("raj","kamal",1500.50,List.of("project 1","project 2","project 3") ));
        employess.add(new Employee("raj","kamal",2500.50,List.of("project 1","project 2","project 3") ));		
        employess.add(new Employee("raj","kamal",3500.50,List.of("project 1","project 2","project 3") ));	
    } 	
    public static void main(String[] args) {		
        
        // TODO Auto-generated method stub				
        employess.stream()		.forEach(t -> System.out.println(t));				 		
        //map		 List<Employee> listdata= employess.stream()		
        .map(t -> new Employee(t.getF_name(),t.getL_name(),t.getSalary()*10,t.getProjects()	))		
        .collect(Collectors.toList());		
        System.out.println(listdata);		 		
        //filter		
        System.out.println("============");	
        Employee emp= employess.stream()		
        .filter(t-> t.getSalary() > 10000)		 
        .map(t -> new Employee( t.getF_name(),t.getL_name(),t.getSalary()*10,t.getProjects()				 ))		 
        .findAny()		 
        .orElse(null);		 
        System.out.println(emp);		 
    }		 
        
    }
    
    
