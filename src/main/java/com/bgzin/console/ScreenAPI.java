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

import java.awt.Color;

public interface ScreenAPI {	
	public void setForegroundColor(Color foregroundColor);
	public void setBackgroundColor(Color backgroundColor);
	
	public Color getForegroundColor();
	public Color getBackgroundColor();
	
	public int getMaxLines();
	public int getMaxChars();
	
	public char[][] getCharacters();
	
	public Color[][] getBackgroundColors();
	public Color[][] getForegroundColors();
		
	public void clear();
	public void refresh();
	
	public ScreenAPI getScreenAPI();
}
