import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int omzetBeliau = 0, omzetMereka = 0, omzetKita = 0, totalTrip = 0;
        int biayaPerKm = 13000;
        String inputLagi;
        
        do {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String driver = scanner.next();

            System.out.print("Lama trip (km): ");
            int km = scanner.nextInt();
            totalTrip += km;
            
            
            switch (driver) {
                case "Beliau":
                    omzetBeliau += km * biayaPerKm;
                    break;
                case "Mereka":
                    omzetMereka += km * biayaPerKm;
                    break;
                case "Kita":
                    omzetKita += km * biayaPerKm;
                    break;
                default:
                    System.out.println("Driver tidak valid!");
            }
            
            System.out.print("Input lagi (Y/N)?: ");
            inputLagi = scanner.next();
        } while (inputLagi.equalsIgnoreCase("Y"));
        
       
        String driverTertinggi;
        int omzetTertinggi;
        
        if (omzetBeliau > omzetMereka && omzetBeliau > omzetKita) {
            driverTertinggi = "Beliau";
            omzetTertinggi = omzetBeliau;
        } else if (omzetMereka > omzetBeliau && omzetMereka > omzetKita) {
            driverTertinggi = "Mereka";
            omzetTertinggi = omzetMereka;
        } else {
            driverTertinggi = "Kita";
            omzetTertinggi = omzetKita;
        }
        
        
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);
        
        scanner.close();
    }
}
