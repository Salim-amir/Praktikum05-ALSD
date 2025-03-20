import java.util.Scanner;
public class MainDosen16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen16 listDosen = new DataDosen16();
        int pilihan;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (listDosen.idx >= 10) {
                        System.out.println("Data penuh, tidak bisa menambah!");
                        break;
                    }
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (L = laki-laki, P = perempuan): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen16 dsn = new Dosen16(kode, nama, jenisKelamin, usia);
                    listDosen.tambah(dsn);
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n===== DATA DOSEN =====");
                    listDosen.tampil();
                    break;

                case 3:
                    listDosen.sortingASC();
                    System.out.println("\n===== DATA DOSEN (ASCENDING) =====");
                    listDosen.tampil();
                    break;

                case 4:
                    listDosen.sortingDSC();
                    System.out.println("\n===== DATA DOSEN (DESCENDING) =====");
                    listDosen.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 5);
        sc.close();
    }
}