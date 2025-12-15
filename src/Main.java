import Entity.Tesk;
import Entity.User;
import Enums.Priority;
import Enums.Status;
import Service.TeskManeger;

void main() {
    User user1 = new User("Guilherme", "figueira.gui1@gmail.com","ABCD123!@",1);
    TeskManeger teskManeger = new TeskManeger();

    teskManeger.createTesk(1,"Estudar java","Estudar java pelo devDojo ou projeto solo",user1, Status.GETTING_STARTED, Priority.LOW);
    teskManeger.listTesks();
    teskManeger.editTesk(1,"Estudar Angular", "", Priority.CRITICAL, Status.PENDING, user1);
    teskManeger.listTesks();
    teskManeger.nextStage(1);
    teskManeger.listTesks();
    teskManeger.deleteTesk(1);
    teskManeger.listTesks();

}