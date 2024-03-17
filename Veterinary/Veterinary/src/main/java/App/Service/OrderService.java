package App.Service;

import App.dto.OrderDto;

public interface OrderService {
	public void createOrder(OrderDto orderDto) throws Exception;

}
