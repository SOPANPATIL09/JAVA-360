package com.demo;

import com.dao.StudentDao;
import com.model.Student;

public class App1 {
	public static void main(String args[]) {
		
		StudentDao sd=new StudentDao();
		System.out.println(sd.findStudentById(1));
	}

}
