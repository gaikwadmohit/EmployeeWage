package employeeWages;

public class EmpTotalWagesTotalWorkHrUC6 {
		
		public static final int PT = 1;
		public static final int FT = 2;
		public static final int ERPH = 10;
		public static final int WorkingDays = 20;
		public static final int MaxHrInMonth = 100;

		public static void main(String[] args) {
				int EH=0;
				int EmpTotalHours=0;
				int TotalWorkingDays=0;
				
				while(EmpTotalHours <= MaxHrInMonth && TotalWorkingDays < WorkingDays){
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
			EmpTotalHours +=EH ;
			System.out.println(TotalWorkingDays +":" + EH);
				}
				int TotalEmpWage=EmpTotalHours*ERPH;
				System.out.println(TotalEmpWage);
								
			}
	}

