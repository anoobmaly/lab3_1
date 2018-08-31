import javax.swing.*;

public class main {
    public static void main(String[] aeiou) {
        String input = JOptionPane.showInputDialog("Please input 1 number","0");
        JOptionPane.showMessageDialog(null,"message","title",JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null,"Do you love me ?" ,
                "Ask her ?",JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Love u too!!");
        }else {
            JOptionPane.showMessageDialog(null,"Remembered that answer!!");
        }
    }
}
