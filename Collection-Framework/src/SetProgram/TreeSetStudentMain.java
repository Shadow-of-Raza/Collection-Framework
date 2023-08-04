package SetProgram;

import java.util.Comparator;
import java.util.TreeSet;

class Student{
	int sid;
	String sname;
	float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}

class SortID implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2) 
	{
		if (s1.sid> s2.sid)
			return -1;
		else if(s1.sid<s2.sid)
			return 1;
		return 0;
	}
}
public class TreeSetStudentMain 
{
	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<Student>(new SortID());
		
		Student s1 = new Student(1, "Akash", 45000);
		Student s2 = new Student(10, "Kiran", 55000);
		Student s3 = new Student(3, "Mohd", 65000);
		Student s4 = new Student(11, "Sasikant", 95000);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		System.out.println(ts + " ");
	}

}
