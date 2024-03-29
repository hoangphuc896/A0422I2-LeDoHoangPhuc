package castudymodule2.models;

import java.io.Serializable;

public class Room extends Facility implements Serializable {
    private String freeService;

    public Room() {

    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                "} ";
    }
}
