package App.dao;

import App.dto.PetsDto;

public interface PetsDao {
	public void createPets(PetsDto petsDto) throws Exception;
}
