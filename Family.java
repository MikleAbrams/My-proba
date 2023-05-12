package zaniatija.project_Family;

import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;

public class Family {

    private String statusFam;
    private String name;
    private int age;
    private String statusWork;
    private String powedenie;
    private boolean slushaetsa;

    public Family(String statusFam, String name, int age, String statusWork) {
    }
//
    public void setParamrtry(String _statusFam, String _name, int _age, String _statusWork, boolean _slushaetsa) {
        this.statusFam = _statusFam;
        this.name = _name;
        this.age = _age;
        this.statusWork = _statusWork;
        this.slushaetsa = true;
    }

    public String getParametry() {
        String myStatusFam = "В семье я - " + statusFam;
        String myName = "Имя :" + name;
        String myAge = "Возраст -" + age;
        String myStatusWork = "Мое занятие :" + statusWork;
        if (slushaetsa) {
            String powedenie = "Он послушный (-ая)";
        } else {
            String powedenie = "Он не послушный (-ая)";
        }

        return myStatusFam + "\n" + myName + "\n" + myAge + "\n" + myStatusWork + "\n" + powedenie;
    }

    public String getStatusFam() {return statusFam;}
    public void setStatusFam(String statusFam) {this.statusFam = statusFam;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getStatusWork() {return statusWork;}
    public void setStatusWork(String statusWork) {this.statusWork = statusWork;}

    public boolean isSlushaetsa() {return slushaetsa;}
    public void setSlushaetsa(boolean slushaetsa) {this.slushaetsa = slushaetsa;}

}








