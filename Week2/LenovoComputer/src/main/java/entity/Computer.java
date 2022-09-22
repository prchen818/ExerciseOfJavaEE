package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class Computer {
    Displayer displayer;
    Printer printer;

    @Override
    public String toString() {
        return "Computer{" +
                "displayer=" + displayer +
                ", printer=" + printer +
                '}';
    }
}
