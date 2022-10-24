package kodlamaioWithNLayeredApp.dataAccess;

import kodlamaioWithNLayeredApp.entities.Categories;
import kodlamaioWithNLayeredApp.entities.Courses;

public class JdbcDao implements ICoursesDao,ICategoriesDao{

    @Override
    public void add(Categories categories) {

        System.out.println("Added to database with Jdbc.");
    }

    @Override

    public void add(Courses courses) {
        System.out.println("Added to database with Jdbc.");
    }
}
