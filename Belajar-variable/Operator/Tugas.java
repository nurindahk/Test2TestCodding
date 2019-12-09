public class Tugas{
    public static void main(String[] args){

        int nilai = Integer.parseInt(args[0]);
        String read = nilai%2 == 0 ? "Genap" : "Ganjil";
        System.out.println(read);

    }
}