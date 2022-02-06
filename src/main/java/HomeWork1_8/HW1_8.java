package HomeWork1_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HW1_8 extends JFrame {
    private int value;
    private JLabel infoLabel;


    public HW1_8(){
        setBounds(500,500,500,120);
        setTitle("Counter app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
            }
        });

        //Шрифт
        Font font = new Font("Arial", Font.BOLD,32);

        //Добавление инфопанели
        //Будем показывать ошибку, если значение счетчика по модулю больше 100
        infoLabel = new JLabel();
        add(infoLabel, BorderLayout.CENTER); // Этот метод занимал место слева в окне, не понял, как его перенести

        //Кнопки увеличения и уменьшения
        setLayout(new GridLayout(1,0));
        JButton decrementButton = new JButton("<");
        JButton decrementButton10 = new JButton("<<");
        JLabel label = new JLabel(String.valueOf(value));
        JButton incrementButton = new JButton(">");
        JButton incrementButton10 = new JButton(">>");
        decrementButton.setFont(font);
        decrementButton10.setFont(font);
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        incrementButton.setFont(font);
        incrementButton10.setFont(font);

        add(decrementButton, BorderLayout.WEST);
        add(decrementButton10, BorderLayout.WEST);
        add(label, BorderLayout.CENTER);
        add(incrementButton, BorderLayout.EAST);
        add(incrementButton10, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        decrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value += 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        setVisible(true);
    }

    private void validateRange() {
        if (Math.abs(value) > 100) {
            infoLabel.setText("Value out of range");
        } else {
            infoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new HW1_8();
    }
}
