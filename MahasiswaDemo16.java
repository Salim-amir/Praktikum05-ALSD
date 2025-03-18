import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlah = sc.nextInt();
    sc.nextLine();
    MahasiswaBerprestasi16 list = new MahasiswaBerprestasi16(jumlah);

    for (int i = 0; i < jumlah; i++) {
        System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");
        System.out.print("NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Nama  : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        list.tambah(new Mahasiswa16(nim, nama, kelas, ipk));
    }

    System.out.println("\nData Mahasiswa sebelum sorting:");
    list.tampil();

    System.out.println("\nData Mahasiswa setelah sorting berdasarkan IPK (DESC):");
    list.insertionSort();
    list.tampil();

    sc.close();
}

}