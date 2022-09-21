package entity;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LenovoComputer extends Computer{
    public LenovoComputer(Displayer displayer, Printer printer){
        super(displayer, printer);
    }
}
