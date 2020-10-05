/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabelaplacar.jogo;

/**
 *
 * @author Cassia
 */
public class Jogo {

    private int nrJogo;
    private int qtPlacar;

    public Jogo(int nrJogo, int qtPlacar) {
        this.nrJogo = nrJogo;
        this.qtPlacar = qtPlacar;
    }

    public void setNrJogo(int nrJogo) {
        this.nrJogo = nrJogo;
    }

    public int getNrJogo() {
        return this.nrJogo;
    }

    public void setQtPlacar(int qtPlacar) {
        this.qtPlacar = qtPlacar;
    }

    public int getQtPlacar() {
        return this.qtPlacar;
    }
}
