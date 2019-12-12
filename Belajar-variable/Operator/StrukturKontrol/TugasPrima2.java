public class TugasPrima2{
    public static void main(String[] args){

        
        int[] data = {3,10,7,11,15,16,23,50};
            
        for(int index=0;index<data.length;index++){
           
            int a =  data[index];
            boolean Prime = true;
            
            for(int i=2; i<=a-1; i++){
                if(a%i == 0){
                    Prime = false;
                    break;
                }
            }
            if(Prime == true && a>1){
                System.out.println(a+" Bilangan Prima");
            }
       
        }
            
    }
    
}

