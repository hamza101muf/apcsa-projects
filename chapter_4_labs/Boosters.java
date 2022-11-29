/* 
 * Hamza Mufti
 * 11/28/22
 * Runner program for the BandBoosters class file
 */
import java.util.Scanner;

public class Boosters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BandBooster booster1 = new BandBooster("Donald");
        BandBooster booster2 = new BandBooster("Duck");
        for (int i=1; i<=3;i++){
            System.out.println("Enter the number of boxes sold by "+booster1.getName()+" during week "+i+": ");
            booster1.updateSales(scan.nextInt());
            System.out.println("Enter the number of boxes sold by "+booster2.getName()+" during week "+i+": ");
            booster2.updateSales(scan.nextInt());
        }
        System.out.println(booster1);
        System.out.println(booster2);

        scan.close();
    }
}
