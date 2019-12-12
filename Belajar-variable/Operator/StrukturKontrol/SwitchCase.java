public class SwitchCase{
    public static void main(String[] args){

        int bulan = 2; // 2 berarti febuari
        switch(bulan){
            case 1:
            System.out.println("Januari");
            break;
            case 2:
            System.out.println("Febuari");
            break;
            default:
            System.out.println("Desember");
            break;
        }
    }
}