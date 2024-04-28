package br.com.fiap.techchallenge.frameworks.configs;

import br.com.fiap.techchallenge.application.gateways.CustomerGateway;
import br.com.fiap.techchallenge.application.usecases.customer.CreateCustomer;
import br.com.fiap.techchallenge.application.usecases.customer.FindCustomerByCpf;
import br.com.fiap.techchallenge.application.usecases.customer.impl.CreateCustomerImpl;
import br.com.fiap.techchallenge.application.usecases.customer.impl.FindCustomerByCpfImpl;
import br.com.fiap.techchallenge.frameworks.web.customer.CreateCustomerWeb;
import br.com.fiap.techchallenge.frameworks.web.customer.FindCustomerByCpfWeb;
import br.com.fiap.techchallenge.frameworks.web.customer.impl.CreateCustomerWebImpl;
import br.com.fiap.techchallenge.frameworks.web.customer.impl.FindCustomerByCpfWebImpl;
import br.com.fiap.techchallenge.interfaces.controllers.customer.CreateCustomerController;
import br.com.fiap.techchallenge.interfaces.controllers.customer.FindCustomerByCpfController;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.CustomerRequestToCustomer;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.CustomerToCustomerResponse;
import br.com.fiap.techchallenge.interfaces.controllers.customer.impl.CreateCustomerControllerImpl;
import br.com.fiap.techchallenge.interfaces.controllers.customer.impl.FindCustomerByCpfControllerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerBean {

    @Bean
    CreateCustomer customerCreate(final CustomerGateway customerRepositoryPort) {
        return new CreateCustomerImpl(customerRepositoryPort);
    }

    @Bean
    CustomerRequestToCustomer customerRequestToCustomer() {
        return new CustomerRequestToCustomer();
    }

    @Bean
    CustomerToCustomerResponse customerToCustomerResponse() {
        return new CustomerToCustomerResponse();
    }

    @Bean
    CreateCustomerController customerCreateController(final CreateCustomer customerCreate,
                                                      final CustomerRequestToCustomer customerRequestToCustomer,
                                                      final CustomerToCustomerResponse customerToCustomerResponse) {
        return new CreateCustomerControllerImpl(customerCreate, customerRequestToCustomer, customerToCustomerResponse);
    }

    @Bean
    CreateCustomerWeb createCustomerWeb(final CreateCustomerController customerCreateController) {
        return new CreateCustomerWebImpl(customerCreateController);
    }

    @Bean
    FindCustomerByCpf customerFindByCpf(final CustomerGateway customerRepositoryPort) {
        return new FindCustomerByCpfImpl(customerRepositoryPort);
    }

    @Bean
    FindCustomerByCpfController customerFindByCpfController(final FindCustomerByCpf customerFindByCpf,
                                                            final CustomerToCustomerResponse customerToCustomerResponse) {
        return new FindCustomerByCpfControllerImpl(customerFindByCpf, customerToCustomerResponse);
    }

    @Bean
    FindCustomerByCpfWeb findCustomerByCpfWeb(final FindCustomerByCpfController findCustomerByCpfController) {
        return new FindCustomerByCpfWebImpl(findCustomerByCpfController);
    }

}
