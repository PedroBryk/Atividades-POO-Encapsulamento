package exercicio03;

public class Aluno {
    private String nome;
    private double nota;

    
    public Aluno(String nome) {
        this.nome = nome;
        this.nota = 0;  
    }

    
    public void adicionarNota(double valor) {
        if (valor > 0 && valor <= 10) {
            if (this.nota + valor <= 10) {
                this.nota += valor;
            } else {
                System.out.println("Erro: A nota total não pode ultrapassar 10.");
            }
        } else {
            System.out.println("Erro: Nota a adicionar deve ser positiva e até 10.");
        }
    }

    
    public void retirarNota(double valor) {
        if (valor > 0) {
            if (this.nota - valor >= 0) {
                this.nota -= valor;
            } else {
                System.out.println("Erro: Nota insuficiente para retirar esse valor.");
            }
        } else {
            System.out.println("Erro: Valor a retirar deve ser positivo.");
        }
    }

   
    public double consultarNota() {
        return this.nota;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
