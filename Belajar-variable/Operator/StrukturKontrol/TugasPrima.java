public class TugasPrima{
    public static void main(String[] args){

            int a = Integer.parseInt(args [0]);
            boolean Prime = true;
            
            for(int i=2; i<=a; i++){
                if(a%2 == 0){
                    Prime = false;
                    break;
                }
            }
            if(Prime == true && a>1){
                System.out.println("Bilangan Prima");
            }
            else{
                System.out.println("Bukan bilangan prima");
            }
            
        }
    }
    


