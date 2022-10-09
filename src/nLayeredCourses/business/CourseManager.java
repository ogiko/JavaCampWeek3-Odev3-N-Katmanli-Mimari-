package nLayeredCourses.business;

import core.logging.ILogger;
import nLayeredCourses.dataAccess.ICourseDao;
import nLayeredCourses.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private ILogger[] loggers;

	public CourseManager(ICourseDao courseDao,ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception
	{
		
		Course[] courses = {
				new Course(1,"C",0),
				new Course(2,"Java",250),
				new Course(3,"Python",400)
		};
		
		for (Course crs : courses) {
			if (crs.getCourseName().equals(course.getCourseName())) {
				
				System.out.println("Kurs isimleri aynı olamaz");
				throw new Exception("Lütfen farklı bir kurs ismi giriniz...");
			}
		}
		
		if (course.getPrice()<0.0) {
			System.out.println("Bir kursun fiyatı 0'dan düşük olamaz");
			throw new Exception("Lütfen kursun fiyatını en az 0 olacak şekilde tekrar giriniz...");
		}

		courseDao.add(course);
		
		for (ILogger logger : loggers) { 
			logger.log(course.getCourseName());
		}
		
	}
}
