
public class Series {

	private int totalTerms,sumSeries;

	public void setTotalTerms(int totalTerms) {
		this.totalTerms = totalTerms;
	}

	public int getSumSeries() {
		Factorial fOb=new Factorial();
		sumSeries=0;
		for(int i=1;i<=totalTerms;i++){
			fOb.setNumber(i);
			sumSeries=sumSeries+fOb.getFactorial()/i;
		}
		return sumSeries;
		
	}
	
	
}
