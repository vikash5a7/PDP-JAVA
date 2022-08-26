package com.vikash;


import java.util.List;
import java.util.Objects;

public class Department {

	String departmentName;
	List<Student> students;

	public Department(String departmentName, List<Student> students) {
		super();
		this.departmentName = departmentName;
		this.students = students;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departmentName, students);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(departmentName, other.departmentName) && Objects.equals(students, other.students);
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", students=" + students + "]";
	}
	
	
	
	
	

}
