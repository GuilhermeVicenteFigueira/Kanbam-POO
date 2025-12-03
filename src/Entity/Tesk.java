package Entity;

import Enums.Priority;
import Utils.Validator;

public class Tesk {
    String title;
    String description;
    Priority priority;
    User user;

    public Tesk(String description, String title, Priority priority, User user) {
        this.description = description;
        this.title = title;
        this.priority = priority;
        this.user = user;
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
}
