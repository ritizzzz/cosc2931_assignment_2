package model;

public class User {
    private String username;
	private String password;
    private String firstName;
    private String lastName;
    private int studentNumber;

    public User(){
        
    }

    public User(String username, String password, String firstName, String lastName, int studentNumber){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName =  firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName =  lastName;
    }

    public int getStudentNumber(){
        return studentNumber;
    }   
}
