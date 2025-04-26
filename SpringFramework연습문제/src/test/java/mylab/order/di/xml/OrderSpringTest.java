package mylab.order.di.xml;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:mylab-order-di.xml")
public class OrderSpringTest {
	@Autowired
	ShoppingCart cart;
	@Autowired
	OrderService service;
	
	@Test
    void testOrderService() {
        assertNotNull(service);
        for (Product product : cart.getProducts()) {
            System.out.println(product.getName());
        }

        double total = service.calculateOrderTotal();
        System.out.println("총 주문 금액: " + total);
    }

    @Test
    void testShoppingCart() {
        assertNotNull(cart);
        assertEquals(cart, service.getShoppingCart());
        double total = cart.getTotalPrice();
        System.out.println("상품 총액: " + total);
    }
}
