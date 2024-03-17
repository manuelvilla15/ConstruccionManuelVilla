package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import App.Config.MYSQLConnection;
import App.dto.PetsDto;

public class PetsDaoImpl implements PetsDao {
	public Connection connection = MYSQLConnection.getConnection();

	@Override
	public void createPets(PetsDto petsDto) throws Exception {
		String query = "INSERT INTO PETS(NAMEPETS,IDPETS, IDPERSON,AGEPETS,SPECIES,RACE,CHARACTERISTIC,WEIGHT) VALUES (?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setString(i++, petsDto.getNamePets());
		preparedStatement.setLong(i++, petsDto.getIdPets());
		preparedStatement.setLong(i++, petsDto.getIdPerson().getId());
		preparedStatement.setInt(i++, petsDto.getAgePets());
		preparedStatement.setString(i++, petsDto.getSpecies());
		preparedStatement.setString(i++, petsDto.getRace());
		preparedStatement.setString(i++, petsDto.getCharacteristic());
		preparedStatement.setDouble(i++, petsDto.getWeight());
		preparedStatement.execute();
		preparedStatement.close();

	}
}
