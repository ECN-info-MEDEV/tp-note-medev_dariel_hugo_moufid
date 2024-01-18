package org.centrale.app;

/**
 * Represents a 2D point.
 */
public class Point2D {

    private int x;
    private int y;

    /**
     * Constructs a Point2D with default coordinates (0, 0).
     */
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructs a Point2D with specified coordinates.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     */
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a Point2D with the same coordinates as another Point2D.
     *
     * @param p The Point2D to copy coordinates from.
     */
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Displays the coordinates of the point.
     */
    public void display() {
        //System.out.println("[" + this.x + "; " + this.y + "]");
    }

    /**
     * Sets the x-coordinate.
     *
     * @param x The new x-coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Sets the y-coordinate.
     *
     * @param y The new y-coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the x-coordinate.
     *
     * @return The x-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y-coordinate.
     *
     * @return The y-coordinate.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the position of the point.
     *
     * @param x The new x-coordinate.
     * @param y The new y-coordinate.
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Translates the point by a specified amount.
     *
     * @param dx The change in the x-coordinate.
     * @param dy The change in the y-coordinate.
     */
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /**
     * Calculates the distance between two points.
     *
     * @param p1 The first Point2D.
     * @param p2 The second Point2D.
     * @return The distance between the two points.
     */
    public double distance(Point2D p1, Point2D p2) {
        // Intentional mistake: Returning an integer instead of a double
        return (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
    }
}
