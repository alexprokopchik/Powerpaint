/*
 * Alex Prokopchik
 * May 11, 2013
 *ToolBar.java
 */

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 * @author alexpro
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ToolBar extends JToolBar 
{

  /** A button group for the mutually exclusive tool bar buttons. */
  private final ButtonGroup my_group;
  
  /** The color button in the tool bar. */
  private JToggleButton my_color_button = new JToggleButton();

  /**
   * Construct the ToolBar.
   */
  public ToolBar() 
  {
    super();
    my_group = new ButtonGroup();
  }
  
  /**
   * Create a Color button for the ToolBar.
   * 
   * @param the_action to associate with the created JToggleButton
   */
  public void createColorButton(final Action the_action) 
  {
    my_color_button = new JToggleButton(the_action);
    my_group.add(my_color_button);
    add(my_color_button);        
  }

  /**
   * Create a JToggleButton for the ToolBar.
   * 
   * @param the_action to associate with the created JToggleButton
   */
  public void createToggleButton(final Action the_action) 
  {
    final JToggleButton toggle_button = new JToggleButton(the_action);
    my_group.add(toggle_button);
    add(toggle_button);
  }
  
  /**
   * Gets the color button.
   * 
   * @return color_button the Color button
   */
  public JToggleButton getColorButton()
  {
    return my_color_button;
  }

}
