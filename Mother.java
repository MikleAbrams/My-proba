package zaniatija.project_Family;

public class Mother extends Family {
    public Mother(String statusFam, String name, int age, String statusWork) {
        super(statusFam, name, age, statusWork);
    }
        Family mother1 = new Family("Мама", "Галина Михайловна", 43, "Домохозяйка");
    public boolean slushaetsa (Family father1){
        System.out.println(mother1.getName() + " слушается " + father1.getName());
        return true;
    }
}
