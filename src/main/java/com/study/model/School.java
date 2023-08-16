package com.study.model;

import java.util.List;

public class School {
 
	private int schooId;
	private String schoolName;
	private String schoolLocation;
	private String schoolCity;
	private String schoolCurriculum;
	private List<Student> stuList;
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public int getSchooId() {
		return schooId;
	}
	public void setSchooId(int schooId) {
		this.schooId = schooId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolLocation() {
		return schoolLocation;
	}
	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}
	public String getSchoolCity() {
		return schoolCity;
	}
	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}
	public String getSchoolCurriculum() {
		return schoolCurriculum;
	}
	public void setSchoolCurriculum(String schoolCurriculum) {
		this.schoolCurriculum = schoolCurriculum;
	}
	@Override
	public String toString() {
		return "School [schooId=" + schooId + ", schoolName=" + schoolName + ", schoolLocation=" + schoolLocation
				+ ", schoolCity=" + schoolCity + ", schoolCurriculum=" + schoolCurriculum + ", stuList=" + stuList
				+ "]";
	}
	
	
	
	
	
	
	
}
