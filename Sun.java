package zaniatija.project_Family;

import zaniatija.demo_ZADANIJE.Person;

public class Sun extends Family{

    Family sun1 = new Family("Сын", "Сергей Игоревич", 12, "Учусь в школе, 6 класс");

    public Sun(String statusFam, String name, int age, String statusWork) {
        super(statusFam, name, age, statusWork);
    }

        public boolean slushaetsa (Family mother1) {
            System.out.println(sun1.getName() + " слушается " + mother1.getName());
            return true;
    }
}
