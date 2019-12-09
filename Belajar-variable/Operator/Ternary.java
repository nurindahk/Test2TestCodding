public class Ternary{
    public static void main(String[] args){
        boolean hujan = true;

        System.out.println(hujan? "Bawa payung":"Tidak usah bawa payung");

        String nama = "Indah";

        String access = nama == "Indah" ? "Selamat datang, admin." : "Anda bukan admin !";
        
        System.out.println(access);

        String password = "secret";
        boolean loggedIn = password == "secret" ? true:false;
        System.out.println(loggedIn);
        

    }
}