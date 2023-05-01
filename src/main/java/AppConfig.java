import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "Cat")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    должен создаваться новым при каждом запросе
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setMessage("Cat");
        return cat;
    }
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
}