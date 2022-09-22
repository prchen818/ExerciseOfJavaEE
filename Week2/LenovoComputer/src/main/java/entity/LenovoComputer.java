package entity;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LenovoComputer extends Computer{
    public LenovoComputer(@Qualifier("dellDisplayerFactoryBean") Displayer displayer, @Qualifier("hpPrinter") Printer printer){
        super(displayer, printer);
    }
}
