/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo
 */
public class PortaContentores extends Navio {
    
    private int noContentoresNavio;
    
    /**
     *
     * @param matriculanavio
     */
    public PortaContentores(String matriculanavio) {
        super(matriculanavio);
    }

    /**
     *
     * @return
     */
    public int getNoContentores() {
        return noContentoresNavio;
    }

    /**
     *
     * @param noContentoresNavio
     */
    public void setNoContentores(int noContentoresNavio) {
        this.noContentoresNavio = noContentoresNavio;
    }
    
    
}
