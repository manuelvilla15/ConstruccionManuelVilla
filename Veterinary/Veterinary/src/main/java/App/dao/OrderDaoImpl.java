package App.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import App.Config.MYSQLConnection;
import App.dto.OrderDto;
import App.dto.PersonDto;

public class OrderDaoImpl implements OrderDao{
	public Connection connection = MYSQLConnection.getConnection();

	@Override
	public void createOrder(OrderDto orderDto) throws Exception {
		String query = "INSERT INTO ORDEN(IDORDER,IDPET,IDOWNER, IDVET,MEDICINAME) VALUES (?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setLong(i++, orderDto.getIdOrder());
		preparedStatement.setLong(i++, orderDto.getIdPet().getIdPets());
		preparedStatement.setLong(i++, orderDto.getIdOwner().getId());
		preparedStatement.setLong(i++, orderDto.getIdVet().getId());
		preparedStatement.setString(i++, orderDto.getMedicineName());
		preparedStatement.execute();
		preparedStatement.close();
		
	}

	@Override
	public boolean findOrderExist(OrderDto orderDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<OrderDto> findOrderById(PersonDto personDto) throws Exception {
		String query = "SELECT ID,PERSONA_ID, ORDEN_ID FROM SESION WHERE PERSONA_ID = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setLong(1, personDto.getId());
		ResultSet resulSet = preparedStatement.executeQuery();
		List<OrderDto> order = new ArrayList();
		while (resulSet.next()) {
			long idOwner = resulSet.getLong("PERSONA_ID");
			long idOrder = resulSet.getLong("ORDEN_ID");
			order.add(new OrderDto());
		}
		resulSet.close();
		preparedStatement.close();
		return order;
	}

	@Override
	public boolean existOrderByOrder(OrderDto orderDto) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OrderDto findOrderByOrder(OrderDto orderDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
