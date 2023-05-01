import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat cat = (Cat) applicationContext.getBean("Cat");
        Cat cat2 = (Cat) applicationContext.getBean("Cat");
        boolean beanHelloWorld = bean.equals(bean2);
        boolean beanCat = cat.equals(cat2);
        System.out.println(beanHelloWorld);
        System.out.println(beanCat);
        System.out.println(cat.getMessage());
    }
}