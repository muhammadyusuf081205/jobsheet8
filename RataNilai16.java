import java.util.Scanner;
public class RataNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalNilai, nilai, rataNilai;
        for (int i=1; i<=5; i++) {
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke: " +i);
            for (int j=1; j<=5; j++) {
                System.out.print("Nilai Ke: " +j+ "=");
            nilai = sc.nextFloat();
            totalNilai += nilai;
        }
        
        rataNilai=totalNilai/5;
        System.out.println("Rata Rata Nilai Mahasiswa Ke: " +i+ " Adalah " +rataNilai);
        System.out.println();   
    }
    sc.close();
    
}
}