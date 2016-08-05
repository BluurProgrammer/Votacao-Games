
package matheus.votacao.model;

import java.util.Objects;

public class Jogo{
    
    private String nome;
    private int votos;
    
    public Jogo(String nome)
    {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public boolean equals(Object obj) {      
      
        if (obj == null)
        {
            return false;
        }
   
        final Jogo other = (Jogo) obj;
        if (!Objects.equals(this.nome, other.nome)) 
        {
            return false;
        }
        
        return true;
    }
}
