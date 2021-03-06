package controller;

import dao.Identifiable;
import entities.EBike;
import entities.FoldingBike;
import entities.Speedelec;
import entities.TypeOfBike;
import service.BikeService;
import java.io.File;
import java.util.List;

public class BikeController {
  private final BikeService service;

  BikeController() {
    this(new File("./data", "ecobike.txt"));
  }

  BikeController(File file) {
    service = new BikeService(file);
  }

  public List<Identifiable> getAllBikes() {
    return service.getAllBikes();
  }

  public boolean addFoldingBike(FoldingBike foldingBike) {
    return service.addFoldingBike(foldingBike);
  }

  public boolean addSpeedelec(Speedelec speedelec) {
    return service.addSpeedelec(speedelec);
  }

  public boolean addEBike(EBike eBike) {
    return service.addEBike(eBike);
  }

  public List<Identifiable> searchBikes(TypeOfBike typeOfBike,
                                        String brand,
                                        Integer weight,
                                        Boolean availabilityLights,
                                        String color,
                                        Integer price,
                                        Integer sizeOfWheels,
                                        Integer numberOfGears,
                                        Integer maximumSpeed,
                                        Integer batteryCapacity) {
    return service
            .searchBikes(typeOfBike,
                    brand,
                    weight,
                    availabilityLights,
                    color,
                    price,
                    sizeOfWheels,
                    numberOfGears,
                    maximumSpeed,
                    batteryCapacity);
  }

  public void saveData() {
    service.saveData();
  }
}
