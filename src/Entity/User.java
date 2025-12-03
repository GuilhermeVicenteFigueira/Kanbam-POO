package Entity;

import Utils.Validator;

public class User {
    String name;
    String email;
    String password;
    Integer id;

    public User(String name, String email, String password, Integer id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(!Validator.validateName(name)) {
            throw  new IllegalArgumentException("Nome Invalido");
        }

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        if(!Validator.validateEmail(email)) {
            throw  new IllegalArgumentException("Email Invalido");
        }

        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!Validator.validatePassword(password)) {
            throw  new IllegalArgumentException("Password Invalido");
        }

        this.password = password;
    }

}
