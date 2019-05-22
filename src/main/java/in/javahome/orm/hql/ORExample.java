package in.javahome.orm.hql;

import in.javahome.orm.HibUtil;
import in.javahome.orm.entity.Employee;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class ORExample {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Query sql = session.createQuery("from Employee where empId=? OR empName=?");
	sql.setInteger(0, 1);
	sql.setString(1, "Chandra");
	List<Employee> emps = sql.list();
	for (Employee emp : emps) {
		System.out.println("Emp Id "+emp.getEmpId());
		System.out.println("Emp Name "+emp.getEmpName());
		System.out.println("Email "+emp.getMailId());
		System.out.println("--------------------------------");
	}
}
}
