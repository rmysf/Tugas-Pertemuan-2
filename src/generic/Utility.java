package generic;

public class Utility {
    // Method Generic untuk memformat harga
    public static <T> String formatHarga(T data) {
        return "Rp " + data.toString();
    }
}
