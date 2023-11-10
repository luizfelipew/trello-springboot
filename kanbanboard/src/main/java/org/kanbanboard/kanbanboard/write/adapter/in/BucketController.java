package org.kanbanboard.kanbanboard.write.adapter.in;

import lombok.RequiredArgsConstructor;
import org.kanbanboard.kanbanboard.write.domain.application.CreateBucketCommand;
import org.kanbanboard.kanbanboard.write.domain.application.CreateBucketCommandHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/buckets")
@RequiredArgsConstructor
public class BucketController {

    private final CreateBucketCommandHandler handler;

    @PostMapping
    public ResponseEntity create(final CreateBucketCommand command) {

        handler.handle(command);

        return ResponseEntity.noContent()
                .build();
    }

}
