package exercicio04;

public class Animal {
    private String nome;
    private String especie;

   
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

   
    public String consultarNomeEspecie() {
        return "Nome: " + nome + ", Espécie: " + especie;
    }

   
    public void mudarNome(String novoNome) {
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            this.nome = novoNome;
        } else {
            System.out.println("Nome inválido! Não pode ser vazio.");
        }
    }

   
    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }
}

