package kodlamaioWithNLayeredApp.core.logging;

public class DatabaseLogger implements ILogger{

    @Override
    public void log(String data1) {
        System.out.println("Data has been logged to Database : "+data1);


    }
}
