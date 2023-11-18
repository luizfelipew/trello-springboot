package org.kanbanboard.kanbanboard.write.domain.application;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record CreateBucketCommand(
        @JsonProperty("id") UUID id,
        @JsonProperty("position") Integer position,
        @JsonProperty("name") String name
) {

}
