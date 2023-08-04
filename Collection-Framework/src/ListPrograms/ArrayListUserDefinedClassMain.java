package ListPrograms;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
   int eid;
   String ename;
   float esalary;
public Employee(int eid, String ename, float esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
 }
}
public class ArrayListUserDefinedClassMain {
	public static void main(String[] args) {
		ArrayList<Employee>emplst =new ArrayList<Employee>();
		Employee e1=new Employee(1, "Ramesh", 30000);
		Employee e2=new Employee(2, "Kavitha",40000);
		Employee e3=new Employee(7, "Kiran", 20000);
		Employee e4=new Employee(5, "Poovi", 50000);
		
		emplst.add(e1);
		emplst.add(e2);
		emplst.add(e3);
		emplst.add(e4);
		
		System.out.println(emplst);
		System.out.println("___________________________________");
		Iterator<Employee>eit=emplst.iterator();
		
		System.out.println("EID\tENAME\t  ESALARY");
		System.out.println("-----------------------------------");
          while(eit.hasNext()) { //boolean
         Employee eob=eit.next();
             // System.out.println(eit.next());
        	System.out.println(eob.eid+"\t"+eob.ename+"\t  "+eob.esalary);
          }
  		System.out.println("___________________________________");

	}

}
