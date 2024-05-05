package tdea.construccion2.app.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.Models.Order;
import tdea.construccion2.app.Models.Person;
import tdea.construccion2.app.Models.Pets;
import tdea.construccion2.app.dto.OrderDto;
import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.repository.OrderRepository;

@Service
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public void createOrder(OrderDto orderDto) throws Exception {
		Order order = new Order();
		order.setIdOrder(orderDto.getIdOrder());
		order.setIdPet(new Pets(orderDto.getIdPet()));
		order.setIdOwner(new Person(orderDto.getIdOwner()));
		order.setIdVet(new Person(orderDto.getIdVet()));
		order.setMedicineName(orderDto.getMedicineName());
		order.setGenerationDate(orderDto.getGenerationDate());
		orderRepository.save(order);
		}

	@Override
	public boolean findOrderExist(OrderDto orderDto) throws Exception {
		
		return false;
	}

	@Override
	public List<OrderDto> findOrderById(PersonDto personDto) throws Exception {
		return null;
	}

	@Override
	public boolean existOrderByOrder(OrderDto orderDto) throws Exception {
		
		return false;
	}

	@Override
	public OrderDto findOrderByOrder(OrderDto orderDto) throws Exception {
		
		return null;
	}

}
