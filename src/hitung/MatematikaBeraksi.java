package hitung;

public class MatematikaBeraksi {
   public static void main(String[] args) {
        // Membuat objek
        Matematika nadia = new Matematika(0, 0);

        System.out.println("Penjumlahan : " + nadia.setPenjumlahan());
        
        System.out.println("Pengurangan : " + nadia.setPengurangan());
        
        System.out.println("Perkalian : " + nadia.setPerkalian());
        
        System.out.println("Pembagian : " + nadia.setPembagian());
    }
}
