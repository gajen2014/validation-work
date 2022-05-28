package com.javatechie.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class UserRequest {

    @NotNull(message = "Name should not be null")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;
    private String gender;
    @Min(20)
    @Max(60)
    private int age;
    @NotBlank(message="should not be blank")
    private String nationality;
}
