import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class okButtonActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Ok")) {
            System.out.println("You pressed okay");
            }

        else if(e.getActionCommand().equals("No")){
            System.out.println("You pressed no");
        }

    }

}