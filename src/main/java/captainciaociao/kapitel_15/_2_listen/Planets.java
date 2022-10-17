package captainciaociao.kapitel_15._2_listen;

public enum Planets {
    JUPITER("Jupiter", 139_822), SATURN("Saturn", 116_464), URANUS("Uranus", 50_724), NEPTUNE("Neptune", 49_248),
    EARTH("Earth", 12_756), VENUS("Venus", 12_104), MARS("Mars", 6_780), MERCURY("Mercury", 4_780),
    PLUTO("Pluto", 2_400);

    public final String name;
    public final int diameter;

    /**
     * @param name
     * @param diameter
     */
    private Planets(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }
}
