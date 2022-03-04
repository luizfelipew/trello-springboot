package org.kanbanboard.kanbanboard.write.domain.core;

import helper.DataSourceHelper;
import org.junit.jupiter.api.Test;
import org.kanbanboard.kanbanboard.write.adapter.out.ListRepositoryImpl;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class ListAggregateTest extends DataSourceHelper {

    @Test
    void GIVEN_ValidData_MUST_PersistInDatabase() {

        // given
        UUID id = UUID.randomUUID();
        int position = 1;
        String name = "TODO";
        final ListRepository repository = new ListRepositoryImpl(dataSource);

        // when
        final ListAggregate listAggregate = new ListAggregate(repository);
        listAggregate.create(id, position, name);

        // then
        assertThat(repository.hasList(id)).isTrue();

    }
}
