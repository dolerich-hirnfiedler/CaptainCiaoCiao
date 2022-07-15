package captainciaociao.kapitel_10._oberklasse.aufgabe_1;

public class Person {
    public long id;
    public int age;
    public double income;
    public boolean isDrugLord;
    public String name;

    // eq and hash
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + (int) (id ^ (id >>> 32));
        long temp;
        temp = Double.doubleToLongBits(income);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (isDrugLord ? 1231 : 1237);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (id != other.id)
            return false;
        if (Double.doubleToLongBits(income) != Double.doubleToLongBits(other.income))
            return false;
        if (isDrugLord != other.isDrugLord)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
