package ma.pfe.dtos;

import ma.pfe.entities.Adresse;
import ma.pfe.entities.StudentId;

import javax.persistence.EmbeddedId;

public class StudentDto {

    @EmbeddedId
    private StudentId studentId;
    private Adresse adresse;
    private String name;

    public StudentId getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentId studentId) {
        this.studentId = studentId;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId=" + studentId +
                ", name='" + name +
                ", adresse=" + adresse + '\'' +
                '}';
    }
}
