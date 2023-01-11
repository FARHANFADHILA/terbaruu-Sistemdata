package org.dataSIswa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class FormData {
    private JButton simpanButton;
    private JTextField textNama;
    private JTextField textTanggallahir;

    private DefaultTableModel tablesaya;
    private JTable tableGUI;
    private JPanel Panelku;
    private JTextField textUkt;
    private JLabel kategorinya;

    private int nomor;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormData");
        frame.setContentPane(new FormData().Panelku);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,700);
        frame.setVisible(true);
    }

    public FormData() {
        InitTable();
    simpanButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            nomor++;
            Back bck = new Back();
            String nama = textNama.getText();
            bck.setNama(nama);
            LocalDate tanggallahir = LocalDate.parse(textTanggallahir.getText());
            bck.setTanggallahir(tanggallahir);

            Long ukt = bck.setUKT(Long.valueOf(textUkt.getText()));

            Object [] Baris = {nomor, nama, bck.Umurnya(),ukt, bck.JenisUkt()};

            tablesaya.addRow(Baris);

            kategorinya.setText(bck.Umurnya());




        }
    });
}
public void InitTable(){
    Object[] kolom = {"No.", "Nama", "Tgl Lahir", "Usia", "Jenis UKT"};
    Object[][] baris = {};

    tablesaya = new DefaultTableModel(baris, kolom);
    tableGUI.setModel(tablesaya);
    tableGUI.setAutoCreateRowSorter(true);
}

    public JPanel getPanelku() {
        return Panelku;
    }
}
