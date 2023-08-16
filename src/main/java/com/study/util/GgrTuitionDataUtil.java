package com.study.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.study.model.GGRTuitionCircle;
import com.study.model.School;
import com.study.model.StuAddress;
import com.study.model.StuMarks;
import com.study.model.Student;

public class GgrTuitionDataUtil {
	
	public List<GGRTuitionCircle> getAllGgrTuitionCircle(){
		List<GGRTuitionCircle> GgrTuitionList = new ArrayList<GGRTuitionCircle>();
		
		GGRTuitionCircle ggrTuition;
		ggrTuition = new GGRTuitionCircle();
		ggrTuition.setId(1);
		ggrTuition.setLocation("LIG");
		ggrTuition.setInchargeName("A.Babu");
		
		
		List<School> schoolList = new ArrayList<School>();
		School school;
		school = new School();
		school.setSchooId(1);
		school.setSchoolCurriculum("CBSE");
		school.setSchoolName("Bharathiya Vidya Bhavan");
		school.setSchoolLocation("BHEL");
		school.setSchoolCity("RCPuram");
		
		List<Student> stuList = new ArrayList<Student>();
		Student student;
		student = new Student();
		student.setStuId(1);
		student.setCurriculum("CBSE");
		student.setStuName("Anju Kumari");
		student.setStuSchool("Bharatiya Vidya Bhavan");
		student.setStuSchoolLocation("BHEL");
		
		StuAddress stuAddress;
		stuAddress = new StuAddress();
		stuAddress.setHouseNo("A101");
		stuAddress.setLocation("BHEL");
		stuAddress.setCity("RCPuram");
		stuAddress.setFatherName("R. Murthy");
		stuAddress.setFatherPhoneNo(34278907);
		stuAddress.setMotherPhoneNo(432234657);
		stuAddress.setWhatsAppNo(98674523);
		
		student.setStuAddress(stuAddress);
		
		List<StuMarks> stuMarkList = new ArrayList<StuMarks>();
		StuMarks stuMarks;
		stuMarks = new StuMarks();
		stuMarks.setStuId(1);
		stuMarks.setStuName("Anju Kumari");
		stuMarks.setStuExamType("Weekly Test");		
		stuMarks.setExamDate("2021-7-9");
		stuMarks.setMathematics(20);
		stuMarks.setPhysics(22);
		stuMarkList.add(stuMarks);
		student.setMarkList(stuMarkList);
		stuList.add(student);
		
		school.setStuList(stuList);		
		schoolList.add(school);
		
		ggrTuition.setSchoolList(schoolList);
		GgrTuitionList.add(ggrTuition);
		
		return GgrTuitionList;		
	}
}
