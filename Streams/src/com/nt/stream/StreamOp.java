package com.nt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list=new ArrayList<>(Arrays.asList(10,45,2,6,90,23,45,88));
	      list.stream().sorted((i1,i2)->{
	    	  System.out.println(i1+" "+i2);
	    	  return i1-i2;}).forEach(System.out::println);
	}

}
