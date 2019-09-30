package DataManagement;

public class PasswordRecord {
private String password;
private String acronym;

PasswordRecord(String password,String acronym){
	this.password=password;
	this.acronym=acronym;
}
public void setPassword(String password){
	this.password=password;
}
}
