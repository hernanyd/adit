 ///ADITYA WIDIANTO//
        //227064516014//

package javaapplication1;
import java.util.Scanner;
public class utsalgoritma {
   
    public static void main(String[] args) {
    
     Scanner scanner = new Scanner(System.in);
         
        // Menampilkan judul program
        
        System.out.println("// COLDPLAY MUSIC OF SPHERES //");
        System.out.println("========== WORLD TOUR ==========");
        System.out.println("GELORA BUNG KARNO STADIUM JAKARTA");
        
        // Menampilkan kategori tiket yang tersedia
        System.out.println("Kategori tiket yang tersedia:");
        System.out.println("1. ULTIMATE EXPERIENCE (CAT1) IDR 11.000.000");
        System.out.println("2. MY UNIVERSE (FESTIVAL) IDR 5.700.000");
        System.out.println("3. CAT1 (NUMBERED SEATING)IDR 5.000.000");
        System.out.println("4. CAT2 (NUMBERED SEATING)IDR 4.000.000");
        System.out.println("5. CAT3 (NUMBERED SEATING)IDR 3.250.000");
        System.out.println("6. CAT4 (NUMBERED SEATING)IDR 2.500.000");
        
        // Mengambil input dari pengguna
        System.out.print("Pilih kategori tiket (1-6): ");
        int Cat = scanner.nextInt();
        System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
        int quantity = scanner.nextInt();
        
        // Menghitung total harga
        int price = 0;
        switch (Cat) {
            case 1:
                price = 11000000;
                break;
            case 2:
                price = 5700000;
                break;
            case 3:
                price = 5000000;
                break;
            case 4:
                price = 4000000;
                break;
            case 5: 
                price = 3200000;
                break;
            case 6:
                price = 2500000;
                break;        
            default:
                System.out.println("Kategori tiket tidak valid.");
                return;
        }
        int total = price * quantity;
        
        // Menampilkan invoice pembelian
        System.out.println("=============================================");
        System.out.println(" INVOICE PEMBELIAN");
        System.out.println("=============================================");
        System.out.println("Kategori Tiket: Cat " + Cat);
        System.out.println("Jumlah Tiket : " + quantity);
        System.out.println("Harga Tiket : Rp" + total);
        System.out.println("=============================================");
        
        // Mengambil input jumlah uang yang akan dibayarkan
        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        int payment = scanner.nextInt();
        
        // Menghitung kembalian
        int change = payment - total;
        
        // Menampilkan kembalian
        System.out.println("Kembalian : Rp" + change);
    }
}    
    
   
            

    
