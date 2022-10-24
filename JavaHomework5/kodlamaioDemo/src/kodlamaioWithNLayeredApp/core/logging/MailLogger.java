package kodlamaioWithNLayeredApp.core.logging;

public class MailLogger implements ILogger{

    @Override
    public void log(String data1) {
        System.out.println("Data has been logged to Mail : "+data1);


    }
}
