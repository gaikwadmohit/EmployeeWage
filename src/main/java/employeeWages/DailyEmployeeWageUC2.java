package employeeWages;

public class DailyEmployeeWageUC2 {
	
		public static void main(String[] args) {
			
			int fulltime=1;
			int ERPH =20;
			int EH=0;
			int EW=0;
			
			double empcheck =Math.floor(Math.random()*10)%2;
		
			if(empcheck==fulltime)
			{
				EH=8;
				
			}
			else
			{
				EH=0;
				
			}
			EW=EH*ERPH;
			System.out.println("Employee wage "+ EW);
		}

	}


