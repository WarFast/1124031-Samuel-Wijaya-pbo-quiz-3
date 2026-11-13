import Model.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    MahasiswaDataView mahasiswaDataView = new MahasiswaDataView();
    Scanner sc = new Scanner(System.in);
    int a = 2;
    while (a !=0) {

        System.out.println("=== Pilih Menu===");
    a = sc.nextInt();
    if (a == 1) {
        System.out.println("=== Pilih Aksi===");
        System.out.println("1.Tampilkan Semua Data");
        System.out.println("2.Cari Satu Data");
        System.out.println("3.Tambah Data");
    }

    }
    }
}
