package com.study.model;

import java.util.List;

public class GGRTuitionCircle {

	private int id;
	private String location;
	private String inchargeName;
	private List<School> schoolList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInchargeName() {
		return inchargeName;
	}
	public void setInchargeName(String inchargeName) {
		this.inchargeName = inchargeName;
	}
	public List<School> getSchoolList() {
		return schoolList;
	}
	public void setSchoolList(List<School> schoolList) {
		this.schoolList = schoolList;
	}
	@Override
	public String toString() {
		return "GGRTuitionCircle [id=" + id + ", location=" + location + ", inchargeName=" + inchargeName
				+ ", schoolList=" + schoolList + "]";
	}
	
	
}
