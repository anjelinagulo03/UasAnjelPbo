
package quizinheritance;


public class QuizInheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        Pisang pisang1 = new Pisang("Pisang1", "matang");
        Apel apel1 = new Apel("Pisang1", "kuning");
        
        Pisang pisang2 = new Pisang("Pisang2", "belum matang");
        Apel apel2 = new Apel("Pisang2", "hijau");
        
        pisang1.tampilkanRasa();
        pisang1.tampilkanKematangan();
        apel1.tampilkanWarna();
        
        pisang2.tampilkanRasa();
        pisang2.tampilkanKematangan();
        apel2.tampilkanWarna();
    }
}