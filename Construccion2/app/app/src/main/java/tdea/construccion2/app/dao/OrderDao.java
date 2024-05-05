package tdea.construccion2.app.dao;

import java.util.List;

import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;

public interface OrderDao {
	public void createOrder(OrderDto orderDto) throws Exception;
	public boolean findOrderExist(OrderDto orderDto)throws Exception;
	public boolean existOrderByOrder(OrderDto orderDto) throws Exception;
	public OrderDto findOrderByOrder(OrderDto orderDto) throws Exception;
	List<OrderDto> findOrderById(PersonDto personDto) throws Exception;

}
