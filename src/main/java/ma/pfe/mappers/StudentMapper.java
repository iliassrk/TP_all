package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {

    StudentEntity convertToDto(StudentDto dto);
    StudentDto convertToDto(StudentEntity entity);

}
