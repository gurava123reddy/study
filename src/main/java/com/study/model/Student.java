package com.study.model;

import java.util.List;

public class Student {
	
	private String curriculum;
	private int stuId;
	private String stuName;
	private String stuSchool;
	private String stuSchoolLocation;
	private StuAddress stuAddress;
	public StuAddress getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(StuAddress stuAddress) {
		this.stuAddress = stuAddress;
	}
	private List<StuMarks> markList;
	public String getCurriculum() {
		return curriculum;
	}
	public void setCurriculum(String curriculum) {
		this.curriculum = curriculum;
	}
	public List<StuMarks> getMarkList() {
		return markList;
	}
	public void setMarkList(List<StuMarks> markList) {
		this.markList = markList;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSchool() {
		return stuSchool;
	}
	public void setStuSchool(String stuSchool) {
		this.stuSchool = stuSchool;
	}
	public String getStuSchoolLocation() {
		return stuSchoolLocation;
	}
	public void setStuSchoolLocation(String stuSchoolLocation) {
		this.stuSchoolLocation = stuSchoolLocation;
	}
	@Override
	public String toString() {
		return "Student [curriculum=" + curriculum + ", stuId=" + stuId + ", stuName=" + stuName + ", stuSchool="
				+ stuSchool + ", stuSchoolLocation=" + stuSchoolLocation + ", stuAddress=" + stuAddress + ", markList="
				+ markList + "]";
	}
}
