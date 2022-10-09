package nLayeredCourses.dataAccess;

import nLayeredCourses.entities.Lecturer;

public class JdbcLecturerDao implements ILecturerDao{
	
	@Override
	public void add(Lecturer lecturer) {
		System.out.println("Eğitmen veritabanına eklendi{JDBC} ");
		
	}
}
