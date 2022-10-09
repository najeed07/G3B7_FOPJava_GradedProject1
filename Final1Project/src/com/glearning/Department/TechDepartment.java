package com.glearning.Department;

import com.glearning.Super.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	// Creating method to return department name
	public String departmentName() {
		return "Tech Department";
	}

	// Creating method to return Todays Work
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	// Creating method to return Work deadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	// Creating method to return Stack information

	public String getTechStackInformation() {

		return "core Java";
	}

}
