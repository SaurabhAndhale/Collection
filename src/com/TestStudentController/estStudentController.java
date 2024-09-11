package com.TestStudentController;

import java.util.List;

import com.Controller.StudentController;
import com.Dao.Studentdao;
import com.Entity.Student;

public class estStudentController {
	public static void main(String[] args) {
		StudentController sc = new StudentController();
		List<Student> db = sc.getAllStudentController();
		System.out.println(db);
		System.out.println("----------------------------------------");
		List<Student> db1 = sc.getAllStudentListnameStartswicth("r");
		for (Student student : db1) {
			System.out.println(db1);
			System.out.println("*---------------------------------------*");
		}
		List<Student> db2 = sc.getStudentMarksAbove(90);
		for (Student student : db2) {
			System.out.println(db2);

		}
		System.out.println("---------------------------------------------");

		List<Student> db3 = sc.getStudentByRollNum(3);
		for (Student student : db3) {
			System.out.println(db3);

		}
		System.out.println("*---------------------------------------*");
//		List<Student> db4 =sc.getStudentByReverse();
//		for (Student student : db4) {
//            System.out.println(student);
//        }
//		System.out.println("-------------------------------------------");
//	}

	}}
