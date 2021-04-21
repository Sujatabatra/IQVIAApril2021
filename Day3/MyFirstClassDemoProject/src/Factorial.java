
public class Factorial {
	
	/*
	 * number : writable
	 * factorial : readable
	 * 
	 *  whenever, we want to make data readable, we need to create setter methods
	 *  whenever, we want to make data writeable/modifiable, we need to create getter method
	 *  
	 *  how to decide what data shloud come in class : input and output data only , no processing data
	 */
	private int number,factorial;

	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getFactorial() {
		return calculateFactorial();
	}
	
	private int calculateFactorial(){
		factorial=1;
		for(int i=1;i<=number;i++){
			factorial=factorial*i;
		}
		return factorial;
	}
	
	
}
