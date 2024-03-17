package App.dao;

import java.util.List;

import App.dto.OrderDto;
import App.dto.PersonDto;



public interface OrderDao {
	public void createOrder(OrderDto orderDto) throws Exception;
	public boolean findOrderExist(OrderDto orderDto)throws Exception;
	public boolean existOrderByOrder(OrderDto orderDto) throws Exception;
	public OrderDto findOrderByOrder(OrderDto orderDto) throws Exception;
	List<OrderDto> findOrderById(PersonDto personDto) throws Exception;

}
