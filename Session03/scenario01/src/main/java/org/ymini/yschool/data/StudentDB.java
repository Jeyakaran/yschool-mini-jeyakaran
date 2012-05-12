package org.ymini.yschool.data;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Jeyakaran
 * Date: 12/5/12
 * Time: 7:52 AM
 */
public class StudentDB {

    private final static List<Student> STUDENT_DB;

    static {
        Student student01 = new Student("Student 01","Address 01",1,"Parent");
        Student student02 = new Student("Student 02","Address 02",2,"Parent");
        Student student03 = new Student("Student 03","Address 03",3,"Parent");
        Student student04 = new Student("Student 04","Address 04",4,"Parent");

        STUDENT_DB = new ArrayList<Student>();
        STUDENT_DB.add(student01);
        STUDENT_DB.add(student02);
        STUDENT_DB.add(student03);
        STUDENT_DB.add(student04);

    }

    public static List<Student> getStudentDb() {
        return STUDENT_DB;
    }

    public static void updateStudent(final Student student)
    {

    }

    public static void addStudent(final Student student)
    {
        STUDENT_DB.add(student);
    }

    public static void deleteStudent(final Student student)
    {

    }
}
