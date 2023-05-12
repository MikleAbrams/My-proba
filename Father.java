package zaniatija.project_Family;

import org.w3c.dom.ls.LSOutput;

public class Father extends Family {
    public Father(String statusFam, String name, int age, String statusWork){
        super(statusFam, name, age, statusWork);
    }

    public void objectFather () {
        Family father1 = new Family("Папа", "Игорь Петрович", 49, "Работает на заводе, тапицер");
        System.out.println(father1.getParametry());

    }


    }
