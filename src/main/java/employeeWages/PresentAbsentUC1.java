package employeeWages;

public class PresentAbsentUC1 {
	

		public static void main(String[] args) {
		 int fulltime=1;
		 
		 double empcheck=Math.floor(Math.random()*10)%2;
		 if(empcheck == fulltime)
		 {
			 System.out.println("Employee is present");
			
		 }
		 else {
			 System.out.println("Employee is absent");
		 }

		}

	}


