public class helloWorld{
    public static void main(final String[] args) {
        System.out.println("Hello World !");
        mobil bmw = new mobil(); //kita bangun object mobil bmw
        bmw.merk = "BMW i3000";
        bmw.maju();

        mobil fordShelby = new mobil ();
        fordShelby.merk = "Ford Mustang Shelby";
        fordShelby.maju();

        System.out.println(args[0]+args[1]);
    }
}


class mobil{
    public String merk;

    public void maju(){
        System.out.println("Mobil "+this.merk+" maju !!!! Brmmm....");
    }
}