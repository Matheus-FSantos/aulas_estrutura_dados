package LinkedList;

public class LinkedList<Generic> {
	private Cell<Generic> start;
	private Cell<Generic> end;
	private Integer length;
	
	public LinkedList() {
		this.length = 0;
	}
	
	public void add(Generic element) {
		Cell<Generic> cell = new Cell<Generic>(element);
		
		
		if(this.start == null)
			this.setStart(cell);
		else 
			this.end.setNext(cell);
		
		
		this.setEnd(cell);
		this.length++;
	}
	
	public void clear() {
		Cell<Generic> aux = this.getStart();
		
		for(Integer i = 0; i < this.length; i++) {
			if(aux != null) {
				aux.setElement(null);
				aux = aux.getNext();
			}
		}
		
		this.setStart(null);
		this.setEnd(null);
		this.setLength(0);
	}
	
	public String getByElement(Generic element) {
		Cell<Generic> searchElement = this.getStart();
		Integer index = -1;
		
		for(Integer i = 0; i < length; i++) {
			if(searchElement != null) {
				index++;
				
				if(searchElement.getElement()  == element) {
					return "Element exist in index: " + index;
				}
				
				searchElement = searchElement.getNext();
			}
		}
		
		return "Element not exist";
	}
	
	public Generic getById(Integer id) {
		Cell<Generic> searchElement = this.getStart();
		
		for(Integer i = 0; i < id; i++) {
			if(searchElement != null) {
				if(!(i + 1 == id)) {
					searchElement = searchElement.getNext();
				}
			}
		}
		
		if(searchElement != null)
			return searchElement.getElement();
		else
			return null;
	}
	
	@Override
	public String toString() {
		if(this.getLength() == 0)
			return "LinkedList []";
		
		StringBuilder cell = new StringBuilder();
		Cell<Generic> now = this.getStart();
		
		cell.append("LinkedList [");
		
		for(Integer i = 0; i < this.getLength(); i++) {
			if(now.getNext() != null) {
				cell.append(now.getElement()).append(", ");
				now = now.getNext();
			} else {
				cell.append(now.getElement());
			}
		}
		
		cell.append("]");
		
		return cell.toString();
	}

	public Cell<Generic> getStart(){
		return this.start;
	}
	
	public void setStart(Cell<Generic> start) {
		this.start = start;
	}
	
	public Cell<Generic> getEnd(){
		return this.end;
	}
	
	public void setEnd(Cell<Generic> end) {
		this.end = end;
	}
	
	public Integer getLength() {
		return this.length;
	}
	
	public void setLength(Integer length) {
		this.length = length;
	}
}