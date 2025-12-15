package Service;

import Entity.Tesk;
import Entity.User;
import Enums.Priority;
import Enums.Status;
import Utils.Validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeskManeger {

    private List<Tesk> tesks;


    public TeskManeger() {
        this.tesks = new ArrayList<>();
    }

    public Tesk createTesk(
            Integer id,
            String title,
            String description,
            User user,
            Status status,
            Priority priority
    ) {
        Validator.validateTitle(title);
        Validator.validateDescription(description);
        Validator.validatePriority(priority);

        if (user == null) {
            throw new IllegalArgumentException("Tesk não pode ter um usuário vazio");
        }

        Tesk tesk = new Tesk(id, title, description, priority, user, status);
        tesks.add(tesk);
        System.out.println("Tesk adicionado com sucesso");

        return tesk;
    }

    public void nextStage(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Id vazio!");
        }

        for (Tesk tesk : tesks) {
            if (id.equals(tesk.getId())) {

                switch (tesk.getStatus()) {
                    case GETTING_STARTED:
                        tesk.setStatus(Status.PENDING);
                        break;

                    case PENDING:
                        tesk.setStatus(Status.FINISHED);
                        break;

                    default:
                        System.out.println("Task já finalizada");
                }
                return;
            }
        }
    }

    public void deleteTesk(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Id vazio!");
        }

        Iterator<Tesk> iterator = tesks.iterator();

        while (iterator.hasNext()) {
            Tesk tesk = iterator.next();
            if (id.equals(tesk.getId())) {
                iterator.remove();
                System.out.println("Deletado com sucesso!");
                return;
            }
        }
    }

    public void editTesk(
            Integer id,
            String title,
            String description,
            Priority priority,
            Status status,
            User user
    ) {
        if (id == null) {
            throw new IllegalArgumentException("Id vazio!");
        }

        for (Tesk tesk : tesks) {
            if (id.equals(tesk.getId())) {
                tesk.setTitle(title);
                tesk.setDescription(description);
                tesk.setPriority(priority);
                tesk.setUser(user);
                tesk.setStatus(status);
                System.out.println("Editado com sucesso!");
                return;
            }
        }
    }

    public void listTesks() {
        if (tesks.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        for (Tesk tesk : tesks) {

            System.out.println("LISTA DE TESKS");

            System.out.println(tesk.getId());
            System.out.println(tesk.getTitle());
            System.out.println(tesk.getDescription());
            System.out.println(tesk.getPriority());
            System.out.println(tesk.getUser().getName());
            System.out.println(tesk.getStatus());

            System.out.println("-------------------------");
        }
    }
}
