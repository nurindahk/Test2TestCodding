public class Penghasilan{
            public static void main(String[] args){
                double GajiPokok = 4600897;
                double Tunjangan = 0.1 *GajiPokok;
                int jmlAnak = 4;
                double TunjanganAnak = jmlAnak *0.2 * GajiPokok;
                double bruto = GajiPokok + Tunjangan + TunjanganAnak;
                double Iuran = 0.4*GajiPokok;
                double netto = bruto - Iuran;
                
                System.out.println("Gaji Pokok             :       Rp."+GajiPokok);
                System.out.println("Jumlah Anak            :          "+jmlAnak+" Anak");
                System.out.println("Tunjangan Ortu         :       Rp."+Tunjangan);
                System.out.println("Tunjangan Anak         :       Rp."+TunjanganAnak);
                System.out.println("Bruto                  :       Rp."+bruto);
                System.out.println("Iuran                  :       Rp."+Iuran);
                System.out.println("Netto                  :       Rp."+netto);
            }
        }
    