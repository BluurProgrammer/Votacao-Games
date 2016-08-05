/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matheus.votacao.model;

import java.util.Comparator;


public class ComparadorPorVotos implements Comparator<Jogo> {

    @Override
    public int compare(Jogo jogo1, Jogo jogo2) {
        
        if (jogo1.getVotos() < jogo2.getVotos())
            return 1;
        
        if (jogo1.getVotos() > jogo2.getVotos())
            return -1;
        
        return 0;
    }
}
