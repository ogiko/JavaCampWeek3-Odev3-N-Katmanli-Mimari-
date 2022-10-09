package nLayeredCourses.dataAccess;


import nLayeredCourses.entities.Lecturer;

public class HibernateLecturerDao implements ILecturerDao{
	@Override
	public void add(Lecturer lecturer) {
		System.out.println("Eğitmen veritabanına eklendi{Hibernate} ");
		
	}
}
