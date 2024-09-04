package com.mystation.mystation;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Table(name = "users")
public record User(
        @Id
        UUID id,
        @NotEmpty
        String username
) {
}