package com.glearning.Department;

import com.glearning.Super.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	// Creating method to return department name

	public String departmentName() {
		return "Administrative Department";
	}

	// Creating method to return Todays Work
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	// Creating method to return Work deadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}