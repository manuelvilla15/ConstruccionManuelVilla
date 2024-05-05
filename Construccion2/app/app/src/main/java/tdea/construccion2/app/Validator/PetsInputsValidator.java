package tdea.construccion2.app.Validator;

import org.springframework.stereotype.Component;

@Component
public class PetsInputsValidator extends InputsValidator{
	
	public void namePetsValidator(String namePets ) throws Exception {
		super.stringValidator(namePets, " Nombre de la mascota");
	}
		
	public long idPersonValidator(String idPerson) throws Exception {
		return super.longValidator(idPerson, "Nombre del dueño");
	}
		
	public int agePetsValidator(String agePets) throws Exception {
		return super.integerValidator(agePets, "Edad de la mascota");
	}
		
	public long idPetsValidator(String idPets) throws Exception {
		return super.longValidator(idPets, "Id de la mascota");
	} 
		
	public void speciesValidator(String species) throws Exception {
		super.stringValidator(species, "Especie de mascota");
	} 
		
	public void raceValidator(String race) throws Exception {
		super.stringValidator(race, "Raza de mascota");
	}
		
	public void characteristicValidator(String characteristic) throws Exception {
		super.stringValidator(characteristic, "Caracteristcas de la mascota");
	}
		
	public double weightValidator(String weight) throws Exception {
		return super.doubleValidator(weight, "Nombre de ususario");
	}
}
