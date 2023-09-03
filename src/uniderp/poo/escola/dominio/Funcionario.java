package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Funcionario extends BasePessoa{
    private String telefone;
    private String ContaCorrente;
    private String Cracha;
    private String Senha;
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getContaCorrente() {
        return ContaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        ContaCorrente = contaCorrente;
    }
    public String getCracha() {
        return Cracha;
    }
    public void setCracha(String cracha) {
        Cracha = cracha;
    }
    public String getSenha() {
        return Senha;
    }
    public void setSenha(String senha) {
        Senha = senha;
    }
    public Funcionario(String codigo, String nome, String email, String telefone, LocalDate dataNascimento,
            String usuario, String senha, String telefone2, String contaCorrente, String cracha, String senha2) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        telefone = telefone2;
        ContaCorrente = contaCorrente;
        Cracha = cracha;
        Senha = senha2;
    }
    public Funcionario(String telefone, String contaCorrente, String cracha, String senha) {
        this.telefone = telefone;
        ContaCorrente = contaCorrente;
        Cracha = cracha;
        Senha = senha;
    }
    
    
    

}