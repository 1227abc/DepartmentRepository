package com.department.app.main;

import com.department.app.service.AdminDept;
import com.department.app.service.HrDept;
import com.department.app.service.SuperDept;
import com.department.app.service.TechDept;

public class Driver {

	public static void main(String[] args) {

		String greeting = "Welcome to ";

		AdminDept admin = new AdminDept();
		System.out.println(greeting + admin.getdepartmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());

		System.out.println();

		HrDept hr = new HrDept();
		System.out.println(greeting + hr.getdepartmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());

		System.out.println();

		TechDept tech = new TechDept();
		System.out.println(greeting + tech.getdepartmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

		System.out.println();

		/*
		 * SuperDept object is being created in Driver class as mentioned in Rubric that
		 * All 4 departments should be working correctly
		 */

		SuperDept superdept = new SuperDept();
		System.out.println(greeting + superdept.getdepartmentName());
		System.out.println(superdept.getTodaysWork());
		System.out.println(superdept.getWorkDeadline());
		System.out.println(superdept.isTodayAHoliday());
	}

}
