package kodlamaioWithNLayeredApp;
import kodlamaioWithNLayeredApp.business.CategoriesManager;
import kodlamaioWithNLayeredApp.business.CoursesManager;
import kodlamaioWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.ILogger;
import kodlamaioWithNLayeredApp.core.logging.MailLogger;
import kodlamaioWithNLayeredApp.dataAccess.HibernateDao;
import kodlamaioWithNLayeredApp.dataAccess.JdbcDao;
import kodlamaioWithNLayeredApp.entities.Categories;
import kodlamaioWithNLayeredApp.entities.Courses;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        Courses course1 = new Courses(1,"Java Kampı",10);
        Courses course2 = new Courses(2,"Flutter Kampı",200);
        Courses course3 = new Courses(3,"Html&CSS Kampı",500);
        List<Courses> courses = new ArrayList<>();

        ILogger[] loggers = {new FileLogger(),new DatabaseLogger(),new MailLogger()};

        CoursesManager coursesManager = new CoursesManager(new HibernateDao(),loggers,courses);
        coursesManager.add(course1);

        System.out.println("----------------------------------");

        Categories categorie1 = new Categories("Back-end Software");
        Categories categorie2 = new Categories("Mobil Software");
        Categories categorie3 = new Categories("Front-end Software");
        List<Categories> categories = new ArrayList<>();

        ILogger[] loggers1 = {new FileLogger(),new DatabaseLogger(),new MailLogger()};

        CategoriesManager categoriesManager = new CategoriesManager(new JdbcDao(),loggers,categories);
        categoriesManager.add(categorie2);


    }
}