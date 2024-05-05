package tdea.construccion2.app.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.Models.Person;
import tdea.construccion2.app.Models.Pets;
import tdea.construccion2.app.dto.PetsDto;
import tdea.construccion2.app.repository.PetsRepository;

@Service
public class PetsDaoImpl implements PetsDao{
	@Autowired
	private PetsRepository petsRepository;
	
	@Override
	public void createPets(PetsDto petsDto) throws Exception {
		Pets pets = new Pets();
		pets.setIdPets(petsDto.getIdPets());
		pets.setNamePets(petsDto.getNamePets());
		pets.setIdPerson(new Person(petsDto.getIdPerson()));
		pets.setAgePets(petsDto.getAgePets());
		pets.setSpecies(petsDto.getSpecies());
		pets.setRace(petsDto.getRace());
		pets.setCharacteristic(petsDto.getCharacteristic());
		pets.setWeight(petsDto.getWeight());
		petsRepository.save(pets);

	}

	@Override
	public boolean findPetsExist(PetsDto petsDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existPetsByPets(PetsDto petsDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PetsDto findPetsByPets(PetsDto petsDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public PetsRepository getPetsRepository() {
		return petsRepository;
	}

	public void setPetsRepository(PetsRepository petsRepository) {
		this.petsRepository = petsRepository;
	}


	
}
