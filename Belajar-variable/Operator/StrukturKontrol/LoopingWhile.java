import java.util.Scanner; //import class

public class LoopingWhile{
    public static void main(String[] args){
       //membuat input dengan scanner

       /*Scanner input = new Scanner(System.in);
       System.out.print("Masukkan nama : ");
       String nama = input.nextLine();
       System.out.println("Hallo "+nama);*/

       boolean runApp = true; //status aplikasi sedang running

       while(runApp == true){
           Scanner input = new Scanner(System.in);
           System.out.println("Pilih 1 untuk lanjut running aplikasi : ");
           System.out.println("Pilih 2 untuk lanjut running aplikasi : ");
           System.out.println("Pilih 3 untuk stop aplikasi : ");
           int x = input.nextInt();
           switch(x){
               case 1 :
               System.out.println("Kamu pilih 1");
               break;
               case 2 :
               System.out.println("Kamu pilih 2");
               break;
               default :
               runApp = false;
               break;
           }
       
       }
    }
}