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

package uas;

import java.util.Scanner;

public class RiderBeraksi {
    public static void main(String[] args) {
        //objek
        //Rider rdr = new Rider("Lazer","1");
        
        //System.out.println(rdr.displayInfo());
        //System.out.println(rdr.displayInfo("10"));
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);
        
            //array
            RiderDetail[] rdr = new RiderDetail[2];
        
            //perulangan
            for(int i=0; i<rdr.length; i++) {
                System.out.print("Masukkan Nama rider "+(i+1)+": ");
                String ridernama = scanner.nextLine();
                System.out.print("Masukkan Level rider "+(i+1)+": ");
                String riderlevel = scanner.nextLine();
        
                //objek
                rdr[0] = new RiderDetail(ridernama, riderlevel);
            }
        
            //perulangan
            for(RiderDetail data: rdr){
                System.out.println("================");
                System.out.println("Data Rider:     ");
                System.out.println(data.displayInfo());
            }    
        } catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format level: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: "+e.getMessage());
        }                
    }            
}

package uas;

//inheritance
public class RiderDetail extends Rider {
    //overriding
    public RiderDetail(String ridernama, String riderlevel) {
        super(ridernama, riderlevel);
    }
    
    public int getCreated() {
        return Integer.parseInt(getRiderlevel().substring(0, 50)) + 100;
    }
    
    public String getPower(){
        String kodePwr = getRiderlevel().substring(2, 4);
        //seleksi if
        if(kodePwr.equals("10")){
            return "Power Super Speed";
        } else {
            return "Power lain";
        }
    }
    
    public String getStamina(){
        String kodeSmn = getRiderlevel().substring(4, 6);
        //seleksi switch
        switch(kodeSmn){
            case "10": 
                return "Full Stamina";
            case "20":
                return "Half Stamina";
            default:
                return "No Stamina";
        }
    }
    
    public int getHealth(){
        return Integer.parseInt(getRiderlevel().substring(10));
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nCreated: "+getCreated()+
                "\nPower: "+getPower()+
                "\nStamina: "+getStamina()+
                "\nHealth: "+getHealth();
    }
}
