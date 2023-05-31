package util; 
import java.util.HashMap;
import model.Course;

public class SearchUtil{
    public static HashMap<Integer, Course> returnCoursesBasedOnUserInput(String input){
        HashMap<Integer, Course> courseNames = new HashMap<>();
        
        int index = 1;
        for(Course course : CsvCourseReader.returnAllCourses()){
            if(course.getCourseName().toLowerCase().contains(input)){
                courseNames.put(index, course);
                index++;
            }
        }
        return courseNames;
    } 
}