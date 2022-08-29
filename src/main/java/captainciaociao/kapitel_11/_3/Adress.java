package captainciaociao.kapitel_11._3;

public class Adress {
    private String name;
    private String street;
    private String place;
    private String country;

    /**
     * @param name
     * @param street
     * @param place
     */
    public Adress(String name, String street, String place) {
        this.name = name;
        this.street = street;
        this.place = place;
        this.country = "Drusselstein";
    }

    /**
     * @param name
     * @param street
     * @param place
     * @param country
     */
    public Adress(String name, String street, String place, String country) {
        this.name = name;
        this.street = street;
        this.place = place;
        this.country = country;
    }

    public Adress() {}

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
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * @param place the place to set
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public void printAsCSV() {
        System.out.printf("%s;%s;%s;%s%n", this.name, this.street, this.place, this.country);
    }

}
