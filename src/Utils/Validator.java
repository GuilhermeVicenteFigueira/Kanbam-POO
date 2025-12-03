package Utils;

import Entity.User;
import Enums.Priority;

public class Validator
{

    public static boolean  validateEmail(String email)
    {

        if(email == null || email.isEmpty()) {
            throw new IllegalArgumentException("ERRO: O email não pode ser vazio.");
        }


        if(email.length() < 5 ) {
            throw new IllegalArgumentException("ERRO: Email muito pequeno");
        }

        if(email.length() > 25) {
            throw new IllegalArgumentException("ERRO: Email muito grande");
        }

        if(!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("ERRO: o email invalido.");
        }

        if(!email.contains("@")) {
            throw new IllegalArgumentException("ERRO: Email deve conter @");
        }

        return true;
    }

    public static boolean  validatePassword(String password) {

        if(password == null || password.isEmpty()) {
            throw new IllegalArgumentException("ERRO: Senha não pode ser vazia.");
        }

        if(password.length() < 5) {
            throw new IllegalArgumentException("ERRO: Senha muito pequeno");
        }

        if(password.length() > 10) {
            throw new IllegalArgumentException("ERRO: Senha muito grande");
        }

        if(!password.matches("^(?=(?:.*[a-z]){1})(?=(?:.*[A-Z]){1})(?=(?:.*\\\\d){1})(?=(?:.*[@$!%*?&.,;:_\\\\-]){1})[A-Za-z\\\\d@$!%*?&.,;:_\\\\-]+$")) {
            throw new IllegalArgumentException("ERRO: A senha deve conter caracter maisculos, minusculo, caracter especial e numeros.");
        }

        return true;
    }

    public static boolean validateName(String name)
    {

        if(name == null || name.isEmpty()) {
            throw  new IllegalArgumentException("ERRO: Nome deve ser preenchido.");
        }

        if(!name.matches("^[A-Za-zÀ-ÿ ]+$\n")) {
            throw new IllegalArgumentException("ERRO: Nome deve contecer numeros ou carcteres especial.");
        }

        if(name.length() < 2) {
            throw new IllegalArgumentException("ERRO: Nome muito pequeno.");
        }

        if(name.length() > 50) {
            throw new IllegalArgumentException("ERRO: Nome muito grande.");
        }

        return true;
    }

    public static boolean validateTitle(String title) {

        if(title == null || title.isEmpty()) {
            throw new IllegalArgumentException("ERRO: Titulo deve ser preenchido.");
        }

        if(title.length() < 3) {
            throw new IllegalArgumentException("ERRO: Titulo muito pequeno.");
        }

        if(title.length() > 100) {
            throw new IllegalArgumentException("ERRO: Titulo muito grande.");
        }

        return true;
    }

    public static boolean validateDescription(String description) {
        if(description == null || description.isEmpty()) {
            throw new IllegalArgumentException("ERRO: O campo Descrição deve ser preenchido.");
        }
        return true;
    }

    public static boolean validatePriority(Priority priority) {
        if(priority == null) {
            throw new IllegalArgumentException("ERRO: A prioridade deve ser preenchido.");
        }
        return true;
    }
}
