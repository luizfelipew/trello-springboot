package org.kanbanboard.kanbanboard.write.domain.application;

import java.util.UUID;

public class CreateListCommand {

    private final UUID id;
    private final int position;
    private final String name;

    public CreateListCommand(final UUID id, final int position, final String name) {
        this.id = id;
        this.position = position;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

}
