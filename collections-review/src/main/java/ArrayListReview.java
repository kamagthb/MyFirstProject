import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {
        //create list for students
        List<Student> students=new ArrayList<>();

        students.add(new Student(1,"George"));
        students.add(new Student(2,"Mel"));
        students.add(new Student(3,"Pat"));
        students.add(new Student(4,"Dave"));

        //1.for loop
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        //2.iteration
        Iterator iterator=students.listIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        // Backwards Iteration
        System.out.println("Printing with Iterator Backwards........");
        while (((ListIterator<Student>) iterator).hasPrevious())
            System.out.println(((ListIterator<?>) iterator).previous());

        // 3. for each loop

        for (Object s:students) {
            System.out.println(s);
        }

        // 4. Lambda
        System.out.println("Printing with lambda.......");
        students.forEach((e)-> System.out.println(e));

        System.out.println("Printing with sorted List by comp..........");
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);

        System.out.println("Printing with sorted List by comp..........");
        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);

    }
    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

}
