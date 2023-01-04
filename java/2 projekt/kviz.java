/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gyakorlás;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Gyakorlás {

    static String kerdes = "";
    static String cim = "";
    static int msgTipus = 0;
    static String kijelolve = "";
    static String valasztas = "";
    static String info = "";
    static String neved = egyesfeladat();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean ujra = true;
        while (ujra) {
            int pont = 0;
            kerdes = "hogy nézed meg hogy egy szám páros-e?";
            cim = "kerdes1";
            msgTipus = JOptionPane.QUESTION_MESSAGE;

            String[] valaszok = {"sehogy", "elosztom 2 vel és ha a maradék 0 akkor páros",
                "elosztom 2 vel és ha a maradék 1 akkor páros", "ösze adom önmagával", "lehetetlen"};
            kijelolve = "";
            valasztas = (String) JOptionPane.showInputDialog(null, kerdes, cim, msgTipus, null, valaszok, kijelolve);

            valasztas = valasztas == null ? "nincs" : valasztas;
            String info = "valasza:: " + valasztas;
            cim = "A választás eredménye";
            msgTipus = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, info, cim, msgTipus);
            if ("elosztom 2 vel és ha a maradék 0 akkor páros" == valasztas) {
                pont += 1;
            }
            kerdes = "Melyik rogramozási nyelvben mükönek máshogy a ciklusok?";

            cim = "kerdes2";
            msgTipus = JOptionPane.QUESTION_MESSAGE;

            String[] valaszok2 = {"csap pythonban", "csak javaban",
                "mindben", "egyikben sem"};
            kijelolve = "sárga";
            valasztas = (String) JOptionPane.showInputDialog(null, kerdes, cim, msgTipus, null, valaszok2, kijelolve);

            valasztas = valasztas == null ? "nincs" : valasztas;
            info = "valasza:: " + valasztas;
            cim = "A választás eredménye";
            msgTipus = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, info, cim, msgTipus);
            if ("egyikben sem" == valasztas) {
                pont += 1;
            }
            kerdes = "melyik ciklus jobb?";

            cim = "kerdes3";
            msgTipus = JOptionPane.QUESTION_MESSAGE;

            String[] valaszok3 = {"mindegyik máshogy müködik", "igazábol mindegyiknek ugyan az a müködési elve ezért nincs jobb",
                "a while a legjobb", "a for i in range"};
            kijelolve = "sárga";
            valasztas = (String) JOptionPane.showInputDialog(null, kerdes, cim, msgTipus, null, valaszok3, kijelolve);

            valasztas = valasztas == null ? "nincs" : valasztas;
            info = "valasza:: " + valasztas;
            cim = "A választás eredménye";
            msgTipus = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, info, cim, msgTipus);
            if ("igazábol mindegyiknek ugyan az a müködési elve ezért nincs jobb" == valasztas) {
                pont += 1;
            }
            kerdes = "miért nem jó ha semit mondó neveket adunk egy változónak?";
            cim = "kerdes 4";
            msgTipus = JOptionPane.QUESTION_MESSAGE;

            String[] valaszok4 = {"mert ronda", "mert 3 hét mulva sem én sem más nem tudja mi volt vele akkor a terv",
                "egyáltalán nem rosz"};
            kijelolve = "sárga";
            valasztas = (String) JOptionPane.showInputDialog(null, kerdes, cim, msgTipus, null, valaszok4, kijelolve);

            valasztas = valasztas == null ? "nincs" : valasztas;
            info = "valasza:: " + valasztas;
            cim = "A választás eredménye";
            msgTipus = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, info, cim, msgTipus);
            if ("mert 3 hét mulva sem én sem más nem tudja mi volt vele akkor a terv" == valasztas) {
                pont += 1;
            }
            kerdes = "miért nem jó ha semit mondó neveket adunk egy változónak?";
            cim = "tesztelésük alapján hány ciklust külömböztetünk meg?";
            msgTipus = JOptionPane.QUESTION_MESSAGE;

            kijelolve = "";
            int valasztas5 = Integer.parseInt(JOptionPane.showInputDialog(kerdes));

            info = "valasza:: " + valasztas5;
            cim = "A választás eredménye";
            msgTipus = JOptionPane.INFORMATION_MESSAGE;
            JOptionPane.showMessageDialog(null, info, cim, msgTipus);
            if (valasztas5 == 2) {
                pont += 1;
            }

            info = neved + " ponjai:5/ " + pont + " szeretnéd a rematchet?";
            cim = "eredménye:";
            msgTipus = JOptionPane.YES_NO_CANCEL_OPTION;
            int gomb = JOptionPane.showConfirmDialog(null, info, cim, msgTipus);
            if (gomb != JOptionPane.YES_OPTION) {
                ujra = false;
            }

        }
    }

    private static String egyesfeladat() throws HeadlessException {
        String a_nev = JOptionPane.showInputDialog("Adja meg a nevét! Min. 3 karakter: ");
        String a_cim = "Programozási kvíz";
        boolean jo = a_nev.length() >= 3;
        String a_kerdes;
        int msgType;
        msgType = JOptionPane.INFORMATION_MESSAGE;
        int a_info = JOptionPane.OK_OPTION;

        while (!jo) {
            a_nev = JOptionPane.showInputDialog("Adja meg a nevét! Minimum 3 karakter: ");
            if (a_nev.length() >= 3) {
                jo = true;
            }

        }
        

        int nevhossz = a_nev.length();

        for (int i = 0; i < nevhossz; i++) {
            boolean vanBenneSzam = a_nev.charAt(i) == '0' || a_nev.charAt(i) == '1' || a_nev.charAt(i) == '2'
                    || a_nev.charAt(i) == '3' || a_nev.charAt(i) == '4' || a_nev.charAt(i) == '5'
                    || a_nev.charAt(i) == '6' || a_nev.charAt(i) == '7' || a_nev.charAt(i) == '8'
                    || a_nev.charAt(i) == '9';
            while (vanBenneSzam) {
                a_nev = JOptionPane.showInputDialog("Adja meg a nevét! Nincs szám: ");
                vanBenneSzam = a_nev.charAt(i) == '0' || a_nev.charAt(i) == '1' || a_nev.charAt(i) == '2'
                        || a_nev.charAt(i) == '3' || a_nev.charAt(i) == '4' || a_nev.charAt(i) == '5'
                        || a_nev.charAt(i) == '6' || a_nev.charAt(i) == '7' || a_nev.charAt(i) == '8'
                        || a_nev.charAt(i) == '9';
            }

        }

        cim = "Megadott név: ";
        kerdes = a_nev;
        msgType = JOptionPane.INFORMATION_MESSAGE;
        JOptionPane.showMessageDialog(null, a_nev, cim, msgType);
        return a_nev;
    }

}
