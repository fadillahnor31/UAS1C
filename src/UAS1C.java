import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UAS1C {

    public static void main(String[] args) throws IOException {
        ArrayList<String> g = new ArrayList<>();
        char[] pajero;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("6:");
        int u = Integer.parseInt(reader.readLine());
        pajero = new char[u];
        int counter = 0;
        for (int index = 0; index < u; index++) {
            counter++;
            System.out.println("Fadillah" + counter + ":");
            String name = reader.readLine();
            g = F("Fadillah");
            pajero[index] = g.get(index).charAt(index);
        }
        for (String:
             g) {
            System.out.println(g + "Fadillah");
        }
        for (char karakter : pajero) {
            System.out.println(karakter);
        }
    }
}
}
