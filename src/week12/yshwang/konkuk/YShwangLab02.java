package week12.yshwang.konkuk;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class YShwangLab02 extends JFrame implements ActionListener, ItemListener {

	String[] fontStyle = { "바탕체", "돋움체", "굴림체", "궁서체" };
	Integer[] fontSize = { 10, 12, 14, 16, 18, 20, 22, 24, 26 };
	String[] fontCheck = { "Bold", "Italic" };
	JCheckBox[] check = new JCheckBox[2];
	JTextField text;
	JLabel label;

	JPanel north = new JPanel();
	JPanel center = new JPanel();

	YShwangLab02() {
		this("202110547 황윤선");
	}

	public YShwangLab02(String title) {
		super(title);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
		this.setVisible(true);

	}

	public void init() {
		Container c = getContentPane();

		JComboBox cbFontSytle = new JComboBox(fontStyle);
		north.add(cbFontSytle);
		JComboBox cbFontSize = new JComboBox(fontSize);
		cbFontSize.setSelectedIndex(1);
		north.add(cbFontSize);

		cbFontSytle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				int index = cb.getSelectedIndex();

				Font font = new Font(fontStyle[index], label.getFont().getStyle(), label.getFont().getSize());
				label.setFont(font);

			}

		});

		cbFontSize.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				int index = cb.getSelectedIndex();

				Font font = new Font(label.getFont().getFontName(), label.getFont().getStyle(), fontSize[index]);
				label.setFont(font);

			}

		});

		for (int i = 0; i < fontCheck.length; i++) {
			check[i] = new JCheckBox(fontCheck[i], false);
			check[i].setBorderPainted(true);
			check[i].addItemListener(this);

			north.add(check[i]);
		}

		text = new JTextField(20);
		text.setFont(new Font(fontStyle[0], Font.PLAIN, fontSize[1]));
		text.addActionListener(this);
		north.add(text);

		label = new JLabel("202110547 황윤선", SwingConstants.CENTER);
		label.setFont(text.getFont());
		center.add(label);

		c.add(north, BorderLayout.NORTH);
		c.add(center, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText(text.getText());

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if (e.getItem() == check[0]) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (label.getFont().isBold() && !label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD, label.getFont().getSize());
					label.setFont(font);

				} else if (!label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD | Font.ITALIC,
							label.getFont().getSize());
					label.setFont(font);

				} else if (label.getFont().isPlain()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD, label.getFont().getSize());
					label.setFont(font);
				} else if (label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD | Font.ITALIC,
							label.getFont().getSize());
					label.setFont(font);
				}

			} else {
				if (label.getFont().isBold() && !label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.PLAIN, label.getFont().getSize());
					label.setFont(font);

				} else if (!label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.ITALIC, label.getFont().getSize());
					label.setFont(font);

				} else if (label.getFont().isPlain()) {
					Font font = new Font(label.getFont().getFontName(), Font.PLAIN, label.getFont().getSize());
					label.setFont(font);
				} else if (label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.ITALIC, label.getFont().getSize());
					label.setFont(font);
				}

			}
		} else {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (label.getFont().isBold() && !label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD | Font.ITALIC,
							label.getFont().getSize());
					label.setFont(font);

				} else if (!label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.ITALIC, label.getFont().getSize());
					label.setFont(font);

				} else if (label.getFont().isPlain()) {
					Font font = new Font(label.getFont().getFontName(), Font.ITALIC, label.getFont().getSize());
					label.setFont(font);
				} else if (label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD | Font.ITALIC,
							label.getFont().getSize());
					label.setFont(font);
				}

			} else {
				if (label.getFont().isBold() && !label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD, label.getFont().getSize());
					label.setFont(font);

				} else if (!label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.PLAIN, label.getFont().getSize());
					label.setFont(font);

				} else if (label.getFont().isPlain()) {
					Font font = new Font(label.getFont().getFontName(), Font.PLAIN, label.getFont().getSize());
					label.setFont(font);
				} else if (label.getFont().isBold() && label.getFont().isItalic()) {
					Font font = new Font(label.getFont().getFontName(), Font.BOLD, label.getFont().getSize());
					label.setFont(font);
				}

			}

		}

	}

	public static void main(String[] args) {
		new YShwangLab02();
	}

}
