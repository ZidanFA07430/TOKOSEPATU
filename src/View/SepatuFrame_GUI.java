package View;

import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SepatuFrame_GUI {
    private static SepatuController sepatu_c = new SepatuController();
    JFrame sepatu = new JFrame();
    JLabel namaLabel,merkLabel,warnaLabel,jenisLabel,genderLabel,kodeLabel,top;
    JTextField namaField,merkField,warnaField,jenisField,genderField,kodeField;
    JButton tambahBtn,updateBtn,hapusBtn;
    JTable tabelsepatu = new JTable();
    JScrollPane scroll = new JScrollPane(tabelsepatu);
    int index;

    public SepatuFrame_GUI(){

        sepatu.setSize(900,700);
        sepatu.setLayout(null);
        sepatu.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("DATA BUKU");
        top.setBounds(130,10,600,50);
        top.setFont(new Font("Times New Roman", Font.BOLD,40));
        sepatu.add(top);

        tabelsepatu.setModel(sepatu_c.listbuku());
        sepatu.setBounds(300,180,600,270);
        sepatu.add(scroll);



        namaLabel = new JLabel("Nama : ");
        sepatu.setBounds(30,150,100,30);
        sepatu.add(namaLabel);
        namaField = new JTextField();
        sepatu.setBounds(30,80,100,20);
        sepatu.add(namaField);

        merkLabel = new JLabel("Merk");
        sepatu.setBounds(150,50,80,20);
        sepatu.add(merkLabel);
        merkField = new JTextField();
        sepatu.setBounds(30,180,200,30);
        sepatu.add(merkField);

        warnaLabel = new JLabel("Warna");
        sepatu.setBounds(30,210,100,30);
        sepatu.add(warnaLabel);
        warnaField = new JTextField();
        sepatu.setBounds(30,240,200,30);
        sepatu.add(warnaField);

        jenisLabel = new JLabel("Jenis");
        sepatu.setBounds(30,270,100,30);
        sepatu.add(jenisLabel);
        jenisField = new JTextField();
        sepatu.setBounds(30,300,200,30);
        sepatu.add(jenisField);

        genderLabel = new JLabel("Gender");
        sepatu.setBounds(30,330,200,30);
        sepatu.add(genderLabel);
        genderField = new JTextField();
        sepatu.setBounds(30,360,200,30);
        sepatu.add(genderField);

        kodeLabel = new JLabel("kode");
        sepatu.setBounds(30,390,200,30);
        sepatu.add(kodeLabel);
        kodeField = new JTextField();
        sepatu.setBounds(30,420,200,30);
        sepatu.add(kodeField);

        tambahBtn = new JButton();
        tambahBtn.setText("Tambah");
        tambahBtn.setHorizontalTextPosition(JButton.CENTER);
        tambahBtn.setVerticalTextPosition(JButton.CENTER);
        sepatu.setBounds(50,470,150,30);
        sepatu.add(tambahBtn);

        updateBtn = new JButton();
        updateBtn.setText("Update");
        updateBtn.setHorizontalTextPosition(JButton.CENTER);
        updateBtn.setVerticalTextPosition(JButton.CENTER);
        sepatu.setBounds(50,510,150,30);
        sepatu.add(updateBtn);

        hapusBtn = new JButton();
        hapusBtn.setText("Hapus");
        hapusBtn.setHorizontalTextPosition(JButton.CENTER);
        hapusBtn.setVerticalTextPosition(JButton.CENTER);
        sepatu.setBounds(50,550,150,30);
        sepatu.add(hapusBtn);

        sepatu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sepatu.setVisible(true);
        sepatu.setLocationRelativeTo(null);

        tambahBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    int kode = Integer.valueOf(kodeField.getText());
                    String nama = namaField.getText();
                    String merk = merkField.getText();
                    String warna =  warnaField.getText();
                    String jenis = jenisField.getText();
                    String gender = genderField.getText();

                    AllObjekController.sepatu_c.insert(kode,nama,merk,warna,gender,jenis);
                    JOptionPane.showMessageDialog(null,"input sukses",
                            "information",JOptionPane.INFORMATION_MESSAGE);
                    tabelsepatu.setModel(AllObjekController.sepatu_c.listbuku());


                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"salah"+exception,
                            "information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } );
    }

}