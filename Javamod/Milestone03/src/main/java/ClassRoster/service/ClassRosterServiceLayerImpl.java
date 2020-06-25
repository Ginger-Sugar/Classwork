

package ClassRoster.service;

import ClassRoster.dao.ClassRosterDao;
import ClassRoster.dao.ClassRosterPersistenceException;
import ClassRoster.dto.Student;
import ClassRoster.ui.ClassRosterView;
import java.util.List;

/**
 *
 * @author Shantoria Taylor  ,  May 27, 2020  ,  12:32:31 AM

 */
public class ClassRosterServiceLayerImpl implements ClassRosterServiceLayer {
    
    ClassRosterDao dao;
   
public ClassRosterServiceLayerImpl(ClassRosterDao dao) {
    this.dao = dao;
}

public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
    this.service = service;
    this.view = view;
}
@Override
public void createStudent(Student student) throws
        ClassRosterDuplicateIdException,
        ClassRosterDataValidationException,
        ClassRosterPersistenceException {
    
    if (dao.getStudent(student.getStudentId()) != null) {
        throw new ClassRosterDuplicateIdException(
                "ERROR: Could not create student.  Student Id "
                + student.getStudentId()
                + " already exists");
    }
    validateStudentData(student);

    dao.addStudent(student.getStudentId(), student);

}

    @Override
public List<Student> getAllStudents() throws ClassRosterPersistenceException {
    return dao.getAllStudents();
}

    @Override
public Student getStudent(String studentId) throws ClassRosterPersistenceException {
    return dao.getStudent(studentId);
}

    @Override
public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
    return dao.removeStudent(studentId);
}
    
    private void validateStudentData(Student student) throws
        ClassRosterDataValidationException {

    if (student.getFirstName() == null
            || student.getFirstName().trim().length() == 0
            || student.getLastName() == null
            || student.getLastName().trim().length() == 0
            || student.getCohort() == null
            || student.getCohort().trim().length() == 0) {

        throw new ClassRosterDataValidationException(
                "ERROR: All fields [First Name, Last Name, Cohort] are required.");
    }
}
}
