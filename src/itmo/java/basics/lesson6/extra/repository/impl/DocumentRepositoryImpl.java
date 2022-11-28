package itmo.java.basics.lesson6.extra.repository.impl;

import itmo.java.basics.lesson6.extra.dao.Document;
import itmo.java.basics.lesson6.extra.repository.DocumentRepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepositoryImpl implements DocumentRepository {
    private List<Document> documents = new ArrayList<>();
    private static long id = 1;

    {
        Document csv = new Document(12, "csv", true);
        csv.setId(id++);
        this.documents.add(csv);
    }

    @Override
    public Document findBy(Long id) {
        Document document = null;
        for (Document doc : getDocuments()) {
            if (doc.getId().equals(id)) {
                document = doc;
            }
        }

        return document;
    }

    @Override
    public void save(Document document) {
        Document docById = findBy(document.getId());
        if(docById != null) {
            delete(document.getId());
        } else {
            document.setId(id++);
        }

        this.documents.add(document);

    }

    @Override
    public void delete(Long id) {
        Document document = findBy(id);
        if (document != null) {
            documents.remove(document);
        } else {
            System.err.printf("Document with id: %d is not found", id);
        }
    }

    @Override
    public List<Document> getDocuments() {
        return this.documents;
    }
}
