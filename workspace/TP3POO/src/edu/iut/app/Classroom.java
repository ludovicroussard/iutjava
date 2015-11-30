package edu.iut.app;

public class Classroom {
	
	public Classroom() {
		classRoomNumber="not affected";
	}
	public Classroom(String classRoomNumber) {
		//ex2
		this.classRoomNumber = classRoomNumber;
	}
	
	public void setClassroomNumber(String number) {
		//ex2
		this.classRoomNumber = number;
	}
	public String getClassRoomNumber() {
		return classRoomNumber;
	}
	
	protected String classRoomNumber;
}
