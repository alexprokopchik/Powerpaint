import java.awt.Color;

/*
 *Alex Prokopchik
 * May 21, 2013
 *Shape.java
 */

/**
 * @author alexpro
 * @version 1.0
 */
public class Shape
{
  /**
   * The first x value.
   */
  private final int my_x;
  
  /**
   * The first y value.
   */
  private final int my_y;
  
  /**
   * The shape of the object drawn.
   */
  private final int my_shape;
  
  /**
   * The thickness of the object drawn.
   */
  private final int my_thickness;
  
  /**
   * The color of the object drawn.
   */
  private final Color my_color;
  
  /**
   * The last x value.
   */
  private final int my_x1;
  
  /**
   * The last y value.
   */
  private final int my_y1;
  
  /**
   * This method stores the shape object that is drawn.
   * 
   * @param the_x the first x value
   * @param the_y the first y value
   * @param the_shape the shape
   * @param the_thickness the thickness of the shape
   * @param the_color the color of the shape
   * @param the_x1 the last x value
   * @param the_y1 the last y value
   */
  public Shape(final int the_x, final int the_y, final int the_shape, final int the_thickness,
               final Color the_color, final int the_x1, final int the_y1)
  {
    my_x = the_x;
    my_y = the_y;
    my_shape = the_shape;
    my_thickness = the_thickness;
    my_color = the_color;
    my_x1 = the_x1;
    my_y1 = the_y1;
    
  }
  
 /**
  * the Getter for the first x value.
  * @return my_x the first x value
  */
  public int getX()
  {
    return my_x;
  }
  
  /**
   * the Getter for the first y value.
   * @return my_y the first y value
   */
  public int getY()
  {
    return my_y;
  }
  
  /**
   * the Getter for the shape.
   * @return my_shape the shape value
   */
  public int getShape()
  {
    return my_shape;
  }
  
  /**
   * the Getter for the thickness.
   * @return my_thickness the thickness value
   */
  public int getThickness()
  {
    return my_thickness;
  }
  
  /**
   * the Getter for the color.
   * @return my_color the color
   */
  public Color getColor()
  {
    return my_color;
  }
  
  /**
   * the Getter for the last x.
   * @return my_x1 the last x
   */
  public int getX1()
  {
    return my_x1;
  }
  
  /**
   * the Getter for the last y.
   * @return my_y1 the last y
   */
  public int getY1()
  {
    return my_y1;
  }
}
