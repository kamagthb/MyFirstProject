import java.util.HashSet;
import java.util.Set;

public class SetReview {


    public static void main(String[] args) {
        //1. create a set
        Set<Student> mySet=new HashSet<>();

        // 2 add element
        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));
        mySet.add(new Student(9, "Muhabbet"));

        System.out.println(mySet);

        Set<Integer> numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        //System.out.println(numSet);
        System.out.println(numSet.add(2));
         System.out.println("first repeating:  " +firstRepeatingChar("java developer"));
        System.out.println(secondWay());
    }
    public static Character firstRepeatingChar(String str){
        //Create a hashset
      Set<Character> set= new HashSet<>();

        for (Character c:str.toCharArray() ) {
            if (!set.add(c)) return c;

        }
        return null;
    }

    public static Character secondWay(){
        String a="dfacfadggfgfg";
        String b="";
        Character chr=null;

        for (Character C:a.toCharArray()) {
            if (b.contains(""+C)) {
                chr=C;
                break;
            }
            b=b+""+C;


        }
   return chr;
    }

}

