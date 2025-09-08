import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        int choice;
        String name;

        do {
            name = JOptionPane.showInputDialog("Enter your name:");
            if (name == null) System.exit(0); 

            choice = JOptionPane.showConfirmDialog(null, "Do you want to display your name?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
            }
        } while (choice != JOptionPane.YES_OPTION);
    }
}
