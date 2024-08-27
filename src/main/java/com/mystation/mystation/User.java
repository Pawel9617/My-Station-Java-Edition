package com.mystation.mystation;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "users")
public record User(
        @Id
        Integer id,
        @NotEmpty
        String username
) {
}