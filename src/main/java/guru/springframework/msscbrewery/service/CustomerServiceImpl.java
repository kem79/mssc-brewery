package guru.springframework.msscbrewery.service;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .name("Leon")
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Francis")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("Update customer");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Delete customer");
    }
}
