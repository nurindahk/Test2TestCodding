public class ForEach{
    public static void main(String[] args){
        int[] datas = {1,3,5,7,8};
        int index = 0;
        for(int data : datas){
            System.out.println("data ke "+index+" adalah "+data);
            index++;
        }
    }
}