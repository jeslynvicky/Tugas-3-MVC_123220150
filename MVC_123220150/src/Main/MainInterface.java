package Main;

import View.Mahasiswa.ViewDataMahasiswa;
import View.Dosen.ViewDataDosen;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame {

    JButton tombolMahasiswa = new JButton("View Mahasiswa");
    JButton tombolDosen = new JButton("View Dosen");

    public MainInterface() {
        setTitle("Main Interface");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(400, 200);

        add(tombolMahasiswa);
        add(tombolDosen);

        tombolMahasiswa.setBounds(50, 50, 300, 40);
        tombolDosen.setBounds(50, 100, 300, 40);

        tombolMahasiswa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View.Mahasiswa.ViewDataMahasiswa();
                dispose();
            }
        });

        tombolDosen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View.Dosen.ViewDataDosen();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MainInterface();
    }
}
