package janmjay.example.cloudshare.repository;

import janmjay.example.cloudshare.document.UserCredits;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface UserCreditsRepository extends MongoRepository<UserCredits, String> {


//    UserCredits findByClerkId(String clerkId);
    Optional<UserCredits> findByClerkId(String clerkId);  // ← Returns Optional
}
