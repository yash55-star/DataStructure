package com.maps;

import java.util.HashMap;
import java.util.Optional;

public class Test1 {

	
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		Optional<Integer> op = Optional.empty();
		
		op = Optional.of(1);
		
		System.out.println(op.map((i) -> i * 10).get());
		System.out.println(op.filter(i->i>10).orElse(10));
		
	}
}
