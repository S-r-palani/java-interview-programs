
public class PatternPrograms {
	public static void main(String[] args) {
		// pattern programs
		System.out.println(" star pattern programs");
		
		
		PatternPrograms obj=new PatternPrograms();
		obj.StarPatternProgram();
		System.out.println("----------------------------");
		obj.NumberPattern();
		System.out.println("----------------------------");
		obj.NumberPattern01();
		System.out.println("----------------------------");
		obj.NumberPattern001();
		
	}

	private void NumberPattern01() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(row+" ");
				
			}
			System.out.println();
		}
		
	}

	private void NumberPattern() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
		
	}

	private void StarPatternProgram() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		
	}
	
		private void NumberPattern001() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
				
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
