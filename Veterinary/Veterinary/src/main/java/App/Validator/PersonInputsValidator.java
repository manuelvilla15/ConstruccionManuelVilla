package App.Validator;

public class PersonInputsValidator extends InputsValidator{
	
	 public void fullNameValidator(String fullName) throws Exception {
		super.stringValidator(fullName, "Nombre de ususario");
		}
		
		public long idValidator(String idPerson)throws Exception {
			return super.longValidator(idPerson, "Id de usuario");
		}
		
		public int ageValidator(String age) throws Exception {
			return super.integerValidator(age, "Edad de ususario");
		}
	}


