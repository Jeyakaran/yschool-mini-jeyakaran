package org.ymini.yschool.dao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * User: Jeyakaran
 * Date: 17/6/12
 * Time: 3:58 PM
 */
@Entity
public class Subject {
    @Id
    @GeneratedValue
    @Column(name = "subject_code")
    private int code;
    @Column(name = "subject_name")
    private String name;
    @OneToMany(fetch = FetchType .LAZY ,mappedBy = "pk.subject")
    private Set<StudentSubject> studentSubjectSet = new HashSet<StudentSubject>(0);

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<StudentSubject> getStudentSubjectSet() {
        return studentSubjectSet;
    }

    public void setStudentSubjectSet(Set<StudentSubject> studentSubjectSet) {
        this.studentSubjectSet = studentSubjectSet;
    }
}
