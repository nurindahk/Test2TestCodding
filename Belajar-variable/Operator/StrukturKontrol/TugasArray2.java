public class TugasArray2{
    public static void main(String[] args){
        int[] data = {10,34,5,23,6,7,55,20,260,273,333};

        int lowestData = data[0];
        //di asumsikan bahwa data ke 0 adalah yang paling kecil

        int lowestIndex = 0;
        
        for(int i=0;i<data.length;i++){
            if(data[lowestIndex] > data[i]){
                lowestData = data[i];
                lowestIndex = i;
            }
        }
        System.out.println("jadi, data paling kecil adalah " +lowestData+ " yang berada pada index ke- "+lowestIndex);
    }
}