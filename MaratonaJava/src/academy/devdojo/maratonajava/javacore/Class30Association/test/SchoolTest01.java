package academy.devdojo.maratonajava.javacore.Class30Association.test;

import academy.devdojo.maratonajava.javacore.Class30Association.domain.School;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sensei");
        Teacher[] teachers = {teacher};
        School school = new School("Eleodoro", teachers);

        school.showTheDate();
    }
}
