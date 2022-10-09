package nLayeredCourses.dataAccess;


import nLayeredCourses.entities.Course;

public class JdbcCourseDao implements ICourseDao{
	@Override
	public void add(Course course) {
		System.out.println("Kurs veritabanına eklendi{JDBC} ");
		
	}
}
