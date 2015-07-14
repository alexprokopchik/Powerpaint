/*
 * Alex Prokopchik
 * May 11, 2013
 *PowerPaintGUI.java
 */

import java.awt.BorderLayout;
import javax.swing.Action;
import javax.swing.JFrame;


/**
 * @author alexpro
 * @version 1.0
 */
public class PowerPaintGUI 
{
  // no fields this time!

  /**
   * Construct the GUI.
   */
  public PowerPaintGUI() 
  {
    start();
  }

  /**
   *  Sets up the GUI.
   */
  private void start() 
  {
    final JFrame gui_frame = new JFrame("TCSS 305 PowerPaint, Spring 2013");

   
    final ToolBar tool_bar = new ToolBar();
    final PaintPanel panel = new PaintPanel();
    final MenuBar menu_bar = new MenuBar(gui_frame, panel);
    
    final Action[] action = {new ColorAction(panel, menu_bar, tool_bar)};
    
    for (Action a : action) 
    { 
      menu_bar.createToolMenuButtonColor(a);
      tool_bar.createColorButton(a);
    }

    final Action[] action2 = {new PencilAction(panel),
                              new LineAction(panel),
                              new RectangleAction(panel),
                              new EclipseAction(panel)};

    for (Action c : action2) 
    {
      menu_bar.createToolMenuButton(c);
      tool_bar.createToggleButton(c);
    }

    gui_frame.setJMenuBar(menu_bar);

    gui_frame.add(tool_bar, BorderLayout.SOUTH);
    gui_frame.add(panel, BorderLayout.CENTER);
    gui_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui_frame.pack();
    gui_frame.setLocationRelativeTo(null);
    gui_frame.setVisible(true);
  }

}

