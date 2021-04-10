import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Basebox extends JFrame {

    JPanel sideBox;
    JButton okButton;
    JButton notOkButton;
    public Basebox() {
        sideBox = new JPanel();
        sideBox.setLayout(new BorderLayout());
        okButton = new JButton("Ok");
        notOkButton = new JButton("No");
        okButton.addActionListener(new okButtonActionListener());
        notOkButton.addActionListener(new okButtonActionListener());
    }

    public void go() {

        sideBox.add(okButton, BorderLayout.NORTH);
        this.add(sideBox);
        sideBox.add(notOkButton,BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);


        this.setVisible(true);

    }

}