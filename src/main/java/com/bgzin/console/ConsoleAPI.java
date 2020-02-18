/**
 * Copyright (c) 2013 ooxi https://github.com/ooxi/swing-text-console violetland@mail.ru
 *
 * <p>Copyright (c) 2009 Davidov I http://code.google.com/p/swing-text-console/ davidov.i@gmail.com
 *
 * <p>This library is free software; you can redistribute it and/or modify it under the terms of the
 * GNU Lesser General Public License as published by the Free Software Foundation; either version
 * 2.1 of the License, or (at your option) any later version.
 *
 * <p>This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * <p>You should have received a copy of the GNU Lesser General Public License along with this
 * library. If not, see <http://www.gnu.org/licenses/>.
 */
package com.bgzin.console;

import java.awt.Color;

public interface ConsoleAPI {
  public void setCharAt(int line, int pos, char chr, Color foregroundColor, Color backgroundColor);

  public void setCharAt(int line, int pos, char chr, Color foregroundColor);

  public void setCharAt(int line, int pos, char chr);

  public char getCharAt(int line, int pos);

  public void setStringAt(
      int line, int pos, String str, Color foregroundColor, Color backgroundColor);

  public void setStringAt(int line, int pos, String str, Color foregroundColor);

  public void setStringAt(int line, int pos, String str);

  public void setForegroundAt(int line, int pos, Color color);

  public void setBackgroundAt(int line, int pos, Color color);

  public Color getForegroundAt(int line, int pos);

  public Color getBackgroundAt(int line, int pos);

  public void clear();

  public void refresh();

  public ConsoleAPI getConsoleAPI();
}
