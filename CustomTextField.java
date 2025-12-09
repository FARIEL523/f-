package com.mycompany.main;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalTextFieldUI;

public class CustomTextField extends JTextField {

    private TextFieldUI textUI;
    private int round = 35;   // <-- NetBeans will detect this bean property

    public CustomTextField() {
        textUI = new TextFieldUI(this);
        setUI(textUI);
        textUI.setRound(round);
    }

    // ============================================================
    //  PUBLIC BEAN PROPERTY FOR NETBEANS DESIGNER
    // ============================================================

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        if (textUI != null) textUI.setRound(round);
        repaint();
    }

    // ============================================================
    //  INNER UI CLASS
    // ============================================================

    private class TextFieldUI extends MetalTextFieldUI {
        private JTextField textField;
        private Border border;
        private int round = 35;
        private List<String> items = new ArrayList<>();

        public int getRound() {
            return round;
        }

        public void setRound(int round) {
            this.round = round;
            if (border != null) border.setRound(round);
            if (textField != null) textField.repaint();
        }

        public TextFieldUI(JTextField textField) {
            this.textField = textField;
            border = new Border(10);
            border.setRound(round);
            textField.setBorder(border);
            textField.setOpaque(false);
            textField.setSelectionColor(Color.cyan);
            textField.setSelectedTextColor(Color.white);

            textField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    border.setColor(Color.decode("#2176E5"));
                    textField.repaint();
                }

                @Override
                public void focusLost(FocusEvent e) {
                    border.setColor(Color.black);
                    textField.repaint();
                }
            });
        }

        @Override
        protected void paintBackground(Graphics g) {
            if (textField.isOpaque()) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(textField.getBackground());
                g2d.fillRoundRect(0, 0, textField.getWidth() - 1, textField.getHeight() - 1, round, round);
                g2d.dispose();
            }
        }

        private class Border extends EmptyBorder {
            private Color focusColor = Color.decode("#2176E5");
            private Color color = Color.GREEN;
            private int round;

            public void setRound(int round) {
                this.round = round;
            }

            public Border(int border) {
                super(border, border, border, border);
            }
            
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                if (c.isFocusOwner()) {
                    g2d.setColor(focusColor);
                } else {
                    g2d.setColor(color);
                }

                g2d.drawRoundRect(x, y, width - 1, height - 1, round, round);
                g2d.dispose();
            }

            private void setColor(Color color) {
                this.color = color;
            }
        }
    }
}
