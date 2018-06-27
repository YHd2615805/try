package com.wisdom.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TestLambda {
	List<Employee> emps = Arrays.asList(
			new Employee(101,23,"张三",9999.56,"架构",Status.FREE.ordinal()+""),
			new Employee(102,43, "李四",6666.66,"java工程师",Status.BUSY.ordinal()+""),
			new Employee(103,28, "王五",3333.33,"java工程师",Status.BUSY.ordinal()+""),
			new Employee(104,33, "赵六",7777.77,"产品经理",Status.FREE.ordinal()+""),
			new Employee(105,38, "田七",5555.55,"美工",Status.BUSY.ordinal()+"")
	);
	@Test
	public void test1(){
		Double square = operation(100.23, (x) -> x * x);
		System.out.println("平方的结果是"+square);
	}
	public Double operation(Double num,MyFunction myFun){
		return myFun.result(num);
	}
	@Test
	public void test2(){
		Collections.sort(emps,(e1,e2) ->{
			if(e1.getAge() == e2.getAge()){
				return e1.getName().compareTo(e2.getName());
			}else{
				//倒序排列（由大到小）
				return -Integer.compare(e1.getAge(),e2.getAge());
			}
		});
		for(Employee employee:emps){
			System.out.println(employee);
		}
	}
	@Test
	public void test3(){
		String upperCase = convertUpperCase("abcde", (str) ->str.toUpperCase());
		System.out.println(upperCase);
	}
	public String convertUpperCase(String str,MyTestFun myTestFun){
		return myTestFun.getValue(str);
	}
	@Test
	public void test4(){
		Long result = longHandler(23L, 46L, (x,y) -> x * y);
		System.out.println(result);
	}
	public Long longHandler(long num1,long num2,MyFunctionWithTwoParameter<Long, Long> myFun){
		return myFun.getValue(num1, num2);
	}
}
