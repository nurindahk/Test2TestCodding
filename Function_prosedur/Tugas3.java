import java.util.Scanner;

public class Tugas3{
    public static void main(String[] args){
        
        boolean runApp = true;
        while(runApp == true){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih 1 untuk Luas Segitiga");
        System.out.println("Pilih 2 untuk Volume Balok");
        System.out.println("Pilih 3 untuk Volume Prisma Segitiga");
        System.out.println("Pilih 4 untuk Volume Kerucut");
        System.out.println("Pilih 5 untuk stop aplikasi");
        System.out.print("Masukkan Pilihan Anda : ");
        int masukan = input.nextInt();


        switch(masukan){
            case 1 : 
                System.out.print ("Alas : ");
                int alas = input.nextInt();
                System.out.print ("Tinggi : ");
                int tinggi = input.nextInt();
                luasSegitiga(alas, tinggi);
                break;
            case 2 :
                System.out.print ("Panjang : ");
                int p = input.nextInt();
                System.out.print ("Lebar : ");
                int l = input.nextInt();
                System.out.print ("Tinggi : ");
                int t = input.nextInt();
                luasBalok(p, l, t);
                break;
            case 3 :
                System.out.print ("Panjang : ");
                int panjang = input.nextInt();
                System.out.print ("Lebar : ");
                int lebar = input.nextInt();
                System.out.print ("Tinggi : ");
                int tinggiPrisma = input.nextInt();
                volumePrisma(panjang, lebar, tinggiPrisma);
                break;
            case 4 :
                System.out.print ("r : ");
                double r = input.nextInt();
                System.out.print ("Tinggi : ");
                double tinggiKerucut = input.nextInt();
                luasLingkaran(r);
                VolumeKerucut(r, tinggiKerucut);
                break;
            case 5 :
                System.exit(1);
            }
        }
    }
        public static void luasSegitiga(int alas, int tinggi){
            double luas = (alas * tinggi) /2;
            System.out.println(luas);
        }
        public static void luasBalok(int p, int l, int t){ 
            double luas = (p * l * t);
            System.out.println(luas);
        }
        public static void volumePrisma(int panjang, int lebar, int tinggiPrisma){
            double volume = (panjang * lebar * tinggiPrisma) /2;
            System.out.println(volume);
        }
        public static double luasLingkaran(double r){ 
            final double pi = 3.14159265359;
            double luas = r*r*pi;
            return luas;
        }
        public static void VolumeKerucut(double r, double tinggiKerucut){ 
            double luasAlas = luasLingkaran(r);
            double volume = luasAlas * tinggiKerucut / 3;
            System.out.println(volume);
        }

}
