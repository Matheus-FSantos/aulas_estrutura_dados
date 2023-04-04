package io.github.matheusfsantos.revisao.LinkedList;

public class LinkedList<T> {
    private Cell<T> startElement;
    private Cell<T> lastElement;
    private Integer length;

    public LinkedList(){
        this.startElement = null;
        this.lastElement = null;
        this.length = 0;
    }
    
    @Override
    public String toString(){
        if(this.getLength() == 0)
            return "LinkedList []";
        
        StringBuilder linkedList = new StringBuilder();
        Cell<T> newElement = this.getStartElement();
        
        linkedList.append("LinkedList [");
        
        for(int i = 0; i < this.getLength(); i++){
            if(newElement != null){
                if(newElement.getNextElement() == null)
                    linkedList.append(newElement.getElement());
                else
                    linkedList.append(newElement.getElement()).append(", ");
                
                newElement = newElement.getNextElement();
            }
        }
        
        linkedList.append("]");
        return linkedList.toString();
    }
    
    public void add(T element){
        Cell<T> newElement = new Cell(element);
        
        if(this.getStartElement() == null)
            this.setStartElement(newElement);
        else
            this.getLastElement().setNextElement(newElement);
        
        this.setLastElement(newElement);
        this.setLength((this.getLength() + 1));
    }
    
    public void add(T element, Integer position){
        Cell<T> head = this.getStartElement();
        
        Cell<T> nextElement = null;
        Cell<T> newElement = new Cell(element);
        
        for(int i = 0; i < this.getLength(); i++){
            if(head != null){
                if(i == this.getLength() - position - 1){
                    nextElement = head.getNextElement();
                    head.setNextElement(newElement);
                    newElement.setNextElement(nextElement);
                } else {
                    head = head.getNextElement();
                }
            }
        }
        
        this.setLength(this.getLength() + 1);
    }
    
    public void remove(T element){
        Cell<T> head = this.getStartElement();
        Cell<T> lastElement = null;
        
        for(int i = 0; i < this.getLength(); i++){
            if(head != null){
                if(this.getLength() == 1){
                    this.startElement = null;
                    this.lastElement = null;
                } else if(head == this.getStartElement()){
                    this.setStartElement(head.getNextElement());
                    head.setNextElement(null);
                } else if(head == this.getLastElement()){
                    this.lastElement = lastElement;
                    lastElement.setNextElement(null);
                } else {
                    lastElement.setNextElement(head.getNextElement());
                    lastElement = null;
                    this.length--;
                    break;
                }
                
                lastElement = head;
                head = head.getNextElement();
            }
        }
    }
    
    public void get(Integer position){
        
    }
    
    public Integer indexOf(T element){
        Integer index = 0;
        Cell<T> newElement = this.getStartElement();
        
        
        for(int i = 0; i < this.getLength(); i++){
            if(newElement != null){
                if(newElement.getElement().equals(element)){
                    return index;
                }
            }
            
            newElement = newElement.getNextElement();
            index++;
        }
        
        return -1;
    }
    
    public void clean(){
        Cell<T> element = this.getStartElement();
        
        for(int i = 0; i < 0; i++){
            element.setElement(null);
            element = element.getNextElement();
        }
        
        this.setLength(0);
        this.setLastElement(null);
        this.setStartElement(null);
    }
    
    public T peek(){
        Cell<T> element = this.getStartElement();
        
        for(int i = 0; i < this.getLength(); i++){
            if(element.getNextElement() != null){
                element = element.getNextElement();
            }
        }
        
        return element.getElement();
    }
    
    public Cell<T> getStartElement() {
        return startElement;
    }

    public void setStartElement(Cell<T> startElement) {
        this.startElement = startElement;
    }

    public Cell<T> getLastElement() {
        return lastElement;
    }

    public void setLastElement(Cell<T> lastElement) {
        this.lastElement = lastElement;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}