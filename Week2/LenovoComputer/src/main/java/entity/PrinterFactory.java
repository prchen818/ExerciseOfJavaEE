package entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class PrinterFactory {
    @Bean("hpPrinter")
    public Printer getHPPrinter(){
        return new HPPrinter();
    }

    @Bean("epsonPrinter")
    public Printer getEpsonPrinter(){
        return new EpsonPrinter();
    }
}
