public class Main {
    public static void main (String[] arg) {


        String s = JOptionPane.showInputDialog("Radien?");

        double r = Double.parseDouble(s);
        double omkr = 2 * 3.1415926536 * r;
        double area = 3.1415926536 * r * r;

        JOptionPane.showMessageDialog(null,
                "Omkrets: " + omkr + "\nArea: " + area);
    }
}