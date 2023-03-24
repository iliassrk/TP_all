package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;

public class StudentMapperImpl implements StudentMapper{

    @Override
    public StudentEntity convertToDto(StudentDto dto) {
        if (dto == null){
        return null;
        }
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(dto.getName());
    }

    @Override
    public StudentDto convertToDto(StudentEntity entity) {
        return null;
    }
}
