package janmjay.example.cloudshare.controller;

import janmjay.example.cloudshare.dto.PaymentDTO;
import janmjay.example.cloudshare.dto.PaymentVerificationDTO;
import janmjay.example.cloudshare.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/create-order")
    public ResponseEntity<?> createOrder(@RequestBody PaymentDTO paymentDTO){
        PaymentDTO response = paymentService.createOrder(paymentDTO);

        if(response.getSuccess()){
            return ResponseEntity.ok(response);
        }else{
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("/verify-payment")
    public ResponseEntity<?> verifyPayment(@RequestBody PaymentVerificationDTO request){
        // use service method
       PaymentDTO response =  paymentService.verifyPayment(request);
       if(response.getSuccess()){
           return ResponseEntity.ok(response);
       }else {
           return ResponseEntity.badRequest().body(response);
       }
    }
}
