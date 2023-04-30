// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Reziser reziser=new Reziser();
        reziser.godinaRodjenjaRezisera=1989;
        reziser.imeRezisera="Milos";
        reziser.prezimeRezisera="Bikovic";

    Film film=new Film("Jutro ce promeniti sve", 2021, reziser);
    System.out.println(film);

    }

}