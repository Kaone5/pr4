package ru.mirea.ivashchenko.pr4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FootBall extends JFrame
{
    private int ScoreMilan = 0;
    private int ScoreMadrid = 0;

    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");

    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");


    public FootBall()
    {
        super("Football");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(660,100);

        add(button1, BorderLayout.WEST);
        add(button2, BorderLayout.EAST);
        add(result);
        add(lastScorer);
        add(winner);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button1 = (JButton) e.getSource();
                ScoreMilan++;
                result.setText("Result:" + ScoreMilan + " X " + ScoreMadrid);
                lastScorer.setText("Last Scorer: "+ button1.getText());
                update();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button2 = (JButton) e.getSource();
                ScoreMadrid++;
                result.setText("Result: " + ScoreMilan + " X " + ScoreMadrid);
                lastScorer.setText("Last Scorer: " + button2.getText());
                update();
            }
        });
    }

    private void update(){
        winner.setText("Winner: " + (ScoreMilan == ScoreMadrid ? "DRAW" :
                (ScoreMilan > ScoreMadrid ? button1.getText():
                        button2.getText())));

    }


}