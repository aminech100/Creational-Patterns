package problem2.after;

import java.util.ArrayList;
import java.util.List;

public class Quote {
    private String customerName;
    private final Laptop laptop;
    private List<String> services;

    public Quote(Laptop laptop) {
        this.laptop = laptop;
        this.services = new ArrayList<>();
    }

    public Quote(Quote src){
        this.customerName = src.customerName;
        this.laptop = src.laptop;
        this.services = new ArrayList<>(src.services);
    }

    public Quote copy(){
        return new Quote(this);
    }

    public Quote forCustomer(String name) {
        this.customerName = name;
        return this;
    }

    public Quote addService(String service) {
        this.services.add(service);
        return this;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    @Override
    public String toString() {
        return "Quote for " + customerName + ": services=" + services;
    }

}
