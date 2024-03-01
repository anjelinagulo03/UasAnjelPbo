
package quizinheritance;

public class Pisang extends Buah {
    private String kematangan; 

    public Pisang(String nama, String kematangan) {
        super(nama);
        this.kematangan=kematangan;
    }
    
    public void tampilkanKematangan(){
        System.out.println(nama + " kematangannya: "+kematangan);
    }
}
