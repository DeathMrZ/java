public enum  EnumSingletonCreator {
    INSTANCE;
    private CarBuilder instance;
    EnumSingletonCreator(){
        instance = new CarBuilder();
    }

    public CarBuilder getInstance() {
        return instance;
    }
}
