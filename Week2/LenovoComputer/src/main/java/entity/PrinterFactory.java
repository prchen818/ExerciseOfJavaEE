package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PrinterFactory {
    @Bean
    public Printer getPrinter(){
        return new HPPrinter();
    }
}
