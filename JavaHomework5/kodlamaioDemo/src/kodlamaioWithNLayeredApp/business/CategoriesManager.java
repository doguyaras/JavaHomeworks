package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.ILogger;
import kodlamaioWithNLayeredApp.dataAccess.ICategoriesDao;
import kodlamaioWithNLayeredApp.entities.Categories;

import java.util.List;

public class CategoriesManager {

    private ICategoriesDao categoriesDao;
    private ILogger[] loggers;
    private List <Categories> categoriesList;

    public CategoriesManager(ICategoriesDao categoriesDao,ILogger[] loggers,List<Categories> categoriesList) {
        this.categoriesDao = categoriesDao;
        this.loggers = loggers;
        this.categoriesList = categoriesList;
    }

    public void add(Categories categories) throws Exception {

        for(Categories checkCategories : categoriesList){
            if(categories.getCategoryName().equals(checkCategories.getCategoryName())){
                throw new Exception("Category name can not be same!");
            }
        }
        for (ILogger logger : loggers){
            logger.log(categories.getCategoryName());
        }
        categoriesDao.add(categories);
    }



}
