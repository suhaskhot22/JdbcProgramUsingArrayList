package com.demo.jdbcUsingArrayList;

import java.util.ArrayList;

public class College {
public ArrayList<Student> allData()
{
	Student s1=new Student();
	s1.setRollno(11);
	s1.setName("ak");
	
	Student s2=new Student();
	s2.setRollno(12);
	s2.setName("Sk");
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	
	return al;
}
}
