package dao;

import java.sql.SQLException;

import model.Course;

public interface CourseDao {
	void setup() throws SQLException;
	Course getCourse(String courseName) throws SQLException;
    void populate() throws SQLException;
    int getNumberOfCourses() throws SQLException;
}
