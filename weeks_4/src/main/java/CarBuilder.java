import model.Car;

public class CarBuilder {
    public void GetCars(String carId, String carName, String creator){
        Car car = Car.builder().carId(carId).carName(carName).creator(creator).build();
        System.out.println("car id: " + car.getCarId() + ";car name: "
                + car.getCarName() + " " + car.getCreator());
    }
}
