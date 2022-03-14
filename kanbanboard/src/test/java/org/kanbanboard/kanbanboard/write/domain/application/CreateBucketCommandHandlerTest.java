package org.kanbanboard.kanbanboard.write.domain.application;

import org.junit.jupiter.api.Test;
import org.kanbanboard.kanbanboard.write.adapter.out.BucketRepositoryImpl;

import java.util.UUID;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CreateBucketCommandHandlerTest {

    @Test
    void GIVEN_ValidCommand_MUST_DelegateToListAggregate() {

        // given
        var id = UUID.randomUUID();
        var position = 1;
        var name = "TODO";
        var command = new CreateBucketCommand(id, position, name);
        var repository = mock(BucketRepositoryImpl.class);

        // when
        var handler = new CreateBucketCommandHandler(repository);
        handler.handle(command);

        // then
        verify(repository).create(id, position, name);

    }

}
