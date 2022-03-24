package employeeWages;

public class PartTimeEmployeeWagesUC3 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

				int pt=1;
				int ft=2;
				int erph=20;
				
				int eh=0;
				int ew=0;
				
				double empcheck=Math.floor(Math.random()*10)%2;
				
				if(empcheck==pt)
				{
					eh=4;
					
				}else if(empcheck==ft) {
					eh=8;
					
					}else {
						eh=0;
						ew=eh*erph;
						System.out.println("EmpWage: "+ew);
						
					}
		}

	}


