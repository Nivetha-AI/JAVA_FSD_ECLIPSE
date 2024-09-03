package com.hexa.Springannotation.com.hexa.Springannotation;

public class Result {
  int Marks;
  String Remarks;
public int getMarks() {
	return Marks;
}
public void setMarks(int marks) {
	Marks = marks;
}
public String getRemarks() {
	return Remarks;
}
public void setRemarks(String remarks) {
	Remarks = remarks;
}
public Result(int marks, String remarks) {
	Marks = marks;
	Remarks = remarks;
}
public Result() {
}
@Override
public String toString() {
	return "Result [Marks=" + Marks + ", Remarks=" + Remarks + "]";
}
  
  
}
