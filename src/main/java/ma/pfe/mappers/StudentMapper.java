package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentEntity convertToEntity (StudentDto dto){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(dto.getId());
        studentEntity.setName(dto.getName());
        return studentEntity;

    }
    public StudentDto convertToDto (StudentEntity ent){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(ent.getId());
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
