package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.Adresse;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentEntity convertToEntity (StudentDto dto){
        StudentEntity studentEntity = new StudentEntity();
        StudentId studentId = new StudentId();
        Adresse adresse = new Adresse();
        adresse.setAvenue(dto.getAvenue());
        adresse.setRue(dto.getRue());
        adresse.setNumber(dto.getNumber());
        studentId.setId(dto.getId());
        studentId.setCode(dto.getCode());
        studentEntity.setStudentId(studentId);
        studentEntity.setName(dto.getName());
        return studentEntity;

    }
    public StudentDto convertToDto (StudentEntity ent){
        StudentDto studentDto = new StudentDto();
        StudentId studentId = new StudentId();
        Adresse adresse = new Adresse();
        adresse.setAvenue(ent.getAdresse().getAvenue());
        adresse.setRue(ent.getAdresse().getRue());
        adresse.setNumber(ent.getAdresse().getNumber());

        studentId.setId(ent.getStudentId().getId());
        studentId.setCode(ent.getStudentId().getCode());

        studentDto.setId(ent.getStudentId().getId());
        studentDto.setName(ent.getName());
        //studentDto.setId(ent.getStudentId().getId());
        //studentDto.setCode(ent.getStudentId().getCode());
        //studentDto.setName(ent.getName());
        return studentDto;
    }

    /*public List<StudentEntity> convertToEntities(List<StudentDto> dtos) {
        if(dtos !=null && !dtos.isEmpty()){
            return dtos.stream().map(studentDto -> convertToEntity(studentDto)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }

    }*/
    public List<StudentDto> convertToDtos(List<StudentEntity> studentEntities) {
        if(studentEntities!=null&&!studentEntities.isEmpty()){
            return studentEntities.stream().map(studentEntity -> convertToDto(studentEntity)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }
}
