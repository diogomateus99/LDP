/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo
 */
public class Petroleiro extends Navio {
    private float carganavio;

    /**
     *
     * @param matriculanavio
     */
    public Petroleiro(String matriculanavio) {
        super(matriculanavio);
    }

    /**
     *
     * @return
     */
    public float getCarga() {
        return carganavio;
    }

    /**
     *
     * @param carganavio
     */
    public void setCarga(float carganavio) {
        this.carganavio = carganavio;
    }
    
    
}
