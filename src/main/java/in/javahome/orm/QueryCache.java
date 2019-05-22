package in.javahome.orm;

import in.javahome.orm.entity.Employee;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QueryCache {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Criteria crit = session.createCriteria(Employee.class);
	crit.setCacheable(true);
	crit.list();
	crit.list();
	
}
}
