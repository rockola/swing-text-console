/**
 * Copyright (c) 2013 ooxi
 *     https://github.com/ooxi/swing-text-console
 *     violetland@mail.ru
 *
 * Copyright (c) 2009 Davidov I
 *     http://code.google.com/p/swing-text-console/
 *     davidov.i@gmail.com
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public  License
 * along with this library. If not, see <http://www.gnu.org/licenses/>.
 */
package com.bgzin.console;

import com.bgzin.console.TextComponent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TextComponentDemo {
	public static void main(String[] args) {
		TextComponentDemo demo = new TextComponentDemo();
		
		demo.createUI();
	}
	
	private void createUI() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Custom Component Demo");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLayout(new BorderLayout());
				
				final TextComponent textComponent = new TextComponent(12, 25, 80, Color.GREEN, Color.BLACK);
				
				JButton button = new JButton("Test");
				
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						textComponent.getCharacters()[0][0] = 'A';
						textComponent.getCharacters()[0][textComponent.getMaxCols() - 1] = 'B';
						textComponent.getCharacters()[textComponent.getMaxLines() - 1][0] = 'C';
						textComponent.getCharacters()[textComponent.getMaxLines() - 1][textComponent.getMaxCols() - 1] = 'D';
						
						textComponent.repaint();
					}
				});
				
				frame.add(textComponent, BorderLayout.CENTER);
				frame.add(button, BorderLayout.SOUTH);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
