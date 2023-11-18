package org.kanbanboard.kanbanboard.write.adapter.in;

import lombok.RequiredArgsConstructor;
import org.kanbanboard.kanbanboard.write.domain.application.CreateBucketCommand;
import org.kanbanboard.kanbanboard.write.domain.application.CreateBucketCommandHandler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(value = "v1/buckets")
@RequiredArgsConstructor
public class BucketController {

    private final CreateBucketCommandHandler handler;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity create(@RequestBody final CreateBucketCommand command) throws Exception {

        handler.handle(command);

        return ResponseEntity.created(new URI(""))
                .build();
    }

}
