package generic;

public class Utility {
    public static <T> String formatHarga(T data) {
        return "Rp " + data.toString();
    }
}