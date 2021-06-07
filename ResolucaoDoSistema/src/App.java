import java.awt.Dimension;
import java.awt.Toolkit;

public class App {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        Dimension d = screenSize;
        System.out.println("A resolução do sistema é " + d.width + "X" + d.height);
    }
}
