package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentId;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private static final  Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;

    private StudentMapper studentMapper;


    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public Long save(StudentDto dto) {
        LOGGER.debug("start methode save");
        /*StudentEntity e = studentMapper.convertToEntity(dto);
        e = studentRepository.save(e);
        return e.getStudentId().getId();*/
        return null;
    }

    @Override
    public Boolean update(StudentDto dto) {
        LOGGER.debug("start methode update");
        /*StudentEntity e= studentMapper.convertToEntity(dto);
        studentRepository.findById(e.getStudentId());
        e = studentRepository.save(e);*/
        return true;
    }

    @Override
    public Boolean deleteById(Long id, String code) {
        LOGGER.debug("start methode delete");
        StudentId studentId = new StudentId(id,code);
        studentRepository.deleteById(studentId);
        return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("start methode selectAll");
        /*List<StudentEntity> l = studentRepository.findAll();
        return studentMapper.convertToDtos(l);*/
        return null;
    }
}
