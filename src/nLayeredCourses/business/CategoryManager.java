package nLayeredCourses.business;

import core.logging.ILogger;
import nLayeredCourses.dataAccess.ICategoryDao;
import nLayeredCourses.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private ILogger[] loggers;
	

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception
	{   
		
		Category[] categories = {
				new Category(1,"Yazılım Kursları"),
				new Category(2,"Donanım Kursları"),
				new Category(3,"Veri Bilimi Kursları")
			
	};
		
		for (Category ctgry : categories) {
			if (ctgry.getCategoryName().equals(category.getCategoryName())) {
				
				System.out.println("Kategori isimleri aynı olamaz");
				throw new Exception("Lütfen yeni bir kategori ismi giriniz...");
			}
		}
		
		categoryDao.add(category);
		
		
		for (ILogger logger : loggers) { 
			logger.log(category.getCategoryName());
		}
	}
}

