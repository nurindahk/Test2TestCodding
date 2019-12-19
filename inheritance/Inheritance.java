public class Inheritance{
    public static void main(String[] args){
        Musisi indah = new Musisi();
        indah.diberiNama ("Indah");
        indah.manggung();
        Pianis taehyung = new Pianis();
        taehyung.bacaNada();
        taehyung.mainPiano();
        taehyung.speak(indah.getNama());
    }
}

class Musisi{
    String nama;

     void menyanyi(){
        System.out.println(this.nama+" nyanyi. . .");
    }

    //setter
    void diberiNama(String nama){
        this.nama = nama;
    }

    //getter
    String getNama(){
        return this.nama;
    }

    void speak(String words){
        System.out.println(words);
    }

    void bacaNada(){
        System.out.println(this.nama+" baca nada...");
    }

    void manggung(){
        this.menyanyi();
    }
}

class Pianis extends Musisi{
    @Override
    void speak(String words){
        this.menyanyi();
        System.out.println(words);
    }
    @Override
    void manggung(){
        super.manggung();
        this.mainPiano();
    }

    void mainPiano(){
        System.out.println(this.nama+" main piano...");
    }
}