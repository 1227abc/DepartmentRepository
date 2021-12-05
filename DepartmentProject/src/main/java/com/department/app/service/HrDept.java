package com.department.app.service;

public class HrDept extends SuperDept {
	
	public String getdepartmentName() {
		return "Hr Department ";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	public String doActivity() {
		return "team Lunch";
	}


}
