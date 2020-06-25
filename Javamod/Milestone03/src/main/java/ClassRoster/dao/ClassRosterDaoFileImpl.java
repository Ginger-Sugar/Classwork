/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassRoster.dao;

import ClassRoster.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.FileWriter;

/**
 *
 * @author Shantoria Taylor
 */
public class ClassRosterDaoFileImpl implements ClassRosterDao {
    
    public static final String ROSTER_FILE = "roster.txt";
    
    public static final String DELIMITER = " : : ";

    
    @Override
public Student addStudent(String studentId, Student student) 
 throws ClassRosterPersistenceException {
    loadRoster();
    Student newStudent = students.put(studentId, student);
    writeRoster();
    return newStudent;
}

    @Override
public List<Student> getAllStudents() 
 throws ClassRosterPersistenceException {
    loadRoster();
    return new ArrayList(students.values());
}
  
    @Override
public Student getStudent(String studentId) 
 throws ClassRosterPersistenceException {
    loadRoster();
    return students.get(studentId);
}

 
    @Override
public Student removeStudent(String studentId) 
 throws ClassRosterPersistenceException {
    loadRoster();
    Student removedStudent = students.remove(studentId);
    writeRoster();
    return removedStudent;
}
    private Map<String, Student> students = new HashMap<>();
    
    private Student unmarshallStudent(String studentAsText){
        String[] studentTokens = studentAsText.split(DELIMITER);
        
        String studentId = studentTokens[0];
        
        Student studentFromFile = new Student(studentId);
        
        studentFromFile.setFirstName(studentTokens[1]);
        
        studentFromFile.setLastName(studentTokens[2]);
        
        studentFromFile.setCohort(studentTokens[3]);
        
        return studentFromFile;
    }
    
    private void loadRoster() throws ClassRosterPersistenceException {
    Scanner scanner;

    try {
        
        scanner = new Scanner(
                new BufferedReader(
                        new FileReader(ROSTER_FILE)));
    } 
    catch (FileNotFoundException e) {
        System.out.println(e.toString());
        throw new ClassRosterPersistenceException(
                "=_=' Could not load roster data into memory.", e);
    }
    
    String currentLine;
    
    Student currentStudent;
    
    while (scanner.hasNextLine()) {
        
        currentLine = scanner.nextLine();
        
        currentStudent = unmarshallStudent(currentLine);

        
        students.put(currentStudent.getStudentId(), currentStudent);
    }
    
    scanner.close();
}
    
    private String marshallStudent(Student aStudent){
        
        String studentAsText = aStudent.getStudentId()+DELIMITER;
        studentAsText += aStudent.getFirstName()+DELIMITER;
        studentAsText += aStudent.getLastName() + DELIMITER;
        studentAsText += aStudent.getCohort();
        return studentAsText;
    }
    
    
    private void writeRoster() throws ClassRosterPersistenceException {
        
        PrintWriter out;
        
        try
        {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        }
        catch (IOException e) {
            throw new ClassRosterPersistenceException ("Could not save student data.", e);
        }
    
    
    String studentAsText;
    List<Student> studentList = new ArrayList(students.values());
    
    for (Student currentStudent : studentList) {
    studentAsText = marshallStudent(currentStudent);
    out.println(studentAsText);
    out.flush();
    out.close();
}
    }  
    
}
    
    
    
    
    
    
    

