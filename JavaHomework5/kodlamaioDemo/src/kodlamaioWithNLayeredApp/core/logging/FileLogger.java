package kodlamaioWithNLayeredApp.core.logging;

public class FileLogger implements ILogger{

    @Override
    public void log(String data1) {
        System.out.println("Data has been logged to File : "+data1);


    }
}
