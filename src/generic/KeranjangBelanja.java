package generic;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk<?>> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk<?> produk) {
        daftarProduk.add(produk);
    }

    public List<Produk<?>> getDaftarProduk() {
        return daftarProduk;
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk<?> p : daftarProduk) {
            total += p.getHarga();
        }
        return total;
    }
}