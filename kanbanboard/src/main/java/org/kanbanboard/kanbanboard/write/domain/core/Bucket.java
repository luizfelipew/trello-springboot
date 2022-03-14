package org.kanbanboard.kanbanboard.write.domain.core;

import java.time.LocalDateTime;
import java.util.UUID;

public class Bucket {

    private int id;
    private UUID uuid;
    private int position;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Bucket() {
    }

    public int getId() {
        return id;
    }

    public Bucket setId(int id) {
        this.id = id;
        return this;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Bucket setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public int getPosition() {
        return position;
    }

    public Bucket setPosition(int position) {
        this.position = position;
        return this;
    }

    public String getName() {
        return name;
    }

    public Bucket setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Bucket setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Bucket setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
