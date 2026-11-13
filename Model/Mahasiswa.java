package Model;

public class Mahasiswa {
    private final String nim;
    private final String nama;
    private final String email;
    private final int umur;
    public Mahasiswa(String nim,String nama,String email,int umur) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getEmail() {
        return email;
    }
    public int getUmur() {
        return umur;
    }
}
