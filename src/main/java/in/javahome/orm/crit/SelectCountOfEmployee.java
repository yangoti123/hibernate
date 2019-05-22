package in.javahome.orm.crit;

import in.javahome.orm.HibUtil;
import in.javahome.orm.entity.Employee;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;


public class SelectCountOfEmployee {
public static void main(String[] args) {
	Session session = HibUtil.getSession();
	Criteria crit = session.createCriteria(Employee.class);
	crit.setProjection(Projections.count("empId"));
	System.out.println(crit.uniqueResult());
}
}
