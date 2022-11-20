package vn.codegym.users.dto;


import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class UserDto implements Validator {
    private Integer id;

    @NotEmpty(message = "{name.invalid}")
    @Size(min = 5, max = 45, message = "{name.error.invalid}")
    private String firstName;
    @NotEmpty(message = "{name.invalid}")
    @Size(min = 5, max = 45, message = "{name.error.invalid}")
    private String lastName;

    @Pattern(regexp = "^((090)|(091))\\d{7}$", message = "{phone.invalid}")
    private String phoneNumber;

    @Min(value = 18, message = "{age.invalid}")
    private Integer age;

    @Email(message = "{email.invalid}")
    private String email;

    public UserDto() {
    }

    public UserDto(Integer id, String firstName, String lastName, String phoneNumber, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}

