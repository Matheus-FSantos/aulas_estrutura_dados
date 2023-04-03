package Pilha;

public class Stack<Generic> {
	private Generic [] stack;
	private Integer top;
	
	public Stack() {
		this.stack = (Generic[]) new Object[50];
		this.top = -1;
	}
	
	public String invertedPrint() {
		StringBuilder stackString = new StringBuilder();
		
		stackString.append("Inverted Stack  [");
		
		for(Integer i = 0; i < this.stack.length; i++) {
			if(this.stack[i] != null) {
				if(stack[i + 1] == null) 
					stackString.append(this.stack[i]);	
				else {
					stackString.append(this.stack[i]);
					stackString.append(", ");
				}
			}
		}
		
		stackString.append("]");
		
		return stackString.toString();
	}
	
	public String normalPrint() {
		StringBuilder stackString = new StringBuilder();
		
		stackString.append("Normal Stack [");
		
		for(Integer i = this.getTop(); i >= 0; i--) {
			if(this.stack[i] != null) {
				if(i == 0)
					stackString.append(this.stack[i]);
				else {
					stackString.append(this.stack[i]);
					stackString.append(", ");
				}
			}
		}
		
		stackString.append("]");
		
		return stackString.toString();
	}
	
	public void push(Generic element) {
		if(this.getTop() + 1 < stack.length) {
			this.setTop(this.getTop() + 1);
			stack[this.getTop()] = element; 
		} else
			throw new IllegalArgumentException("Error! Index of bounds Exception");
	}
	
	public void pop() {
		if(!this.exists()) {
			this.stack[this.getTop()] = null;
			this.setTop(this.getTop() - 1);
		}
	}
	
	public Generic peek() {
		return this.stack[top];
	}
	
	public void reboot() {
		for(Integer i = this.getTop(); i > 0; i--) {
			if(this.stack[i] != null) {
				this.stack[i] = null;
			}
		}
		
		this.setTop(-1);
	}
	
	public Boolean exists() {
		if(this.getTop() == -1)
			return true;
		
		return false;
	}
	
	public Integer getSize() {
		return this.getTop() + 1;
	}
	
	public Generic[] getStack() {
		return this.stack;
	}
	
	public Integer getTop() {
		return this.top;
	}
	
	public void setTop(Integer top) {
		this.top = top;
	}
}