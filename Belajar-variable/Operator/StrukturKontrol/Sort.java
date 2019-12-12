public class Sort{
    public static void main(String[] args){
        int[] data = {3,10,5,50,51,2,4,-2,6};
        //lakukan pengulangan pengecekan dan tukar data dari index ke 0 hingga terakhir

        /*
        data : 3 10 5 50 51 2 4 -2 6
        langkah :
        1. anggap data paling kecil adalah index paling awal yaitu index ke 0 => 3
        2. cara data paling kecil di antara semuanya
            *). data paling kecil adalah -2 di index ke 7
        3. data yang paling kecil ini kemudian di pindahkan ke paling awal dengan cara
            ditukar dengan data index paling awal :
            *). -2 | 10 5 50 51 2 4 3 6
        */

        for(int index = 0; index < data.length; index++){
            int lowestIndex = index; //lowest sementara
            //start cari paling kecil dari i to data.length
            for(int i = lowestIndex; i < data.length; i++){
                if(data[lowestIndex] > data[i]){
                    lowestIndex = i; // ganti index paling kecil ke i apabila data l[i] lebih kecil daripada data [lowestIndex]

                }
            }
            //end cari paling kecil
            // tukar data :
            int temp = data[index];
            data[index] = data[lowestIndex];
            data[lowestIndex] = temp;
        }

        //untuk menampilkan data yang telah diurutkan 
        for(int j = 0; j<data.length; j++){
            System.out.println(data[j]);
        }

    }
}