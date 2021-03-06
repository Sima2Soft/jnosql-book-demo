package org.jnosql.book.demo.diana.chaper2;

import org.jnosql.diana.api.Value;
import org.jnosql.diana.api.document.Document;
import org.jnosql.diana.api.document.DocumentEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DocumentEntityApp {

    public static void main(String[] args) {

        DocumentEntity entity = DocumentEntity.of("columnFamily");
        entity.add(Document.of("id", Value.of(10L)));
        entity.add(Document.of("version", 0.001));
        entity.add(Document.of("name", "Diana"));
        entity.add(Document.of("options", Arrays.asList(1, 2, 3)));

        List<Document> documents = entity.getDocuments();
        Optional<Document> id = entity.find("id");
    }
}
