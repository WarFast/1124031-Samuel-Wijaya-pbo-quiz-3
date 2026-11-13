package Model;

public class Mahasiswa {
    private final String nim;
    private final String name;
    private final String email;
    private final int usia;
    public Mahasiswa(String nim,String name,String email,int usia) {
        this.name = name;
        this.nim = nim;
        this.email = email;
        this.usia = usia;
    }
    public String getName() {
        return name;
    }
    public String getNim() {
        return nim;
    }
    public String getEmail() {
        return email;
    }
    public int getUsia() {
        return usia;
    }
}
