package hitung;

public class MatematikaBeraksi {
   public static void main(String[] args) {
        Matematika matematika = new Matematika(20, 10);

       
        System.out.println("Penjumlahan : " + matematika.setPenjumlahan());
        
        System.out.println("Pengurangan : " + matematika.setPengurangan());
        
        System.out.println("Perkalian : " + matematika.setPerkalian());
        
        System.out.println("Pembagian : " + matematika.setPembagian());
    }
}
