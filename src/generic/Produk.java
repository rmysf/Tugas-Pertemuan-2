package generic;

public class Produk<T> {
    private T nama;
    private double harga;

    public Produk(T nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public T getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return nama + " - Rp " + harga;
    }
}
