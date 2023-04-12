package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    public int result = 0;

    public Calculator(){
        setTitle("Калькульятор");

        // Создаем панель вместе с кнопками операций

        JPanel panel = new JPanel();
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");

        JLabel result = new JLabel("result");
        JTextField x = new JTextField("1");
        JTextField y = new JTextField("2");

        // Создаем обработчик событий

        ActionListener listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x1 = Integer.parseInt(x.getText());
                int y1 = Integer.parseInt(y.getText());
                int res = x1 + y1;
                result.setText(String.valueOf(res));
            }
        };
        ActionListener listenerMinus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x1 = Integer.parseInt(x.getText());
                int y1 = Integer.parseInt(y.getText());
                int res = x1 - y1;
                result.setText(String.valueOf(res));
            }
        };
        ActionListener listenerMultiply = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x1 = Integer.parseInt(x.getText());
                int y1 = Integer.parseInt(y.getText());
                int res = x1 * y1;
                result.setText(String.valueOf(res));
            }
        };
        ActionListener listenerDivide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x1 = Integer.parseInt(x.getText());
                int y1 = Integer.parseInt(y.getText());
                int res = x1 / y1;
                result.setText(String.valueOf(res));
            }
        };
        // Привязываем кнопки операций к панели

        plus.addActionListener(listenerPlus);
        minus.addActionListener(listenerMinus);
        multiply.addActionListener(listenerMultiply);
        divide.addActionListener(listenerDivide);

        // Задаем размер окна

        panel.setSize(new Dimension(400, 650));

        // Добавляем панель вместе с кнопками операций

        add(panel);
        panel.add(result);
        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);
        panel.add(x);
        panel.add(y);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}
