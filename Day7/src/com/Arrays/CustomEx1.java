package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

class Student 
{
	
	private int id;
	private String sname;
	private int[] marks;
	private String[] hobby;
	
	
	
   public Student() {
	// TODO Auto-generated constructor stub
}
	

	public Student(int id, String sname, int[] marks, String[] hobby) {
		super();
		this.id = id;
		this.sname = sname;
		this.marks = marks;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}


	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	public String[] getHobby() {
		return hobby;
	}


	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", marks=" + Arrays.toString(marks) + ", hobby="
				+ Arrays.toString(hobby) + "]";
	}
	
}

public class CustomEx1
{
	public static void main(String[] args) 
	{
		
		
		Student s = new Student();
		//Student[] s1 = new Student[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Id:");
		int id = sc.nextInt();
		System.out.println("Enter Name:");
		String n = sc.next();
		System.out.println("ENter No of marks:");
		int marks = sc.nextInt();
	   
	    
		int m[] =  new int[marks];
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println("Enter Subject "+i+" Marks:");
			m[i] = sc.nextInt();
		}
		
		
		 System.out.println("ENter No of Hobbys:");
		 int h = sc.nextInt();
		
		String hob[] =  new String[h];
		
		for(int i=0;i<hob.length;i++)
		{
			System.out.println("ENter Your "+i+" Hobby:");
			hob[i] = sc.next();
		}
		
		s.setId(id);
		s.setSname(n);
		s.setMarks(m);
		s.setHobby(hob);
		
		System.out.println(s);	
		
	}	
	}

