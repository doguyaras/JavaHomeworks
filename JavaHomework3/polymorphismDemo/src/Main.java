public class Main {

    public static void main(String[] args) {
//          BaseLogger[] Loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//
//          for (BaseLogger logger:Loggers){
//              logger.Log("Log Mesajı");
//          }

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();


    }
}