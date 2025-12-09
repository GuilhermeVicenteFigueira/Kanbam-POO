package Entity;

import Enums.Priority;
import Enums.Status;
import Utils.Validator;

public class Tesk {
    private Integer id;
    private String title;
    private String description;
    private Priority priority;
    private User user;
    private Status status;

    public Tesk(Integer id, String title, String description, Priority priority, User user, Status status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.user = user;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        Validator.validateDescription(description);
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Validator.validateTitle(title);
        this.title = title;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        Validator.validatePriority(priority);
        this.priority = priority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        if(user == null) {
            System.err.println("AVISO: A atividade não foi atribuido a ninguem");
        }
        this.user = user;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
