import Model.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    MahasiswaDataView mahasiswaDataView = new MahasiswaDataView();
    Scanner sc = new Scanner(System.in);
    int menu = 2;
    while (menu !=0) {

        System.out.println("=== Pilih Menu===");
        System.out.println("1. Mahasiswa");
    menu = sc.nextInt();
    if (menu == 1) {
        System.out.println("=== Pilih Aksi===");
        System.out.println("1.Tampilkan Semua Data");
        System.out.println("2.Cari Satu Data");
        System.out.println("3.Tambah Data");
        System.out.println("4.Ubah Data");
        System.out.println("5.Delete Data");
        int pilihan = sc.nextInt();
        switch (pilihan) {
        case 1:
            mahasiswaDataView.getList();
            break;
            case 2:
                System.out.println("nim:");
                String nim = sc.nextLine();
                mahasiswaDataView.printByPk(nim);
                break;
            default:
                break;
        }
    }

    }
    }
}
