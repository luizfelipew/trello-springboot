package org.kanbanboard.kanbanboard.write.domain.application;

import java.util.UUID;

public record CreateBucketCommand(UUID id, int position, String name) {

}
