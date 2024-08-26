package com.nt.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.nt.stream.Employee;

public class CollectionsUtility {

	public static void main(String[] args) {
	  List<String> st=new ArrayList<>(Arrays.asList("vineeth","ashok","jackson","john","sebastian"));
	  List<Employee> list=new ArrayList<>(Arrays.asList(new Employee(100,"ashok","infosys","dev",23000.0,500.0,true),
              new Employee(105,"kumar","cognizant","tester",30000.0,1000.0,false),
              new Employee(102,"ravi","mphasis","prod",10000.0,100.0,true),
              new Employee(90,"vishal","ibm","dev",40000.0,10000.0,true),
              new Employee(89,"reddy","microsoft","dev",100000.0,9000.0,false),
              new Employee(110,"charan","factset","tester",20000.0,1000.0,false)
              ));
	  List<Employee> list1=new ArrayList<>(Arrays.asList(new Employee(100,"ashok","infosys","dev",23000.0,500.0,true),
              new Employee(105,"kumar","cognizant","tester",30000.0,1000.0,false),
              new Employee(102,"ravi","mphasis","prod",10000.0,100.0,true),
              new Employee(90,"vishal","ibm","dev",40000.0,10000.0,true),
              new Employee(89,"reddy","microsoft","dev",100000.0,9000.0,false),
              new Employee(110,"charan","factset","tester",20000.0,1000.0,false)
              ));
	 ;
	      
	  sort(list);
	 // System.out.println(list);
	  sort1(list1,Comparator.comparing(e->e.getName()));
	  List<?> l1=reverse(st);
	  System.out.println(l1);
	  List<?> l2=reverse(list);
	  System.out.println(l2);
	  
	  List<Integer> integers=new ArrayList<Integer>(Arrays.asList(34,12,56,23,78,24,90,11,77,23,23));
	  int min=min(integers);
	  System.out.println(min);
	  
	  replaceAll(integers,23,999);
	  integers.sort(null);
	int a=  Collections.binarySearch(integers,90);
	  System.out.println(a);
	  System.out.println(integers);
	}
	public static void sort(List<Employee> list) {
		Employee[] e=list.toArray(Employee[]::new);
		for(int i=0;i<e.length;i++) {
			for(int j=i;j>0 && e[j-1].compareTo(e[j])>0;j--) {
				Employee emp=e[j-1];
				e[j-1]=e[j];
				e[j]=emp;
			}
		}
		System.out.println(Arrays.toString(e));
		for(int i=0;i<e.length;i++) {
		   list.set(i,e[i]);
;		}
		System.out.println(list);
	}
	public static void sort1(List<Employee> list,Comparator<Employee> c) {
		Employee[] e=list.toArray(Employee[]::new);
		for(int i=0;i<e.length;i++) {
			for(int j=i;j>0 && c.compare(e[j-1], e[j])>0;j--) {
				Employee emp=e[j-1];
				e[j-1]=e[j];
				e[j]=emp;
			}
		}
		for(int i=0;i<e.length;i++) {
			list.set(i, e[i]);
		}
		System.out.println(list);
		
	}
	static List<?> reverse(List st) {
		int low =0;
		int high=st.size()-1;
	   int mid=st.size()/2;
		while(low <mid ) {
			Object o=st.get(low);
			st.set(low,st.get(high));
			st.set(high,o);
			low++;
			high--;
			
		}
		return st;
		
	}
	static int min(List  integers) {
		Object min1=integers.get(0);
		int min =(Integer)min1;
	
		for(Object e:integers) {
			if(e instanceof Integer i) {
				if(min>i) {
					min=i;
				}
			}
		}
		return min;
	}
	
	static void replaceAll(List<Integer> list,int old, int val ) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals(old)) {
				list.set(i, val);
			}
		}
		System.out.println(list);
	}
	static void copy(List<Integer> src,List<Integer> dest) {
		for(int i=0;i<src.size();i++) {
			dest.add(src.get(i));
			
		}
	}
	

}
