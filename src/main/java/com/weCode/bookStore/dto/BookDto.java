package com.weCode.bookStore.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Column;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "BookDto", description = "All details about book")
public class BookDto {

    @ApiModelProperty(
            value = "title",
            dataType = "String",
            example = "book title",
            notes = "Book title",
            required = true
    )
    private String title;

    @ApiModelProperty(
            readOnly = true,
            value = "UUID",
            dataType = "UUID",
            example = "b5607d38-8fc1-43ef-b44e-34967083c80a",
            notes = "The database generated uuid for book id",
            required = true
    )
    private UUID id;

    @ApiModelProperty(
            value = "description",
            dataType = "String",
            example = "book description",
            notes = "Book description",
            required = true
    )

    private String description;

    @ApiModelProperty(
            value = "2020",
            dataType = "int",
            example = "2020",
            notes = "Book releaseYear",
            required = true
    )
    private int releaseYear;


}
