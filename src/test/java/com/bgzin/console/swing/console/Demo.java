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
package com.bgzin.console.swing.console;

import com.bgzin.swing.console.ConsoleAPI;
import com.bgzin.swing.console.TextConsole;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Demo {
	public static void main(String... args) {
		Demo demo = new Demo();
		demo.createUI();
	}
	
	private void performDemo(ConsoleAPI consoleAPI) {
		consoleAPI.clear();
		
		consoleAPI.setStringAt(4, 57, "Demon", Color.BLUE, Color.GREEN);
		consoleAPI.setStringAt(19, 75, "'Stargate SG1' will live forever!", Color.CYAN, Color.DARK_GRAY);
		consoleAPI.setCharAt(3, 6, 'D');
		consoleAPI.setCharAt(3, 7, 'r', Color.YELLOW, Color.GRAY);
		consoleAPI.setCharAt(3, 8, 'a', Color.BLACK, Color.WHITE);
		consoleAPI.setCharAt(3, 9, 'g');
		consoleAPI.setStringAt(1, 79, "Test1");
		consoleAPI.setStringAt(5, 1, "Hello");
		consoleAPI.setCharAt(0, 0, 'S');
		consoleAPI.setCharAt(0, 1, 'T');
		consoleAPI.setCharAt(0, 2, 'U');
		consoleAPI.setStringAt(7, 17, "Demon", Color.BLUE, Color.YELLOW);
		consoleAPI.setCharAt(24, 77, 'U');
		consoleAPI.setCharAt(24, 78, 'V');
		consoleAPI.setCharAt(24, 79, 'W', Color.BLACK, Color.WHITE);
		
		consoleAPI.refresh();				
	}
	
	private void createUI() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrame frame = new JFrame("Swing Text Console");

				TextConsole console = new TextConsole();
								
				frame.setLayout(new BorderLayout());
				frame.add(console, BorderLayout.CENTER);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
				frame.pack();
				frame.setVisible(true);
				
				performDemo(console.getConsoleAPI());
			}
		});
	}
}
