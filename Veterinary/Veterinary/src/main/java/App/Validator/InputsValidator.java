package App.Validator;

import java.sql.Date;

public class InputsValidator {
	public void stringValidator(String string, String element) throws Exception{
		if(string==null || string.equals("")) {
			throw new Exception(element + "No es un valor valido");
			}
		}

	public int integerValidator(String number, String element)throws Exception {
		stringValidator(number, element);
		try {
			return Integer.parseInt(number);
		} catch (Exception e) {
			throw new Exception(element + " No es un número valido");
			
		}
	}
		
	public long longValidator(String number, String element)throws Exception {
		stringValidator(number, element);
		try {
			return Long.parseLong(number); 
		} catch (Exception e) {
			throw new Exception(element + " No es un número valido");
			
		}
	}
	public double doubleValidator(String number, String element)throws Exception {
		stringValidator(number, element);
		try {
			return Double.parseDouble(number);
		} catch (Exception e) {
			throw new Exception(element + " No es un número valido");
			
		}
	}
	public Date DateValidator(String number, String element)throws Exception {
		stringValidator(number, element);
		try {
			return Date.valueOf(number);
		} catch (Exception e) {
			throw new Exception(element + "  No es un valor valido");
			
			}
		}
	}

