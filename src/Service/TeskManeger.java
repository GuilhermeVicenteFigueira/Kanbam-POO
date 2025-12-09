package Service;
import Entity.Tesk;
import Entity.User;
import Enums.Priority;
import Enums.Status;
import Utils.Validator;
import com.sun.source.tree.UsesTree;

import java.util.List;

public class TeskManeger  {

    private List<Tesk> tesks;

    public Tesk createTesk(Integer id,String title, String description, Priority priority, User user, Status status) {
        Validator.validateTitle(title);
        Validator.validateDescription(description);
        Validator.validatePriority(priority);

        if(user == null) {
            throw new IllegalArgumentException("Tesk não pode ter um usario vazio");
        }

        Tesk tesk = new Tesk(id,title,description,priority,user,status);

        return tesk;
    }

    public void nextStage(Integer id) {
        Integer count = 1;

        if(id == null) {
            throw  new IllegalArgumentException("Id vazio!");
        }

        for(Tesk tesk : tesks) {

            if(id == tesk.getId()) {

                if(count == 1) {
                    tesk.setStatus(Status.GETTING_STARTED);
                    count++;
                } else if (count == 2) {
                    count++;
                    tesk.setStatus(Status.PENDING);
                } else if(count == 3) {
                    count++;
                    tesk.setStatus(Status.FINISHED);
                }

            }
        }
    }

    public void deleteTesk(Integer id) {
        if(id == null) {
            throw new IllegalArgumentException("Id vazio!");
        }

        for(Tesk tesk : tesks) {
            if(id == tesk.getId()) {
                tesks.remove(tesk);

            }
        }
    }

    public void editTesk(Integer id, String title, String description, Priority priority, User user) {
        if(id == null) {
            throw new IllegalArgumentException("Id vazio!");
        }

        for(Tesk tesk : tesks) {
            if(id == tesk.getId()) {
                tesk.setDescription(description);
                tesk.setTitle(title);
                tesk.setUser(user);
                tesk.setPriority(priority);
            }
        }
    }

    public List<Tesk> listTesks() {
        return tesks;
    }


}
