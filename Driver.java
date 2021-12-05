package oopsAssignmentSolution;

/*
 * Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment
→ Each department will display all its functionalities.
→ Each department  will display whether today is a holiday or not with the help of the Super Department. (SuperDepartment will act as a super class for all the departments)

 */
public class Driver {
	
	
	public static void main(String[] args) {
		
		AdminDepartment admindepartment = new AdminDepartment();
		HrDepartment hrdepartment = new HrDepartment();
		TechDepartment techdepartment = new TechDepartment();
		
		
		admindepartment.departmentName();
		admindepartment.getTodaysWork();
		admindepartment.getWorkDeadline();
		admindepartment.isTodayAHoliday();
		
		hrdepartment.departmentName();
		hrdepartment.doActivity();
		hrdepartment.getTodaysWork();
		hrdepartment.getWorkDeadline();
		hrdepartment.isTodayAHoliday();
		
		techdepartment.departmentName();
		techdepartment.getTodaysWork();
		techdepartment.getWorkDeadline();
		techdepartment.getTechStackInformation();
		techdepartment.isTodayAHoliday();
		
	}

}
