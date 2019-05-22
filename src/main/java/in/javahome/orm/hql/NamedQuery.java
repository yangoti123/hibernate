package in.javahome.orm.hql;

import in.javahome.orm.HibUtil;
import in.javahome.orm.entity.Employee;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class NamedQuery {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Query sql = session.getNamedQuery("selectAllEmp");
	sql.setInteger("id", 1);
	sql.setString("name", "Chandra");
	List<Employee> emps = sql.list();
	for (Employee emp : emps) {
		System.out.println("Emp Id "+emp.getEmpId());
		System.out.println("Emp Name "+emp.getEmpName());
		System.out.println("Email "+emp.getMailId());
		System.out.println("--------------------------------");
	}
}
}
