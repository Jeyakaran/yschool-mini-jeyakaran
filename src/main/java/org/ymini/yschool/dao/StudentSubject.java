package org.ymini.yschool.dao;

import javax.persistence.*;

/**
 * User: Jeyakaran
 * Date: 17/6/12
 * Time: 4:03 PM
 */
@Entity
@AssociationOverrides({
        @AssociationOverride(name = "pk.student", joinColumns = @JoinColumn(name = "student_sId")),
        @AssociationOverride(name = "pk.subject", joinColumns = @JoinColumn(name = "subject_code"))})
public class StudentSubject {
    @EmbeddedId
    private StudentSubjectId pk = new StudentSubjectId();
    private int marks;

    public StudentSubjectId getPk() {
        return pk;
    }

    public void setPk(StudentSubjectId pk) {
        this.pk = pk;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Transient
    public Student getStudent() {
        return pk.getStudent();
    }

    public void setStudent(final Student student) {
        pk.setStudent(student);
    }

    @Transient
    public Subject getSubject() {
        return pk.getSubject();
    }

    public void setSubject(final Subject subject) {
        pk.setSubject(subject);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof StudentSubject))
            return false;
        StudentSubject that = (StudentSubject) obj;
        if (pk != null ? !pk.equals(that.getPk()) : that.getPk() != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return (pk != null ? pk.hashCode() : 0);
    }
}
