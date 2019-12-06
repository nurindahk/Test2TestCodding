public class TidakDitambahkanData{
    public static void main(String[] args){
        int a = 1;
        int b = 2;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
    }
}