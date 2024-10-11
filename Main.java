class Produk {
    private String nama;   
    private double harga;  

    public Produk() {
        this.nama = "Tidak diketahui";
        this.harga = 0;
    }

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return this.harga;
    }

    public String descries() {
        return "Produk: " + this.nama + ", Harga: $" + this.harga;
    }
}

class Brand {
    private String namaBrand;

    public Brand() {
        this.namaBrand = "Tidak diketahui";
    }

    public Brand(String namaBrand) {
        this.namaBrand = namaBrand;
    }

    public void setNamaBrand(String namaBrand) {
        this.namaBrand = namaBrand;
    }

    public String getNamaBrand() {
        return this.namaBrand;
    }

    public String deskripsi() {
        return "Brand: " + this.namaBrand;
    }
}

class Tas extends Produk {
    private String material; 
    private final Brand brand;

    public Tas(String nama, double harga, String namaBrand, String material) {
        super(nama, harga); 
        this.brand = new Brand(namaBrand);  
        this.material = material;
    }

    public Tas(Brand brand) {
        this.brand = brand;
    }

    public Tas(Brand brand, String nama, double harga) {
        super(nama, harga);
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    @Override
    public String descries() {
        return "Tas dari brand " + this.brand.getNamaBrand() + 
               " model " + this.getNama() + ", material " + this.material + 
               ", harga $" + this.getHarga();
    }

    public Brand getBrand() {
        return brand;
    }
}

class Pakaian extends Produk {
    private String bahan; 
    private final Brand brand;

    public Pakaian(String nama, double harga, String namaBrand, String bahan) {
        super(nama, harga); 
        this.brand = new Brand(namaBrand); 
        this.bahan = bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getBahan() {
        return this.bahan;
    }

    @Override
    public String descries() {
        return "Pakaian dari brand " + this.brand.getNamaBrand() + 
               " model " + this.getNama() + ", terbuat dari bahan " + this.bahan + 
               ", harga $" + this.getHarga();
    }
}

class JamTangan extends Produk {
    private String tipe; 
    private final Brand brand;

    public JamTangan(String nama, double harga, String namaBrand, String tipe) {
        super(nama, harga); 
        this.brand = new Brand(namaBrand);  
        this.tipe = tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getTipe() {
        return this.tipe;
    }

    @Override
    public String descries() {
        return "Jam tangan dari brand " + this.brand.getNamaBrand() + 
               " model " + this.getNama() + ", tipe " + this.tipe + 
               ", harga $" + this.getHarga();
    }
}

public class Main {
    public static void main(String[] args) {

        Tas tas = new Tas("Birkin", 12000, "Hermès", "Kulit premium");
        Pakaian pakaian = new Pakaian("T-shirt", 500, "Balenciaga", "Katun organik");
        JamTangan jamTangan = new JamTangan("Speedmaster", 10000, "Omega", "Chronograph");

        System.out.println(tas.descries());
        System.out.println(pakaian.descries());
        System.out.println(jamTangan.descries());
    }
}