import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] chars = str.toCharArray();
        Map<Character,Character> map = new HashMap<>();

        for(Character x : chars) {
            map.put(x,x);
        }
        System.out.println(map.keySet());
    }
}