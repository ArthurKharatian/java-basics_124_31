package itmo.java.basics.lesson6.extra.service.impl;

import itmo.java.basics.lesson6.extra.dao.Document;
import itmo.java.basics.lesson6.extra.repository.DocumentRepository;
import itmo.java.basics.lesson6.extra.repository.impl.DocumentRepositoryImpl;
import itmo.java.basics.lesson6.extra.service.DocumentService;

import java.util.List;

public class DocumentServiceImpl implements DocumentService {

    private DocumentRepository documentRepository = new DocumentRepositoryImpl();

    @Override
    public Document create(Integer pageCount, String format, Boolean isEditable) {
        Document document = new Document(pageCount, format, isEditable);
        documentRepository.save(document);
        return document;
    }

    @Override
    public Document read(Long id) {
        return documentRepository.findBy(id);
    }

    @Override
    public Document update(Document document) {
        documentRepository.save(document);
        return document;
    }

    @Override
    public void delete(Long id) {
        documentRepository.delete(id);
    }

    @Override
    public List<Document> getDocuments() {
        return documentRepository.getDocuments();
    }

}
