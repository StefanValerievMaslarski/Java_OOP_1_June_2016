package bg.softuni.models;


import bg.softuni.io.OutputWriter;
import bg.softuni.staticData.ExceptionMessages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Course {

    public static final int NUMBER_OF_TASK_ON_EXAM = 5;
    public static final int MAX_SCORE_ON_EXAM = 100;
    public String name;
    public LinkedHashMap<String, Student> studentsByName;

    public Course(String name) {
        this.name = name;
        this.studentsByName = new LinkedHashMap<>();
    }
    public void enrollStudent(Student student){
        if (this.studentsByName.containsKey(student.userName)){
            OutputWriter.displayException
                    (String.format(ExceptionMessages.STUDENT_ALREADY_ENROLLED_IN_GIVEN_COURSE, student.userName, this.name));
            return;
        }
        this.studentsByName.put(student.userName, student);
    }


    private Map.Entry<String, ArrayList<Integer>>[] entrySet() {
        return new Map.Entry<String, ArrayList<Integer>>[0];
    }
}
