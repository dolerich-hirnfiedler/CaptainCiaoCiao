package captainciaociao.kapitel_15._2_listen;

import java.text.NumberFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Receipt {
    public class Item {
        private String name;
        private int centPrice;
        private int occurrence;

        /**
         * @param name
         * @param centPrice
         * @param occurrence
         */
        public Item(String name, int centPrice, int occurrence) {
            if (centPrice <= 0) {
                throw new IllegalArgumentException("Price cannot be <=0");
            }
            if (occurrence <= 0) {
                throw new IllegalArgumentException("Occurrence cannot be <=0");
            }
            this.name = name;
            this.centPrice = centPrice;
            this.occurrence = occurrence;
        }

        /**
         * @param name
         * @param price
         */
        public Item(String name, int price) {
            this.name = name;
            this.centPrice = price;
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
         * @return the occurrence
         */
        public int getOccurrence() {
            return occurrence;
        }

        /**
         * @param occurrence the occurrence to set
         */
        public void setOccurrence(int occurrence) {
            this.occurrence = occurrence;
        }

        /**
         * @return the centPrice
         */
        public int getCentPrice() {
            return centPrice;
        }

        /**
         * @param centPrice the centPrice to set
         */
        public void setCentPrice(int centPrice) {
            this.centPrice = centPrice;
        }

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Object#hashCode()
         */

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + centPrice;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + occurrence;
            return result;
        }

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Object#equals(java.lang.Object)
         */

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Item other = (Item) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (centPrice != other.centPrice)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (occurrence != other.occurrence)
                return false;
            return true;
        }

        private Receipt getEnclosingInstance() {
            return Receipt.this;
        }

        private Item incrementOccurence() {
            return new Item(name, centPrice, occurrence++);
        }
    }

    private final List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        int maybeIndex = items.indexOf(item);
        if (maybeIndex >= 0) {
            items.set(maybeIndex, items.get(maybeIndex).incrementOccurence());
        } else {
            items.add(item);
        }

    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        StringBuilder result = new StringBuilder(512);
        int sum = 0;
        for (Item item : items) {
            int itemPriceTotal = item.centPrice * item.occurrence;
            String line = String.format("%dx %-20s%10s%10s%10s", item.occurrence, item.name,
                    currencyFormatter.format(item.centPrice / 100.), currencyFormatter.format(itemPriceTotal / 100.));
            result.append(line);
            sum += itemPriceTotal;
        }

        result.append("\nSum: ").append(currencyFormatter.format(sum / 100.)).append("\n");

        return result.toString();
    }
}
