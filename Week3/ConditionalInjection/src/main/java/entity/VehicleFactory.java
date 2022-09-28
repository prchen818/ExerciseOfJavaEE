package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;


@Component
public class VehicleFactory {

    public static String myCondition = "car";

    public VehicleFactory(){

    }

    @Bean("bike")
    @Conditional({BikeCondition.class})
    public Vehicle getBike(){
        return new Vehicle("bike");
    }

    @Bean("car")
    @Conditional({CarCondition.class})
    public Vehicle getCar(){
        return new Vehicle("car");
    }
}

class CarCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return VehicleFactory.myCondition.equals("car");
    }
}
class BikeCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return VehicleFactory.myCondition.equals("bike");
    }
}
