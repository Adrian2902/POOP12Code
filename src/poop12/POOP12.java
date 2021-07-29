package poop12;
/**
 *
 * @author adriangutierrez
 */
public class POOP12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*************Thread**************");
        Hilo hilo1 = new Hilo("Primer hilo");
        hilo1.start();
        
        new Hilo("Segundo hilo").start();
        
        System.out.println("************Runable*************");
        new Thread(new HiloR(), "HiloR 1").start();
        new Thread(new HiloR(), "HiloR 2").start();
        
        
        System.out.println("Termina el hilo principal");
        
    }
    
}
