package itmo.java.basics.lesson6.extra.repository;

import itmo.java.basics.lesson6.extra.dao.Document;

import java.util.List;

public interface DocumentRepository {

    Document findBy(Long id);

    void save(Document document);

    void delete(Long id);

    List<Document> getDocuments();

}
