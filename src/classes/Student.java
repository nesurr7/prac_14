package classes;

public class Student implements Comparable<Student> {
    int ID;
    float GPA;

    Student(int ID, float GPA) {
        this.GPA = GPA;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ID == student.ID;
    }

    @Override
    public int compareTo(Student o) {
        if (this.equals(o)) return 0;
        else if (o.ID < this.ID) return 1;
        else return -1;
    }
}


