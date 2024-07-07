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