package nLayeredCourses.business;

import core.logging.ILogger;
import nLayeredCourses.dataAccess.ILecturerDao;
import nLayeredCourses.entities.Lecturer;

public class LecturerManager {
	private ILecturerDao lecturerDao;
	private ILogger[] loggers;

	public LecturerManager(ILecturerDao lecturerDao,ILogger[] loggers) {
		this.lecturerDao = lecturerDao;
		this.loggers = loggers;
	}
	
	public void add(Lecturer lecturer) throws Exception
	{
		
		lecturerDao.add(lecturer);
		
		
		for (ILogger logger : loggers) { 
			logger.log(lecturer.getFirstName());
		}
	}
}
