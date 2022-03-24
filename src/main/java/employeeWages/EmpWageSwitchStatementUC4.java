package employeeWages;

public class EmpWageSwitchStatementUC4 {

	
		public static final int PT=1;
		public static final int FT=2;
		public static final int ERPH=20;
		
			public static void main(String[] args) {
				int EH=0;
				int EW=0;
				
				int empcheck=(int) Math.floor(Math.random()*10)%3;
				
			switch(empcheck) {
			case PT:
				EH=4;
				break;
			case FT:
				EH=8;
				break;
			default:
				EH=0;
			}
			EW=EH*ERPH;
			System.out.println("EMP Wage "+ EW);
							
		}

	}


