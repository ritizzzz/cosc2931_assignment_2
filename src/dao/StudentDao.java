package dao;

import java.sql.SQLException;

import model.Student;

public interface StudentDao {
	void setup() throws SQLException;
	Student getStudent(int studentNumber) throws SQLException;
	Student createUser(String firstName, String lastName) throws SQLException;
}
