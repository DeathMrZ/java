public class DoubleCheckLockingInstanceCreator {
    private  volatile CarBuilder instance = null;
    public CarBuilder getInstance(){
            CarBuilder carService = instance;
            if (carService == null){
                synchronized (this){
                    carService = instance;
                    if (carService == null){
                        instance = carService = new CarBuilder();
                    }
                }
            }
        return carService;
    }
}
