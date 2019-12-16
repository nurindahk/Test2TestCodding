public class Intro{
    public static void main(String[] args){ //prosedur
        int a = 5;
        int b = 2;
        hitungLuasSegitiga(a, b); // a dan b adalah argumen
        hitungLuasSegitiga(15, 2); // 15 adalah alas, 2 adalah tinggi
        hitungLuasLingkaran(7);
        System.out.println(LuasLingkaran1);
        hitungVolumeTabung(7, 2);
    }
    // membuat prosedur
    public static void hitungLuasSegitiga(int alas, int tinggi){ //alas dan tinggi adalah parameter
        double luas = (alas * tinggi) /2;
        System.out.println(luas);
    }

    public static double hitungLuasLingkaran(double r){
        final double pi = 3.14159265359;
        double luas = r*r*pi;
        return luas;
    }

    public static void hitungVolumeTabung(double r, double t){
        double LuasLingkaran = hitungLuasLingkaran(r);
        double volume = LuasLingkaran * t;
        System.out.println(volume);
    }
}