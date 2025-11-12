package janmjay.example.cloudshare.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "payment_transaction")
public class PaymentTransaction {


    private String id;
    private String clerkId;
    private String orderId;
    private String paymentId;
    private String currency;
    private String planId;
    private String status;
    private int amount;
    private Integer creditsAdded;
    private LocalDateTime transactionDate;
    private String userEmail;
    private String userName;
}
