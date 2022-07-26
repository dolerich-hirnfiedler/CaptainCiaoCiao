package captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_7;

import java.awt.*;

public class Store {
    private Point location;
    private String name;

    /**
     * @return the location
     */
    public Point getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Point location) {
        this.location = location;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param location
     * @param name
     */
    public Store(Point location, String name) {
        this.location = location;
        this.name = name;
    }

    public Store(int x, int y, String name) {
        this.location = new Point(x, y);
        this.name = name;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Store [location=" + location + ", name=" + name + "]";
    }

}
