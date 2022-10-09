package nLayeredCourses;

import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import nLayeredCourses.business.CategoryManager;
import nLayeredCourses.business.CourseManager;
import nLayeredCourses.business.LecturerManager;
import nLayeredCourses.dataAccess.HibernateCourseDao;
import nLayeredCourses.dataAccess.JdbcCategoryDao;
import nLayeredCourses.dataAccess.JdbcLecturerDao;
import nLayeredCourses.entities.Category;
import nLayeredCourses.entities.Course;
import nLayeredCourses.entities.Lecturer;

public class Main {

	public static void main(String[] args) throws Exception {
ILogger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		
		
		Lecturer lecturer1 = new Lecturer(1,"Salih","Öner");
		
		LecturerManager lecturerManager = new LecturerManager(new JdbcLecturerDao(),loggers);
		lecturerManager.add(lecturer1);
		System.out.println("*******************\n");

		Course course = new Course(4,"Javascript",0.0);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course);
		System.out.println("*******************\n");
		
		
		Category category = new Category(2,"Selenium");
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers);
		categoryManager.add(category);
		System.out.println("*******************\n");

	}

	}

