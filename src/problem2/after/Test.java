package problem2.after;

public class Test {
    public static void main(String[] args) {
        try {
            Laptop laptop1 = new Laptop.Builder("i7")
                    .ram(16)
                    .ssd(512)
                    .backlitKeyboard()
                    .accessory("Mouse")
                    .build();
            System.out.println(laptop1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Laptop laptop2 = new Laptop.Builder("i5")
                    .ram(-8)
                    .build();
            System.out.println(laptop2);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        Laptop studentLaptop = new Laptop.Builder("i5").ram(8).build();
        Quote studentPreset = new Quote(studentLaptop).addService("Setup");

        PresetRegistry registry = new PresetRegistry();
        registry.register("student", studentPreset);

        Quote q1 = registry.create("student").forCustomer("SAFI Amal").addService("Extended warranty");
        Quote q2 = registry.create("student").forCustomer("ALAMI Samir");

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q1.getLaptop() == q2.getLaptop());
    }
}
