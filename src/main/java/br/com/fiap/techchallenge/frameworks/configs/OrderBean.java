package br.com.fiap.techchallenge.frameworks.configs;

import br.com.fiap.techchallenge.application.gateways.OrderGateway;
import br.com.fiap.techchallenge.application.gateways.OrderQueueGateway;
import br.com.fiap.techchallenge.application.usecases.order.FindOrderById;
import br.com.fiap.techchallenge.application.usecases.order.OrderCheckout;
import br.com.fiap.techchallenge.application.usecases.order.impl.FindOrderByIdImpl;
import br.com.fiap.techchallenge.application.usecases.order.impl.OrderCheckoutImpl;
import br.com.fiap.techchallenge.application.usecases.order.impl.RegisterPayment;
import br.com.fiap.techchallenge.application.usecases.order.impl.RegisterPaymentImpl;
import br.com.fiap.techchallenge.frameworks.web.order.FindOrderByIdWeb;
import br.com.fiap.techchallenge.frameworks.web.order.OrderCheckoutWeb;
import br.com.fiap.techchallenge.frameworks.web.order.impl.FindOrderByIdWebImpl;
import br.com.fiap.techchallenge.frameworks.web.order.impl.OrderCheckoutWebImpl;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.CustomerRequestToCustomer;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.CustomerToCustomerResponse;
import br.com.fiap.techchallenge.interfaces.controllers.order.FindOrderByIdController;
import br.com.fiap.techchallenge.interfaces.controllers.order.OrderCheckoutController;
import br.com.fiap.techchallenge.interfaces.controllers.order.converters.OrderRequestToOrder;
import br.com.fiap.techchallenge.interfaces.controllers.order.converters.OrderToOrderResponse;
import br.com.fiap.techchallenge.interfaces.controllers.order.impl.FindOrderByIdControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.order.impl.OrderCheckoutControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderBean {

    @Bean
    OrderCheckout orderCheckout(final OrderGateway orderRepository, final RegisterPayment registerPayment) {
        return new OrderCheckoutImpl(orderRepository, registerPayment);
    }

    @Bean
    OrderRequestToOrder orderRequestToOrder(final CustomerRequestToCustomer customerRequestToCustomer) {
        return new OrderRequestToOrder(customerRequestToCustomer);
    }

    @Bean
    RegisterPayment registerPayment(final OrderQueueGateway orderQueueGateway) {
        return new RegisterPaymentImpl(orderQueueGateway);
    }

    @Bean
    OrderToOrderResponse orderToOrderResponse(final CustomerToCustomerResponse customerToCustomerResponse) {
        return new OrderToOrderResponse(customerToCustomerResponse);
    }

    @Bean
    OrderCheckoutController orderCheckoutController(final OrderCheckout orderCheckout,
                                                    final OrderRequestToOrder orderRequestToOrder,
                                                    final OrderToOrderResponse orderToOrderResponse) {
        return new OrderCheckoutControllerImpl(orderCheckout, orderRequestToOrder, orderToOrderResponse);
    }

    @Bean
    OrderCheckoutWeb orderCheckoutWeb(final OrderCheckoutController orderCheckoutController) {
        return new OrderCheckoutWebImpl(orderCheckoutController);
    }

    @Bean
    FindOrderById findOrderById(final OrderGateway orderGateway) {
        return new FindOrderByIdImpl(orderGateway);
    }

    @Bean
    FindOrderByIdController findOrderByIdController(final FindOrderById findOrderById,
                                                    final OrderToOrderResponse orderToOrderResponse) {
        return new FindOrderByIdControllerImpl(findOrderById, orderToOrderResponse);
    }

    @Bean
    FindOrderByIdWeb findOrderByIdWeb(final FindOrderByIdController findOrderByIdController) {
        return new FindOrderByIdWebImpl(findOrderByIdController);
    }
}
