
public class PatternProgram002 {
	public static void main(String[] args) {
		System.out.println("Pattern program");
		
		PatternProgram002 obj=new PatternProgram002();
		obj.StarPattern();
		System.out.println("------------------------------");
		obj.numberPattern();
		System.out.println("------------------------------");
		obj.numberPattern01();
		System.out.println("------------------------------");
		obj.numberPattern02();
		
	}

	private void numberPattern02() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print(row+" ");
			}
			System.out.println();
		}
		
	}

	private void numberPattern01() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private void numberPattern() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=(5-row)+1;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

	private void StarPattern() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=(5-row)+1;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
