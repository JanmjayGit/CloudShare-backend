package janmjay.example.cloudshare.exceptions;

import com.mongodb.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateKeyException.class)
    public ResponseEntity<?> handleDuplicateEmailException(DuplicateKeyException exception) {
        Map<String,Object> data = new HashMap<>();
        data.put("status", HttpStatus.CONFLICT);
        data.put("message", exception.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(data);
    }
}
