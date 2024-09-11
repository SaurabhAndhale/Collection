package com.Dao;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Student;


public class Studentdao {
public List <Student> getAllStudents(){
	List<Student> db=new ArrayList<Student>();
	int [] c= {1,2,3};
	db.add(new Student("jay",1,70));
	db.add(new Student("sai",2,77));
	db.add(new Student("ram",3,89));
	db.add(new Student("Viru",4,99));
	db.add(new Student("sam",5,60));
return db;	
}
}