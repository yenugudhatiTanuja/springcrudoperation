package com.example.demo;
public class College {
	private int college_id;
	private String collegeAdderes;
	private String college_name;
	private String college_contractnumber;
	public College() {
		super();
	}

	public College(int college_id, String collegeAdderes, String college_name, String college_contractnumber) {
		super();
		this.college_id = college_id;
		this.collegeAdderes = collegeAdderes;
		this.college_name = college_name;
		this.college_contractnumber = college_contractnumber;
	}

	public int getCollege_id() {
		return college_id;
	}

	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}

	public String getCollegeAdderes() {
		return collegeAdderes;
	}

	public void setCollegeAdderes(String collegeAdderes) {
		this.collegeAdderes = collegeAdderes;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	public String getCollege_contractnumber() {
		return college_contractnumber;
	}

	public void setCollege_contractnumber(String college_contractnumber) {
		this.college_contractnumber = college_contractnumber;
	}


}

