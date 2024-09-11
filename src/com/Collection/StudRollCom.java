
package com.Collection;

import java.util.Comparator;

import com.Entity.Student;

//import com.entity.Student;

public abstract class StudRollCom implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return new Integer(o2.getRoll()).compareTo(o1.getRoll());
	}

}
