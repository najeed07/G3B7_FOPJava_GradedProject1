package com.glearning.Department;

import com.glearning.Super.SuperDepartment;

public class HRDepartment extends SuperDepartment {

	// Creating method to return department name

	public String departmentName() {
		return "HR Department";
	}

	// Creating method to return Todays Work

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	// Creating method to return Work deadline

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	// Creating method to return activity

	public String doActivity() {
		return "team Lunch";
	}
}