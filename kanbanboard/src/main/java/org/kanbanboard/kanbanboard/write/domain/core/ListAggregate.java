package org.kanbanboard.kanbanboard.write.domain.core;

import java.util.UUID;

public class ListAggregate {

    private final ListRepository repository;

    public ListAggregate(ListRepository repository) {
        this.repository = repository;
    }


    public void create(final UUID id, final int position, final String name) {
        repository.create(id, position, name);
    }

}
