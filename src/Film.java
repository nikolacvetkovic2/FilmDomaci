public class Film {

    String nazivFilma;
    int godinaProizvodnje;
    Reziser reziser;

    public Film(String nazivFilma, int godinaProizvodnje, Reziser reziser) {
        this.nazivFilma = nazivFilma;
        this.godinaProizvodnje = godinaProizvodnje;
        this.reziser=reziser;
    }
    void ispis(){
        System.out.println("Naziv filma je:" + " " + nazivFilma + " " +
                "a film je proizveden:" + " " + godinaProizvodnje + " " + "god." );
    }

    @Override
    public String toString() {
        return "Film{" +
                "nazivFilma='" + nazivFilma + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", reziser=" + reziser +
                '}';
    }
}
