package com.weCode.bookStore.dto;

import jakarta.persistence.Column;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    private String title;

    private UUID id;

    private String description;

    private int releaseYear;


}
