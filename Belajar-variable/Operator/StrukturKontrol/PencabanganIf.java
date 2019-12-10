public class PencabanganIf{
    public static void main(String[] args){
        //if(saja)
        boolean hujan = true;

        if(hujan == true){
            System.out.println("Bawa payung");
            System.exit(1);
        }
        System.out.println("Tidak bawa payung"); //default jika tidak ada kondisi yang terpenuhi

         //if else
        int nilai = 90;
        if(nilai > 75){
            System.out.println("Anda Lulus");
        }
        else{
            System.out.println("Maaf anda tidak lulus");
            }

        }
    }