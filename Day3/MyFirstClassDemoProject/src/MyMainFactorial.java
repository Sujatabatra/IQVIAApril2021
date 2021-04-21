
public class MyMainFactorial {

	public static void main(String[] args) {
		Factorial fOb=new Factorial();
		fOb.setNumber(5);
		System.out.println("Factorial : "+fOb.getFactorial());
		
		
		Series sOb=new Series();
		sOb.setTotalTerms(4);
		System.out.println("Sum of series : "+sOb.getSumSeries());
	}

}
