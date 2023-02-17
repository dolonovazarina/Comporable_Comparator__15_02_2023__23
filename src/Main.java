import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static <Sifr> void main(String[] args) {

        //---------------------------------     TASK  №23     --------------------------------------------------------
//        0 жана 1 деген сандар менен рандомно Массивди, ArrayListти жана LinkedListти толтурунуз.
//        Main даOverload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын.
//        Башында 0дор жана аягында 1лер.

        ArrayList<Integer> arrayList = new ArrayList<> ( );
        arrayList.add ( 0 );
        arrayList.add ( 1 );
        System.out.println ( arrayList );
        System.out.println ( );
        Collections.sort ( arrayList );

        

    }
}