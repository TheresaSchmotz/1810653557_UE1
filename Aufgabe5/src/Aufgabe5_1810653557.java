public class Aufgabe5_1810653557 {

    public static void main(String[]args) {

        Integer zahl1 = 5;
        Integer zahl2 = 10;

        System.out.println(zahl1++);
        System.out.println(zahl2++);

        System.out.println(zahl1);
        System.out.println(zahl2);

        System.out.println(++zahl1);
        System.out.println(++zahl2);

        /**Der Inkrement-Operator ++i(hier: ++zahl1) oder i++(hier: zahl1++) erhöht den Wert einer Variablen um eins.
         *Jedoch wird zwischen Postfix(i++)- und Präfixform(++i) unterschieden.
         * Beim Postfix wird die Variable erst NACH dem Zugriff, beim Präfix VOR dem Zugriff auf die Variable inkrementiert.
         */
    }
}
