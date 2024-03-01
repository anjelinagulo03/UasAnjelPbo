
package quizinheritance;

public class Apel extends Buah {
    private String warna;

    public Apel(String nama, String warna) {
        super(nama);
        this.warna = warna;
    }
    
    public void tampilkanWarna(){
        System.out.println("Warna dari " + nama +": " + warna);
        System.out.println();
    }
}
