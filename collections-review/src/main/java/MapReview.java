import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {

        Map<Integer,String> map =new HashMap<>();
        map.put(1,"gEO");
        map.put(2,"wELLO");
        System.out.println(map);
        System.out.println(findFirstNonRepeating("JJAVA DEFEFEV YTH"));
    }

    public static Character findFirstNonRepeating(String word) {
        int count;
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : word.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count+1);
            } else {
                map.put(ch, 1);
            }

        }


        for (Character ch : word.toCharArray()) {
            if (map.get(ch)==1)return ch;

            }
return null;

}}
