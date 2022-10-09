package nLayeredCourses.dataAccess;


import nLayeredCourses.entities.Course;

public class HibernateCourseDao implements ICourseDao{


	@Override
	public void add(Course course) {
		System.out.println("Kurs veritabanına eklendi{Hibernate} ");
		
	}
	

}
