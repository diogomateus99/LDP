/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo
 */
public class Porto {
    
    private int ctNavios;
    private int nMaxNavios;
    private Navio[] navios;

    /**
     *
     * @param nMaxNavios
     */
    public Porto(int nMaxNavios) {
        this.nMaxNavios = nMaxNavios;
        navios = new Navio[nMaxNavios];
        ctNavios = 0;
    }

    /**
     * Get the value of navios
     *
     * @return the value of navios
     */
    public Navio[] getNavios() {
        return navios;
    }

    /**
     * Get the value of noMaxNavios
     *
     * @return the value of noMaxNavios
     */
    public int getNoMaxNavios() {
        return nMaxNavios;
    }

    /**
     *
     * @param n
     */
    public void novoNavio(Navio n){
        if(ctNavios == nMaxNavios) {
            System.out.println("No máximo de navios (" + nMaxNavios + ") atingido!");
            return;
        }
            
        boolean enc = false;
        for(int i=0;i<ctNavios;i++){
            if(n.getMatricula().equals(navios[i].getMatricula())) {
                enc = true;
                System.out.println("Matrcula existente: " + n.getMatricula());
            }
        }
        if (!enc) {
            navios[ctNavios] = n;
            ctNavios++;
        } 
    }
      
    /**
     *
     * @return
     */
    public float getCapacidadeTotal(){
        float total = 0;
        for(int i=0; i<ctNavios; i++){
            if( navios[i] instanceof Petroleiro)
                total += ((Petroleiro) navios[i]).getCarga();
            if( navios[i] instanceof PortaContentores)
                total += ((PortaContentores) navios[i]).getNoContentores() * 10;
        }
        return total;
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Porto porto = new Porto(10);
        Petroleiro petro1 = new Petroleiro("1234"); petro1.setCarga(200);
        PortaContentores pConta1 = new PortaContentores("2345"); pConta1.setNoContentores(50);
        PortaContentores pConta2 = new PortaContentores("3456"); pConta2.setNoContentores(20);
        Navio n = new Navio("0123");
        Petroleiro petro2 = new Petroleiro("1234"); petro2.setCarga(200);
        
        porto.novoNavio(petro1);
        porto.novoNavio(petro2);
        porto.novoNavio(pConta1);
        porto.novoNavio(pConta2);
        porto.novoNavio(n);
        
        System.out.println("Capacidade total = " + porto.getCapacidadeTotal() + " toneladas.");
    }
}
