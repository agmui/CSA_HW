import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Random;

class Del{
    public static void main(String[] args) {
        //GreetingService greetService1 = (message) -> System.out.println("salutation" + message) + greetService1.sayMessage("Mahesh");
        //greetService1.sayMessage("Mahesh");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}