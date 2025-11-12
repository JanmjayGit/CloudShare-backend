package janmjay.example.cloudshare.repository;

import janmjay.example.cloudshare.document.FileMetaDataDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FileMetaDataRepository extends MongoRepository<FileMetaDataDocument, String> {
    List<FileMetaDataDocument> findByClerkId(String clerkId);

    Long countByClerkId(String clerkId);
}
