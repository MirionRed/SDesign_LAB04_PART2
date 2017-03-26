package studentapp.domain;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> students;
	
	public StudentList() {
		students = new ArrayList<Student>();
	}
	
	public void add(String name) {
		Student aStudent = new Student();
		aStudent.setName(name);
		students.add(aStudent);
	}
	
	public Student search(String name) {
		boolean found = false;
		int i = 0;
		Student aStudent = null;
		while(i<students.size() && !found){
			if (students.get(i).getName().equals(name)){
				found = true;
				aStudent = students.get(i);
			}else{
				i++;
			}
		}
		return aStudent;
	}
}