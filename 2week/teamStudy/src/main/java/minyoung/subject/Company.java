package minyoung.subject;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<MultiFunctionPrinter> printers = new ArrayList<MultiFunctionPrinter>();

    public void setPrinters(MultiFunctionPrinter printers) {
        this.printers.add(printers);
    }

    public void removePrinter(MultiFunctionPrinter printer){
        this.printers.remove(printer);
    }



}
