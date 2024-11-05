/**
 * Kelas kalkulator berfungsi untuk melakukan operasi matematika dasar seperti 
 * penjumlahan, pengurangan, perkalian, dan pembagian.
 */
public class kalkulator {

    /**
     * Menjumlahkan dua angka.
     *
     * @param a angka pertama yang akan dijumlahkan
     * @param b angka kedua yang akan dijumlahkan
     * @return hasil penjumlahan a dan b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangi angka kedua dari angka pertama.
     *
     * @param a angka pertama
     * @param b angka kedua yang akan dikurangkan dari angka pertama
     * @return hasil pengurangan a - b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua angka.
     *
     * @param a angka pertama yang akan dikalikan
     * @param b angka kedua yang akan dikalikan
     * @return hasil perkalian a dan b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Membagi angka pertama dengan angka kedua.
     *
     * @param a angka pertama (pembilang)
     * @param b angka kedua (penyebut)
     * @return hasil pembagian a / b
     * @throws ArithmeticException jika b bernilai 0, yang menyebabkan pembagian oleh nol
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Pembagian oleh nol tidak diperbolehkan");
        }
        return a / b;
    }

    /**
     * Metode utama yang digunakan untuk menjalankan kalkulator sederhana ini.
     *
     * @param args argumen baris perintah (tidak digunakan dalam aplikasi ini)
     */
    public static void main(String[] args) {
        kalkulator kalkulator = new kalkulator();
        
        double num1 = 10;
        double num2 = 5;

        System.out.println("Penjumlahan: " + kalkulator.add(num1, num2));
        System.out.println("Pengurangan: " + kalkulator.subtract(num1, num2));
        System.out.println("Perkalian: " + kalkulator.multiply(num1, num2));
        System.out.println("Pembagian: " + kalkulator.divide(num1, num2));
    }
}
