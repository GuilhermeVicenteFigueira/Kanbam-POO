package Entity;

import Utils.Validator;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private String password;
    private Integer id;
    private List<Tesk> tesks = new ArrayList<>();

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
        Validator.validateName(name);
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Validator.validateEmail(email);
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Validator.validatePassword(password);
        this.password = password;
    }

    public List<Tesk> getTesks() {
        return tesks;
    }

    public void addTesk(Tesk tesk){
        if(tesk == null){
            throw  new IllegalArgumentException("Tesk Não pode ser vazio");
        }
        tesk.setUser(this);
        this.tesks.add(tesk);
    }

    public Integer getId() {
        return id;
    }

}
