package BridgelabUC;

public class UC3PartTime {
 
	public static void main(String[] args) {
		int isPartTime =1 ,  isFullTime =2 ;
		int WagePerHour = 20;
		//Variables
		int empHrs = 0 , empDailyWage = 0;
		double empCheck = Math. floor (Math.random()* 10 ) % 3 ;
		if ( empCheck == isPartTime ) {
			empHrs=4;
			empDailyWage = (empHrs*WagePerHour);
			System.out.println("Employee is Present :- " + empDailyWage );
		}
		else 
			if ( empCheck == isFullTime ) {
				empHrs = 8;
				empDailyWage = (empHrs*WagePerHour);
				System.out.println("Employee is Present : - " + empDailyWage );
			}
			else {
				empHrs=0;
				System.out.println("Employee is Absent :-" + empDailyWage);
			}
	}
}
