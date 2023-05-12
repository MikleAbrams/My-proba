package zaniatija.project_Family;

public class Daughter extends Family {

    Family daughter1 = new Family("Дочка", "Светлана Игоревна", 16, "Учусь в школе, 10 класс");

    public Daughter(String statusFam, String name, int age, String statusWork) {
        super(statusFam, name, age, statusWork);
    }
    public boolean slushaetsa (Family father1) {
        System.out.println(daughter1.getName() + " не слушается " + father1.getName());
        return false;
    }
}
