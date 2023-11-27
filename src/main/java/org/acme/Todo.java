package org.acme;

public record Todo(
        String userId,
        int id,
        String title,
        boolean completed) {
}
