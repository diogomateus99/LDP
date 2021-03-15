/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo
 */
public class Navio {
    private String matriculanavio;
    private String nomenavio;
    private float comprimentonavio;

    /**
     *
     *
     * @param matriculanavio
     */
    public Navio(String matriculanavio) {
        this.matriculanavio = matriculanavio;
    }

    /**
     *
     * @return
     */
    public String getMatricula() {
        return matriculanavio;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nomenavio;
    }

    /**
     *
     * @return
     */
    public float getComprimento() {
        return comprimentonavio;
    }

    /**
     *
     * @param nomenavio
     */
    public void setNome(String nomenavio) {
        this.nomenavio = nomenavio;
    }

    /**
     *
     * @param comprimentonavio
     */
    public void setComprimento(float comprimentonavio) {
        this.comprimentonavio = comprimentonavio;
    }
    
    
}
