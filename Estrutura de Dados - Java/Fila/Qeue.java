package Fila;

public class Qeue<Generic> {
	private Generic[] qeue;
	private Integer size;
	
	public Qeue() {
		this(2);
	}
	
	public Qeue(Integer length) {
		this.qeue = (Generic[]) new Object[length];
		this.size = -1;
	}
	
	public void add(Generic element) {
		if(!this.isFull()) {
			this.setSize(this.getSize() + 1);
			this.qeue[size] = element;
		} else {
			this.resizable();
			this.add(element);
		}
	}
	
	public void delete() {
		for(Integer i = 1; i < this.qeue.length; i++) {
			if(i != null) {
				this.qeue[i - 1] = this.qeue[i];
				this.qeue[i] = null;
			}
		}
		
		if(!(this.getSize() == -1))
			this.setSize(this.getSize() - 1);
	}
	
	public Generic getById(Integer position) {
		if(position <= 0 || position > this.qeue.length)
			return null;
		else {
			if(this.qeue[position - 1] != null)
				return this.qeue[position - 1];
			else
				return null;
		}
	}
	
	public String print() {
		StringBuilder qeue = new StringBuilder();
		qeue.append("[");
		
		for(Integer i = 0; i < this.qeue.length; i++) {
			if(this.qeue[i] != null) {
				if(this.qeue[i + 1] == null)
					qeue.append(this.qeue[i]);
				else if (i + 1 == this.qeue.length)
					qeue.append(this.qeue[i]);
				else {
					qeue.append(this.qeue[i]);
					qeue.append(", ");
				}
			}
		}
		
		qeue.append("]");
		return qeue.toString();
	}
	
	public void resizable() {
		Generic [] clone = this.getQeue();
		this.qeue = (Generic[]) new Object[this.qeue.length * this.qeue.length];
		
		for(Integer i = 0; i < clone.length; i++) {
			if(clone[i] != null) {
				this.qeue[i] =  clone[i];
			}
		}
		
		clone = null;
	}
	
	public boolean isFull() {
		if(this.getSize() + 1 == this.getQeue().length) {
			return true;
		}
		
		return false;
	}
	
	public boolean isEmpty() {
		if(this.getSize() == -1)
			return true;
		
		return false;
	}
	
	public Generic[] getQeue() {
		return this.qeue;
	}
	
	public Integer length() {
		return this.qeue.length;
	}
	
	public Integer getSize() {
		return this.size;
	}
	
	protected void setSize(Integer size) {
		this.size = size;
	}
}