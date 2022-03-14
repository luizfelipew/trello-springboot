package org.kanbanboard.kanbanboard.write.domain.core;

import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class BucketTest {

    @Test
    void GIVEN_ValidateData_MUST_RetrieveSameData() {

        // given
        var id = 1;
        var uuid = UUID.randomUUID();
        var position = 1;
        var name = "TODO";
        var createdAt = LocalDateTime.now();
        var updatedAt = LocalDateTime.now();

        // when
        var bucket = new Bucket()
            .setId(id)
            .setUuid(uuid)
            .setPosition(position)
            .setName(name)
            .setCreatedAt(createdAt)
            .setUpdatedAt(updatedAt);

        // then
        assertThat(bucket.getId()).isEqualTo(id);
        assertThat(bucket.getUuid()).isEqualTo(uuid);
        assertThat(bucket.getPosition()).isEqualTo(position);
        assertThat(bucket.getName()).isEqualTo(name);
        assertThat(bucket.getCreatedAt()).isEqualTo(createdAt);
        assertThat(bucket.getUpdatedAt()).isEqualTo(updatedAt);

    }
}
