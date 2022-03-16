package org.kanbanboard.kanbanboard.write.domain.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kanbanboard.kanbanboard.write.adapter.out.BucketRepositoryImpl;
import org.kanbanboard.kanbanboard.write.domain.core.Bucket;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.UUID;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CreateBucketCommandHandlerTest {

    @Test
    void GIVEN_ValidCommand_MUST_DelegateToListAggregate() {

        final ArgumentCaptor<Bucket> captor = ArgumentCaptor.forClass(Bucket.class);



        // given
        var id = UUID.randomUUID();
        var position = 1;
        var name = "TODO";
        var command = new CreateBucketCommand(id, position, name);
        var repository = mock(BucketRepositoryImpl.class);

        // when
        var handler = new CreateBucketCommandHandler(repository);
        handler.handle(command);

        // then
        verify(repository).create(captor.capture());
        var bucket = captor.getValue();

        assertThat(bucket.getUuid()).isEqualTo(id);
        assertThat(bucket.getPosition()).isEqualTo(position);
        assertThat(bucket.getName()).isEqualTo(name);
    }

}
