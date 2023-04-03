package Fila;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Qeue<Integer> qeue = new Qeue();
		
		for(Integer i = 0; i < 3; i++) {
			qeue.add(i);
			System.out.println(qeue.getSize());
		}
		
		System.out.println(qeue.print());
		
		qeue.delete();
		System.out.println(qeue.print());
		qeue.delete();
		System.out.println(qeue.print());
		qeue.delete();
		System.out.println(qeue.print());
		qeue.delete();
		qeue.delete();
		qeue.delete();
		qeue.delete();
		qeue.delete();
		qeue.delete();
		qeue.delete();
		qeue.delete();
		
		for(Integer i = 0; i < 3; i++) {
			qeue.add(i);
		}
		
		System.out.println(qeue.print());
		System.out.println(qeue.getById(2));
	}
}