package com.wisdom.java8;

@FunctionalInterface
public interface MyFunctionWithTwoParameter<T,R> {
	public R getValue(T t1,T t2);
}
