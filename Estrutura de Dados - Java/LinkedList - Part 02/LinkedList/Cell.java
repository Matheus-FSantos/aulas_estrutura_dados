package io.github.matheusfsantos.revisao.LinkedList;

public class Cell<T> {
    private T element;
    private Cell<T> nextElement;

    public Cell(T element){
        this.element = element;
        this.nextElement = null;
    }
    
    public Cell(T element, Cell<T> nextElement){
        this.element = element;
        this.nextElement = nextElement;
    }
    
    @Override
    public String toString(){
        return "Cell [element=" + this.getElement() + ", nextElement=" + this.getNextElement() + "]";
    }
    
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Cell<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(Cell<T> nextElement) {
        this.nextElement = nextElement;
    }
}