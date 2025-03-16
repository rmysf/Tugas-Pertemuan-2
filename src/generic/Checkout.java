package generic;

public interface Checkout<T> {
    void proses(T input);
}

class CheckoutProses implements Checkout<KeranjangBelanja> {
    @Override
    public void proses(KeranjangBelanja keranjang) {
        System.out.println("Checkout berhasil! Total: " + keranjang.hitungTotal());
    }
}
