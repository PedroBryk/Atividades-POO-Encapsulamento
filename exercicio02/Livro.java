package exercicio02;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        if (ano < 0) {
            System.out.println("Ano inválido: não pode ser negativo.");
        } else {
            this.ano = ano;
        }
    }
}
