package org.kanbanboard.kanbanboard.write.domain.application;

import org.kanbanboard.kanbanboard.write.domain.core.BucketRepository;

public class CreateBucketCommandHandler {

    private final BucketRepository repository;

    public CreateBucketCommandHandler(final BucketRepository repository) {

        this.repository = repository;
    }

    public void handle(CreateBucketCommand command) {

    }
}
