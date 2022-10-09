package nLayeredCourses.dataAccess;


import nLayeredCourses.entities.Category;


public class JdbcCategoryDao implements ICategoryDao{
	@Override
	public void add(Category category) {
		System.out.println("Kategori veritabanına eklendi{JDBC} ");
		
	}
}
