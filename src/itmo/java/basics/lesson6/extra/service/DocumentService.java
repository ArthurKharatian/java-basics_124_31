package itmo.java.basics.lesson6.extra.service;

import itmo.java.basics.lesson6.extra.dao.Document;

import java.util.List;

public interface DocumentService {

    Document create(Integer pageCount, String format, Boolean isEditable);

    Document read(Long id);

    Document update(Document document);

    void delete(Long id);

    List<Document> getDocuments();

}
