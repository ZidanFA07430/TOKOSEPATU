package Entity;

public class Sepatu {
    private String nama;
    private String merk;
    private String warna;
    private String jenis;
    private String gender;
    private int kodeBarang;

    public Sepatu(int kodebarang, String nama , String merk, String warna , String jenis, String gender){
        this.nama = nama;
        this.merk = merk;
        this.warna = warna;
        this.jenis = jenis;
        this.gender = gender;
        this.kodeBarang = kodebarang;
    }
    public Sepatu(){

    }

    public int getKodeBarang(){
        return kodeBarang;
    }

    public String getNama(){
        return nama;
    }

    public String getMerk(){
        return merk;
    }

    public String getWarna(){
        return warna;
    }

    public String getJenis(){
        return jenis;
    }

    public String getGender(){
        return gender;
    }

    public void setKodebarang(int KodeBarang){
        this.kodeBarang = KodeBarang;
    }

    public void setNama(String nama ){
        this.nama = nama;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public void setWarna(String Warna){
        this.warna = Warna;
    }

    public void setJenis(String Jenis){
        this.jenis = Jenis;
    }

    public void setGender(String Gender){
        this.gender = Gender;
    }

    public void insert(Sepatu sepatu) {
    }

    public void update(int index, Sepatu sepatu) {
    }

    public void delete(int index) {
    }
}