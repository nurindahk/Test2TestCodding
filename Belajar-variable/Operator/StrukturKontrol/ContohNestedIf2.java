public class ContohNestedIf2{
    public static void main(String[] args){
        //username dan password yang diinput user
        String username = "nurindah407203@gmail.com"; //email ini tidak terdaftar
        String password ="secret123";

        //proses login
        if(username == "nurindah407203@gmail.com"){ //email yang terdaftar
            if(password == "secret"){ //password yang seharusnya benar
                //username ditemukan dan password benar
                System.out.println("berhasil login");
            }
            else{
                //username ditemukan dan password salah
                System.out.println("Password salah");
            }
        }
        else{
            System.out.println("username tidak ditemukan");
        }
    }
}