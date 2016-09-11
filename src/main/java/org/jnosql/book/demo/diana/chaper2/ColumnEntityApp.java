package org.jnosql.book.demo.diana.chaper2;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.jnosql.diana.api.Value;
import org.jnosql.diana.api.column.Column;
import org.jnosql.diana.api.column.ColumnFamilyEntity;

public class ColumnEntityApp {


    public static void main(String[] args) {

        ColumnFamilyEntity entity = ColumnFamilyEntity.of("columnFamily");
        entity.add(Column.of("id", Value.of(10L)));
        entity.add(Column.of("version", 0.001));
        entity.add(Column.of("name", "Diana"));
        entity.add(Column.of("options", Arrays.asList(1, 2, 3)));

        List<Column> columns = entity.getColumns();
        Optional<Column> id = entity.find("id");
    }
}
