package ie.atu.week12example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="payment-service", url = "http://localhost:8081/payemnt")
public interface PaymentClient {
    @PostMapping
    public String makePayment(Person person);
}
