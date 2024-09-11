package com.Controller;

import java.util.List;

import com.Dao.Studentdao;
import com.Entity.Student;
import com.Service.StudentService;

public class StudentController {
	StudentService service=null;
	public List <Student> getAllStudentController(){
	 service=new StudentService();
		List<Student> db =service.getAllStudentService();
		return db;
}
	public List<Student> getAllStudentListnameStartswicth(String ch) {
		service=new StudentService();
		List<Student> db =service.getAllStudentListnameStartswicthAservice( ch);
		return db;
	}
public List<Student> getStudentMarksAbove(int i) {
		
		service = new StudentService();
		List<Student> db = service.getStudentMarksAbove(i); 
		
		return db;
		
	}
public List<Student> getStudentByRollNum(int i) {
	
	service = new StudentService();
	List<Student> db = service.getStudentByRollNum( i); 
	
	return db;
	
}
//public List<Student> getStudentByReverse() {
//	service = new StudentService();
//	List<Student> db=service.getStudentByReverse() ;
//			
//	return db;
//}
}
