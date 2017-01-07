package zaj�cia_21XII;

public class Main { //Klasa

    public static void main(String[] args) {//funkcja nic nie zwracaj�ca i przyjmuje jeden parametr (tablic� String'�w)

        int[] tablica_1 = new int[10]; //1 zapis tablicy kt�ra ma 10 element�w wype�niona domy�lnie zerami (0)
        int[] tablica_2 = new int[]{2, 3, 4, 5, 6}; //2 zapis tablicy ju� wype�nione
        int[] tablica_3 = {53, 564, 3452, 234423}; //3 zapisz r�wnie� wype�nionej (skr�cona wersja tego wy�ej)

        // przypisywanie warto�ci
        tablica_1[0] = 10;
        tablica_1[3] = 22;
        tablica_1[1] = 6;
        tablica_1[9] = 21;

        //d�ugo�� tablicy
        int d�ugo�� = tablica_1.length;
        System.out.println("" + d�ugo��);

        //wypiswyanie warto�ci z tablicy_1
        for (int i = 0; i < tablica_1.length; i++) {
            int warto�� = tablica_1[i];
            System.out.println(warto��);
        }

        //wywo�anie funkcji nic nie zwracajacej
        wypiszWarto�ci(tablica_2);
        wypiszWarto�ci(tablica_3);

        //funkcja zwracaj�ca
        String naszeWarto�ci = zwr�cWarto��ZTablicy(tablica_1); //zwracane warto�ci przypisujemy do zmiennej String
        System.out.println(naszeWarto�ci);

    }

    // pryvatna funkcja kt�ra nic nie zwraca i przyjmuje jeden parametr tablic� int'�w
    /*
    private - motyfikator dost�pu (jest dost�pny tylko w tej klasie gdzie zosta�a stworzona)
    static - tworzona od razu przy startowaniu programu (static = niezmienna wiecznie sta�a)
    void - typ czyli nic nie zwracaj�ca
    wypiszWarto�ci - nasz nazwa funkcji
    w ( _parametr) - w nawiasach podaje si� parametry jakie b�dzie przyjmowa�
     */
    private static void wypiszWarto�ci(int[] parametr_tablica) {
        for (int i = 0; i < parametr_tablica.length; i++) {
            System.out.println("" + parametr_tablica[i]);
        }
    }

    //zamiast void jest String (czyli typ) wszystko poza void'em jest funkj� zwracaj�c�
    private static String zwr�cWarto��ZTablicy(int[] tablica)
    {
        String temp="";

        for (int i = 0; i < tablica.length; i++) {
            temp += tablica[i] +" ";
        }

        return  temp;
    }
}
