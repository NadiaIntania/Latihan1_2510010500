package hitung;

public class Matematika {
    double bil1;
    double bil2;

    // Constructor
    Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    // Method Penjumlahan
    double setPenjumlahan() {
        return bil1 + bil2;
    }
    
    // Pengurangan
    double setPengurangan() {
        return bil1 - bil2;
    }

    // Perkalian
    double setPerkalian() {
        return bil1 * bil2;
    }

    // Pembagian
    double setPembagian() {
        return bil1 / bil2;
    }
}
