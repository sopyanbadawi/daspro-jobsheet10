import java.util.Scanner;
public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                        while (true) {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();
                            
                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Baris dan kolom harus antara 1-4 dan 1-2.");
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Tempat sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                                System.out.println("Silakan pilih tempat lain.");
                            } else {
                                penonton[baris - 1][kolom - 1] = nama;
                                System.out.println("Data penonton berhasil ditambahkan.");
                                break;
                            }
                        }
                        break;
                case 2:
                    System.out.println("=== Daftar Penonton ===");
                        for (int i = 0; i < penonton.length; i++) {
                            for (int j = 0; j < penonton[i].length; j++) {
                                if (penonton[i][j] != null) {
                                    System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                                } else {
                                    System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": ***");
                                }
                            }
                        }
                        break;

                case 3:
                System.out.println("Terima kasih! Program selesai.");
                sc.close();
                return;
                default:
                System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar!");
            } System.out.println();
        }
    }
}
