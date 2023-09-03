package uniderp.poo.escola.dominio;

import java.time.LocalDate;


public class Passageiro extends BasePessoa{
    private String email;
    private String NumeroCartao;
    private String Cartao;
    private LocalDate DataNascimento;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumeroCartao() {
        return NumeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        NumeroCartao = numeroCartao;
    }
    public String getCartao() {
        return Cartao;
    }
    public void setCartao(String cartao) {
        Cartao = cartao;
    }
    public LocalDate getDataNascimento() {
        return DataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }
    public Passageiro() {
    }
    
    public Passageiro(String codigo, String nome, String email, String telefone, LocalDate dataNascimento,
            String usuario, String senha, String numeroCartao, String cartao) {
        super(codigo, nome, email, telefone, dataNascimento, usuario, senha);
        NumeroCartao = numeroCartao;
        Cartao = cartao;
        DataNascimento = dataNascimento;
    }
    
}
    