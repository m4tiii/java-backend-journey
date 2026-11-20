package pl.rokitowski.fundamentals.annotations;

public class User {
    @NotBlankField
    private String name;

    @NotBlankField
    private String email;

    private String description;

    public User(String name, String email, String description){
        this.name = name;
        this.email = email;
        this.description = description;
    }
}
