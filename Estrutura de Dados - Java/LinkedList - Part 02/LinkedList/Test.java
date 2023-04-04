package io.github.matheusfsantos.revisao.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        
        for(int i = 0; i < 10; i++){
            linkedList.add(i);
        }
        System.out.println(linkedList.toString());
        
        linkedList.add(999, 3);
        linkedList.add(888, 6);
        linkedList.add(777, 2);
        linkedList.add(666, 8);
        System.out.println(linkedList.toString());
        
        System.out.println(linkedList.indexOf(11));
        System.out.println(linkedList.peek());
        linkedList.remove(666);
        System.out.println(linkedList.toString());
    }
}