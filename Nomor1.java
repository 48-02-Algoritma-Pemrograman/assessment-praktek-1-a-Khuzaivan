import java.util.Scanner;

public class Nomor1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int biayaLemburNormal = 10000;
        int biayaLemburTambahan = 15000;
        int jamLemburNormal = 16;
        int sisaJamLembur, jamLembur;
        double honorLembur=0;
        
        
        System.out.print("Total jam lembur: ");
        jamLembur = scanner.nextInt();
        
        if (jamLembur <= jamLemburNormal) {
            honorLembur = jamLembur * biayaLemburNormal;
        } else {
            honorLembur = jamLemburNormal * biayaLemburNormal;
            sisaJamLembur = jamLembur - jamLemburNormal;
            honorLembur += sisaJamLembur * biayaLemburTambahan;
        }
        
        System.out.println("Honor lembur: " + honorLembur);
        
        scanner.close();
    }
}
