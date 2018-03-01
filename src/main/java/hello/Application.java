package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Throwable {
        //Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        SpringApplication.run(Application.class, args);
    }

}
