package in.javahome.orm;

import java.util.Set;

import in.javahome.orm.entity.Course;
import in.javahome.orm.entity.Student;

import org.hibernate.Session;

public class GetStudentAdnHisCourses {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student s1 = (Student) session.get(Student.class, 1);
		System.out.println(s1.getName());
		System.out.println(s1.getStdId());
//		Display courses registered by this Student
		
		Set<Course> courses = s1.getCourses();
		for (Course course : courses) {
			System.out.println(course.getCourseName());
			System.out.println(course.getCost());
		}
		
	}
}
