package com.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Collection;

import com.Dao.Studentdao;
import com.Entity.Student;

public class StudentService {
	Studentdao dao = null;

	public List<Student> getAllStudentService() {
		dao = new Studentdao();
		List<Student> db = dao.getAllStudents();
		return db;
	}

	public List<Student> getAllStudentListnameStartswicthAservice(String ch) {
		List<Student> db1 = new ArrayList<Student>();
		dao = new Studentdao();
		List<Student> db = dao.getAllStudents();
		for (Student s : db) {
			if (s.getName().startsWith(ch)) {
				db1.add(s);
			}

		}
		return db1;
	}

	public List<Student> getStudentMarksAbove(int i) {

		List<Student> db2 = new ArrayList<Student>();

		dao = new Studentdao();
		List<Student> db = dao.getAllStudents();

		for (Student student : db) {
			if (student.getMark() > i) {
				System.out.println(student);
			}
		}

		return db2;
	}

	public List<Student> getStudentByRollNum(int i) {

		List<Student> db3 = new ArrayList<Student>();
		dao = new Studentdao();
		List<Student> db = dao.getAllStudents();

		for (Student student : db) {
			if (student.getRoll() == i) {
				System.out.println(student);
			}
		}
		return db3;
	}

//	public List<Student> getStudentByReverse() {
//		dao = new Studentdao();
//
//		List<Student> db = dao.getAllStudents();
//
//		Collections.sort(db, new StudRollCom());
//
//		return db;
//	}

}
