package Builder;

public class ApartmentBuilder implements HousingBuilder {
    public int size;
    public int price;
    public int rooms;
    public String name;


    public HousingBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public HousingBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public HousingBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HousingBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Housing build() {
        Apartment apar = new Apartment();

        apar.setSize(size);
        apar.setName(name);
        apar.setPrice(price);
        apar.setRooms(rooms);
        
        return apar;
    }
}
