package com.nt.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		Object[] o=new Number[10];
	    o[0]=23;
	    o[1]=23.0f;
	  // System.out.println(o[0]);
	  // System.out.println(o[1]);
	   
	 List<Employee> list=new ArrayList<>(Arrays.asList(new Employee(100,"ashok","infosys","dev",23000.0,500.0,true),
			                                          new Employee(105,"kumar","cognizant","tester",30000.0,1000.0,false),
			                                          new Employee(102,"ravi","mphasis","prod",10000.0,100.0,true),
			                                          new Employee(90,"vishal","ibm","dev",40000.0,10000.0,true),
			                                          new Employee(89,"reddy","microsoft","dev",100000.0,9000.0,false),
			                                          new Employee(110,"charan","factset","tester",20000.0,1000.0,false)
			                                          ));
	List<String> list1 = list.stream().filter(e->e.getSalary()>20000.0).map(e->e.getName()).collect(Collectors.toList());
       System.out.println(list1);
     
       Map<String, String> list2 = list.stream().collect(Collectors.groupingBy(e->{System.out.println("group "+e);
    	   return e.getDept();},Collectors.mapping(e->{System.out.println("map "+e);return e.getName();}, Collectors.joining(" - "))));
       System.out.println(list2);
       /*Map<Boolean, List<String>> list3 = list.stream().collect(Collectors.partitioningBy(e->e.isPromotion(), Collectors.mapping(e->e.getName(), Collectors.toList())));
       System.out.println(list3);
       Employee emp = list.stream().filter(e->e.getDept().equals("dev")).max(Comparator.comparing(Employee::getSalary)).get();
       System.out.println(emp);
       Optional<String> opt = list.stream().collect(Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getSalary)),empOpt->empOpt.map(e->e.getName())));
       System.out.println(opt);
       Double sum = list.stream().filter(e->e.getDept().equals("dev")).collect(Collectors.summingDouble(e->e.getSalary()));
       System.out.println(sum);
      DoubleSummaryStatistics doublesummary = list.stream().filter(e->e.getDept().equals("dev")).collect(Collectors.summarizingDouble(Employee::getSalary));
      System.out.println(doublesummary);
     Double sum1 = list.stream().filter(e->e.getDept().equals("dev")).collect(Collectors.reducing(0.0,e->e.getSalary(),(a,b)->a+b));
     
     System.out.println(sum1);
     Map<String, Optional<Employee>> maxsal = list.stream().collect(Collectors.groupingBy(e->e.getDept(),Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(e->e.getSalary())))));
     System.out.println(maxsal);
      
    // list.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
     //System.out.println(list);
     System.out.println("===============");
     List<String> sort = list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.mapping(Employee::getName,Collectors.toList()));
     
     System.out.println(sort);
     List<Employee> sort1 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
     System.out.println(sort1);
     list.sort(null);
     System.out.println(list);
     List<Employee> sort2=list.stream().sorted(Collections.reverseOrder((s1,s2)->Double.compare(s1.getSalary(), s2.getSalary()))).collect(Collectors.toList());
     System.out.println(sort2);*/
	}

}
