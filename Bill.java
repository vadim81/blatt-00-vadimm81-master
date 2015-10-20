/**
 * Created by v on 20.10.2015.
 */
public class Bill {
    public static void main(String[] args) {

        int PrReg = 5;      //Preis Regenschirm
        int PrM =  25;      //Preis Muetze
        int PrSch = 15;     //Preis Schal
        int Gesamt = PrReg+PrM+PrSch;   //Gesamtpreis
        System.out.printf("%-13s %5s\n", "Position", "Preis");
        System.out.printf("%-13s %5s\n", "============", "=====");
        System.out.printf("%-13s %5d\n", "Regenschirm", PrReg);
        System.out.printf("%-13s %5d\n", "Muetze", PrM);
        System.out.printf("%-13s %5d\n", "Schal", PrSch);
        System.out.printf("%-13s %5s\n", "", "=====");
        System.out.printf("%-13s %5d\n", "", Gesamt);
    }
}
