package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollegeServicer {
	private static Map<Integer,College>college=new HashMap();
	private static int index=2;
	static {
		College c1=new College(1,"nampally", "idpgdc","1800000125");
		College c2=new College(2,"secundrabad","govtjunior college","7702870521");
		 
		college.put(1, c1);
		college.put(2, c2);
		
	}
	public static List<College> getcollegDetails()
	{return new ArrayList<>(college.values());

	}

	public static College getCollegeDtetailsById(int collegeId)
	{
		return  college.get(collegeId);
	}
	public static College addCollegeDetails(College col)
	{
		index+=1;
		col.setCollege_id(index);
		college.put(index,col);
		
		return col;
	}

	public static College removeCollegeDetailsById(int collegeId) {
		// TODO Auto-generated method stub
		return college.remove(collegeId);
	}
}
