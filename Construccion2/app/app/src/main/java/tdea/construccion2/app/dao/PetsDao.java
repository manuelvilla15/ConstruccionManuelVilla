package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.PetsDto;


public interface PetsDao {
	public void createPets(PetsDto petsDto) throws Exception;
	public boolean findPetsExist(PetsDto petsDto)throws Exception;
	public boolean existPetsByPets(PetsDto petsDto) throws Exception;
	public PetsDto findPetsByPets(PetsDto petsDto) throws Exception;
}
