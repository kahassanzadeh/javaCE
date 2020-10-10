/**
 * this class created for the shapes
 * square rectangle triangle and cross are the shapes that this class can draw
 *
 *
 * @author Mohammadreza Hassanzadeh
 * @version 0.0
 * @since 2020-08-10
 */

public class Shape {
    // counting the stars that the shapes created from
    private int countOfStars = 0;

    /**
     * getting the counter of stars
     * @return count of stars
     */
    public int getCountOfStars(){
        return countOfStars;
    }

    /**
     * drawing square
     * @param length the length of the square
     */
    public void drawSquare(int length){
        for(int foo = 0; foo < length;foo++){
            for(int bar = 0; bar < length;bar++){
                System.out.print("*");
                countOfStars++;
            }
            System.out.println();
        }
    }

    /**
     * drawing rectangle using two parameters
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public void drawRectangle(int length , int width){
        for(int foo = 0; foo < length;foo++){
            for(int bar = 0; bar < width;bar++){
                System.out.print("*");
                countOfStars++;

            }
            System.out.println();
        }
    }

    /**
     * drawing triangle right angle isosceles triangle
     * @param height getting the leg of a triangle
     */
    public void drawTriangle(int height ){
        for(int foo = 0; foo < height;foo++){
            for(int bar = 0; bar <= foo;bar++){
                System.out.print("*");
                countOfStars++;
            }
            System.out.println();
        }
    }

    /**
     * drawing a cross getting two parameters
     * @param length the length of the cross
     * @param width the width of the cross
     */
    public void drawCross(int length, int width){
        for(int foo = 0; foo < length;foo++){
            for(int bar = 0; bar < width;bar++){
                if(bar == width / 2 || foo == length / 2){
                    System.out.print("*");
                    countOfStars++;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
