package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.ILogger;
import kodlamaioWithNLayeredApp.dataAccess.ICoursesDao;
import kodlamaioWithNLayeredApp.entities.Courses;

import java.util.List;

public class CoursesManager {

    private ICoursesDao coursesDao;
    private ILogger[] loggers;
    private List <Courses> coursesList;

    public CoursesManager(ICoursesDao coursesDao,ILogger[] loggers,List<Courses> coursesList) {
        this.coursesDao = coursesDao;
        this.loggers = loggers;
        this.coursesList = coursesList;
    }
    public void add(Courses courses)throws Exception{
        if(courses.getCoursePrice()<0){
            throw  new Exception("Course price can not less than 0!");
        }

        for(Courses checkCourses: coursesList){
            if(courses.getCourseName().equals(checkCourses.getCourseName())){
                throw new Exception ("Course name can not be same!");
            }
            coursesDao.add(courses);
            coursesList.add(courses);
        }

        for(ILogger logger: loggers){
            logger.log(courses.getCourseName());
        }
        coursesDao.add(courses);
    }
}
