package App.Validator;

public class UserInputsValidator extends InputsValidator{
	
	public void personNameValidator(String personName) throws Exception {
		super.stringValidator(personName, " Nombre de ususario");
	}
	
	public void userValidator(String user) throws Exception {
		super.stringValidator(user, " Ususario");
	}
	
	public void passwordValidator(String password) throws Exception {
		super.stringValidator(password, " Password de ususario");
	}
	
	public void roleValidator(String role) throws Exception {
		super.stringValidator(role, " Roll de ususario");
	}
	
	

}
