package com.study.model;

import java.sql.Date;

public class StuMarks {
	
	private String stuExamType;
	private String examDate;
	private int stuId;
	private String stuName;
	private int mathematics;
	private int physics;
	public String getStuExamType() {
		return stuExamType;
	}
	public void setStuExamType(String stuExamType) {
		this.stuExamType = stuExamType;
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
	
	
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public int getMathematics() {
		return mathematics;
	}
	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
	@Override
	public String toString() {
		return "StuMarks [stuExamType=" + stuExamType + ", examDate=" + examDate + ", stuId=" + stuId + ", stuName="
				+ stuName + ", mathematics=" + mathematics + ", physics=" + physics + "]";
	}
}
