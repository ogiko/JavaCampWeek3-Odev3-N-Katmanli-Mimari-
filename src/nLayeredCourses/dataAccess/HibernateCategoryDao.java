package nLayeredCourses.dataAccess;


import nLayeredCourses.entities.Category;


public class HibernateCategoryDao implements ICategoryDao{
	@Override
	public void add(Category category) {
		System.out.println("Kategori veritabanına eklendi{Hibernate} ");
		
	}

}
