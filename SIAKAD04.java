import java.util.Scanner;
public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak mahasiswa: ");
        int mhs = sc.nextInt();
        System.out.print("Masukkan banyak mata kuliah: ");
        int matkul = sc.nextInt();
        int[][] nilai = new int[mhs][matkul];
        sc.nextLine();
        for (int i = 0; i < mhs; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            
            for (int j = 0; j < matkul; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");    
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai [i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerSiswa/matkul);
        }

        for (int j = 0; j < matkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < mhs; i++) {
                totalPerMatkul += nilai [i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPerMatkul/mhs);
        }
    }
}
