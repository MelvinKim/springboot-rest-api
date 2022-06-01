package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentDto {

    private long id;

    @NotEmpty(message = "The name should not be null or empty.")
    private String name;

    @NotEmpty(message = "The email should not be null or empty.")
    @Email(message = "The email should be a valid email.")
    private String email;

    @NotEmpty(message = "The body should bot be null oe empty.")
    @Size(min = 10, message = "The body should be at minimum of 10 characters.")
    private String body;
}
