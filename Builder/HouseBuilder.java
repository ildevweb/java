package Builder;

public class HouseBuilder implements HousingBuilder {
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
        House ho = new House();

        ho.setSize(size);
        ho.setName(name);
        ho.setPrice(price);
        ho.setRooms(rooms);
        
        return ho;
    }
}
