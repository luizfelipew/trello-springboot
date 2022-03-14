package org.kanbanboard.kanbanboard.write.domain.application;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class CreateBucketCommandTest {

    @Test
    void GIVEN_ValidData_MUST_RetrieveSameData() {

        // 1 given: fixture
        UUID id = UUID.randomUUID();
        int position = 1;
        String name = "TODO";

        // 2 when: exercise (execution)
        CreateBucketCommand command = new CreateBucketCommand(id, position, name);

        // 3 then: verify

        assertThat(command.id()).isEqualTo(id);
        assertThat(command.position()).isEqualTo(position);
        assertThat(command.name()).isEqualTo(name);
    }

}
