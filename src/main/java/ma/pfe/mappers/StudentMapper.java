package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
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
        studentId.setId(dto.getId());
        studentId.setCode(dto.getCode());
        studentEntity.setStudentId(studentId);
        studentEntity.setName(dto.getName());
        return studentEntity;

    }
    public StudentDto convertToDto (StudentEntity ent){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(ent.getStudentId().getId());
        studentDto.setCode(ent.getStudentId().getCode());
        studentDto.setName(ent.getName());
        return studentDto;
    }
/*
    public List<StudentEntity> convertToEntities(List<StudentDto> dtos) {
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
