import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println(loc.getDisplayLanguage());
        System.out.println (loc.getLanguage()); 
    }
}
