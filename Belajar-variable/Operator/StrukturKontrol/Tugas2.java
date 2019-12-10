public class Tugas2{
    public static void main(String[] args){

        try{
            int nilai = Integer.parseInt(args[0]);
            System.out.println(nilai);

        if(nilai >= 100){
            System.out.println("Anda mendapat nilai A");
        }
        else if(nilai >= 84){
            System.out.println("Anda mendapat nilai B");
        }
        else if(nilai >= 74){
            System.out.println("Anda mendapatkan nilai C");
        }
        else if(nilai >= 64){
            System.out.println("Anda mendapatkan nilai D");
        }
        else if(nilai < 44){
            System.out.println("Anda mendapatkan nilai E");
        }
        else{
            System.out.println("Anda salah menginput silahkan coba lagi");
        }
    }
    

        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("tidak boleh diinput huruf");
         }
         }
    }
