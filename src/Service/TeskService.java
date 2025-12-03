package Service;
import Entity.Tesk;
import Entity.User;
import Enums.Priority;
import Utils.Validator;

public class TeskService {

    public Tesk createTesk(String title, String description, Priority priority, User user) {
        Validator.validateTitle(title);
        Validator.validateDescription(description);
        Validator.validatePriority(priority);

        if(user == null) {
            throw new NullPointerException("Tesk não pode ter um usario vazio");
        }

        Tesk tesk = new Tesk(title, description, priority, user);

        return tesk;
    }

}
