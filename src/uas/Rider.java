package uas;

//class
public class Rider {
    //atribut dan encapsulation
    private String ridernama;
    private String riderlevel;

    //constructor
    public Rider(String ridernama, String riderlevel) {
        this.ridernama = ridernama;
        this.riderlevel = riderlevel;
    }
    
    //mutator (setter)
    public void setRidernama(String ridernama) {
        this.ridernama = ridernama;
    }

    public void setRiderlevel(String riderlevel) {
        this.riderlevel = riderlevel;
    }
    
    //accessor (getter)
    public String getRidernama() {
        return ridernama;
    }

    public String getRiderlevel() {
        return riderlevel;
    }
    
    public String displayInfo() {
        return "RiderNama: "+getRidernama()+
               "\nRiderLevel: "+getRiderlevel();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String gauge){
        return displayInfo() + "\nGauge: "+gauge;
    }
}
