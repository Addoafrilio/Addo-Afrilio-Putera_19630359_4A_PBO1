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
