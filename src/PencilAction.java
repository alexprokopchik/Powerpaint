/*
 * Alex Prokopchik
 * May 11, 2013
 *PencilAction.java
 */

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * @author alexpro
 * @version 1.0
 */
@SuppressWarnings("serial")
public class PencilAction extends AbstractAction 
{

  /** The JPanel to associate with this Action. */
  private final PaintPanel my_panel;

  /**
   * Construct this Action.
   * 
   * @param the_panel a JPanel to associate with this Action.
   */
  public PencilAction(final PaintPanel the_panel) 
  {
    super("Pencil");
    my_panel = the_panel;
    putValue(Action.MNEMONIC_KEY, KeyEvent.VK_P);
    putValue(Action.SELECTED_KEY, true);
  }

  /** {@inheritDoc} */
  @Override
  public void actionPerformed(final ActionEvent the_event) 
  {
    my_panel.setDrawPencil();
    
  }

}