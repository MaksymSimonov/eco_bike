package entities;

import java.util.Objects;

public class EBike extends Bike {
  private final TypeOfBike typeOfBike = TypeOfBike.EBIKE;
  private int maximumSpeed;
  private int batteryCapacity;

  public EBike() {

  }

  public EBike(String brand,
               int maximumSpeed,
               int weight,
               boolean availabilityLights,
               int batteryCapacity,
               String color,
               int price) {
    super(TypeOfBike.EBIKE, brand, weight, availabilityLights, color, price);
    this.maximumSpeed = maximumSpeed;
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public TypeOfBike getTypeOfBike() {
    return typeOfBike;
  }

  public int getMaximumSpeed() {
    return maximumSpeed;
  }

  public int getBatteryCapacity() {
    return batteryCapacity;
  }

  public void setMaximumSpeed(int maximumSpeed) {
    this.maximumSpeed = maximumSpeed;
  }

  public void setBatteryCapacity(int batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    EBike eBike = (EBike) o;
    return typeOfBike == eBike.getTypeOfBike() &&
            maximumSpeed == eBike.getMaximumSpeed() &&
            batteryCapacity == eBike.getBatteryCapacity();
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), typeOfBike, maximumSpeed, batteryCapacity);
  }

  @Override
  public String toString() {
    return "EBike{" +
            ", bikeId=" + super.getId() +
            ", typeOfBike='" + typeOfBike.getFullNameOfType() + '\'' +
            ", brand='" + super.getBrand() + '\'' +
            ", maximumSpeed=" + maximumSpeed +
            ", weight=" + super.getWeight() +
            ", availabilityLights=" + super.isAvailabilityLights() +
            ", batteryCapacity=" + batteryCapacity +
            ", color='" + super.getColor() + '\'' +
            ", price=" + super.getPrice() +
            '}';
  }
}
