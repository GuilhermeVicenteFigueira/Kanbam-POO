package Entity;

public class Usuario {
    String nome;
    String email;
    String senha;
    Integer id;

    public Usuario(String nome, String email, String senha, Integer id) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {

    }

}
