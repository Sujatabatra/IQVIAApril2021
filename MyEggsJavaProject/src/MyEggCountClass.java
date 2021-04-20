
public class MyEggCountClass {

	public static void main(String[] args) {
		int totalEggs=235;
		
		int grossEggs=totalEggs/144;
		
		int remainingAfterGross=totalEggs%144;
		
		int dozen=remainingAfterGross/12;
		
		int remainingAfterDozen=remainingAfterGross%12;
		
		System.out.println(totalEggs+" eggs = "+grossEggs+" gross "+dozen+" dozen "+"remaining "+remainingAfterDozen+" eggs");
		

	}

}
