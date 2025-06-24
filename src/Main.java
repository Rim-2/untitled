import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CustomInfo {
    String author();
    String date();
    int version() default 1;
}

@CustomInfo(author = "Rim2", date = "2025-06-24", version = 2)
class Demo {

    @CustomInfo(author = "Rim2", date = "2025-06-24")
    public void display() {
        System.out.println("Display method executed.");
    }

}

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Class<?> demoClass = demo.getClass();

        if (demoClass.isAnnotationPresent(CustomInfo.class)) {
            CustomInfo info = demoClass.getAnnotation(CustomInfo.class);
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
            System.out.println("Version: " + info.version());
        }

        try {
            Method m = demoClass.getMethod("display");
            if(m.isAnnotationPresent(CustomInfo.class)) {
                CustomInfo mi = m.getAnnotation(CustomInfo.class);
                System.out.println("Author: " + mi.author());
                System.out.println("Date: " + mi.date());
                System.out.println("Version: " + mi.version());
            }
        } catch (NoSuchMethodException e) {
            e.getStackTrace();
        }
    }
}