package comparable_interface;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	// this will be use for number type member to sort in ascending order only
//	public int compareTo(Student st) {
//        return this.age - st.age;
//	}

	// this will be use for number type member to sort in descending order only
//	public int compareTo(Student st) {
//        return st.age-this.age;
//	}

	// this will be use for number type member to sort in ascending order only
//	public int compareTo(Student st) {
//        return this.name.compareTo(st.name);
//	}

	// this will be use for number type member to sort in descending order only
	public int compareTo(Student st) {
		return st.name.compareTo(this.name);
	}

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 46));
		al.add(new Student(102, "Maya", 46));
		al.add(new Student(103, "Kanaha", 3));
		al.add(new Student(104, "Kashu", 6));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
