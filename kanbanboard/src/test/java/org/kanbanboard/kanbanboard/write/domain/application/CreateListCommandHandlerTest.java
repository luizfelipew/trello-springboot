package org.kanbanboard.kanbanboard.write.domain.application;

import org.junit.jupiter.api.Test;
import org.kanbanboard.kanbanboard.write.domain.core.ListAggregate;

import java.util.UUID;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CreateListCommandHandlerTest {

    @Test
    void GIVEN_ValidCommand_MUST_DelegateToListAggregate() {

        // given
        UUID id = UUID.randomUUID();
        int position = 1;
        String name = "TODO";
        CreateListCommand command = new CreateListCommand(id, position, name);
        ListAggregate listAggregate = mock(ListAggregate.class);

        // when
        CreateListCommandHandler handler = new CreateListCommandHandler(listAggregate);
        handler.handle(command);

        // then
        verify(listAggregate).create(id, position, name);

    }

}
