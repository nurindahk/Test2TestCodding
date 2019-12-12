public class NestedIf{
    public static void main(String[] args){
        boolean hujan = true;
        boolean adaPayung = true;

        if(hujan == true){
            //dimana hari itu hujan
            if(adaPayung == true){
                //hari hujan dan ada payung
                System.out.println("Boleh keluar rumah karena ada payung");
            }
            else{
                //hari hujan dan tidak ada payung
                System.out.println("Tidak ada payung jadi tidak boleh keluar rumah");
            }
        }
        else{
            //dimana hari itu tidak hujan
            if(adaPayung == true){
                //hari tidak hujan dan ada payung
                System.out.println("Boleh keluar rumah dan boleh bawa payung yang ada");
            }
            else{
                //hari tidak hujan dan tidak ada payung
                System.out.println("tidak ada payung tetapi boleh keluar rumah karena tidak hujan");
            }
        }
    }
}