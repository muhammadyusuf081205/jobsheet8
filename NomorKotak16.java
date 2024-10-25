import java.util.Scanner;
public class NomorKotak16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai N (Minimal 3): ");
        int N = sc.nextInt();
        if (N<3) {
            System.out.println("Nilai N Harus Minimal 3.");
            return;
        }
        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++) {
                if (i==0 || i== N - 1 || j==0 || j==N-1) {
                    System.out.print(N + " ");  
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}