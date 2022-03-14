package org.kanbanboard.kanbanboard.write.domain.core;

import java.util.UUID;

public interface BucketRepository {

    void create(UUID id, int position, String name);
}
