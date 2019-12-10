public class Pencabangan2{
    public static void main(String[] args){

        boolean hujan = false;
        boolean adapayung = true;

        if(hujan == true && adapayung == true){
            System.out.println("boleh keluar rumah");
        }
        else if(hujan == true && adapayung == false){
            System.out.println("Tidak boleh keluar rumah");
        }
        else if(hujan == false && adapayung == true){
            System.out.println("boleh keluar rumah tapi payungnya gak ke pake");
        }
        else{
            System.out.println("boleh keluar rumah meski payung tidak ada");
        }
    }
}