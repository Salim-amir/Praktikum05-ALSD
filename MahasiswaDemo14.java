import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            list.tambah(new Mahasiswa14(nim, nama, kelas, ipk));
        }

        System.out.println("\nData mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC):");
        list.selectionSort();
        list.tampil();

        sc.close();
    }
}