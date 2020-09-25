package io.fulchr3356.upkeepassistant.models;

public final class UserBuilder {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public UserBuilder() {
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withId(Integer id) {
        this.id = id;
        return this;
    }

    public UserBuilder withfirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }



    public User build() {
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        return user;
    }
}
