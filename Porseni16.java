import java.util.Scanner;
public class Porseni16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] categori = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int nomorAtlit = 5;
        System.out.print("Masukan Jumlah Politeknik Yang Mendaftar: ");
        int nomorPoliteknik = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[][][] namaAtlit = new String[nomorPoliteknik][categori.length][nomorAtlit];
        // Input nama atlet
        for (int i = 0; i < nomorPoliteknik; i++) {
            System.out.println("Politeknik ke-" + (i + 1) + ":");
            for (int j = 0; j < categori.length; j++) {
                System.out.println(" Cabang " + categori[j] + ":");
                for (int k = 0; k < nomorAtlit; k++) {
                    System.out.print(" Nama Atlit Ke-" + (k + 1) + ": ");
                    namaAtlit[i][j][k] = sc.nextLine();
                }
            }
        }
        // Tampilkan daftar atlet yang terdaftar
        System.out.println("\nDaftar Atlit Yang Terdaftar:");
        for (int i = 0; i < nomorPoliteknik; i++) {
            System.out.println("Politeknik ke-" + (i + 1) + ":");
            for (int j = 0; j < categori.length; j++) {
                System.out.println(" Cabang " + categori[j] + ":");
                for (int k = 0; k < nomorAtlit; k++) {
                    System.out.println(" Nama Atlit ke-" + (k + 1) + ": " + namaAtlit[i][j][k]);
                }
            }
        }
        
        sc.close();
    }
}
