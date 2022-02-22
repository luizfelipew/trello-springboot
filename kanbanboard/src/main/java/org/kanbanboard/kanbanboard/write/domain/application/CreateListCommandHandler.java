package org.kanbanboard.kanbanboard.write.domain.application;

import org.kanbanboard.kanbanboard.write.domain.core.ListAggregate;

public class CreateListCommandHandler {

    private ListAggregate listAggregate;

    public CreateListCommandHandler(final ListAggregate listAggregate) {
        this.listAggregate = listAggregate;
    }

    public void handle(CreateListCommand command) {
        listAggregate.create(
            command.getId(),
            command.getPosition(),
            command.getName());
    }
}
