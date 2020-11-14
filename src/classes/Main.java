package classes;

public class Main {

    public static void main(String[] args) {
	Student[] students = new Student[]{new Student(1,2),new Student(2,1),
            new Student(4,3.4f) , new Student(9,4.5f)};
        System.out.println(Search.linearSearch(students , new Student(4,3.55f)));
        System.out.println(Search.binarySearch(students, new Student(1,5.3f),students.length));
    }
}
