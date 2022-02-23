package org.kanbanboard.kanbanboard.write.domain.core;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ListAggregateTest {

    @Test
    void dummy() {

        // given
        UUID id = UUID.randomUUID();
        int position = 1;
        String name = "TODO";
        final ListRepository repository = mock(ListRepository.class);

        // when
        final ListAggregate listAggregate = new ListAggregate(repository);
        listAggregate.create(id, position, name);

        // then
        verify(repository).create(id, position, name);
    }
}
