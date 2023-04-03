package LinkedList;

public class Cell<Generic> {
	private Generic element;
	private Cell<Generic> next;
	
	public Cell(Generic element) {
		this.element = element;
		this.next = null;
	}
	
	public Cell(Generic element, Cell<Generic> next) {
		this.element = element;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Cell [element=" + this.getElement() + ", next=" + this.getNext() + "]";
	}
	public Cell<Generic> getNext(){
		return this.next;
	}
	
	public void setNext(Cell<Generic> next) {
		this.next = next;
	}
	
	public Generic getElement() {
		return this.element;
	}
	
	public void setElement(Generic element) {
		this.element = element;
	}
}
