import entity.VehicleFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("entity")
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Main.class);
        for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("=======================");
        System.out.println("The condition now is: " + VehicleFactory.myCondition);
        System.out.println("Bean car assembled:"+applicationContext.containsBean("car"));
        System.out.println("Bean bike assembled:"+applicationContext.containsBean("bike"));
    }
}
