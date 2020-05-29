import java.awt.EventQueue;
import javax.swing.JFrame;

public class ShootingMissilesEx extends JFrame {

    public ShootingMissilesEx() {

        initUI();
    }

    private void initUI() {

        add(new Board(1));

        setSize(840, 520);
        setResizable(false);

        setTitle("Shooting missiles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            ShootingMissilesEx ex = new ShootingMissilesEx();
            ex.setVisible(true);
        });
    }
}