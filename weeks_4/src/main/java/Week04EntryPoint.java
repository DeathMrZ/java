public class Week04EntryPoint {
    public static void main(String[] args) {
        GetInstanceFromEnumSingleton();
        GetInstanceWithDoubleCheckLocking();
    }

    /**
     * 通过枚举创建一个单例类
     */
    private static void GetInstanceFromEnumSingleton()
    {
        EnumSingletonCreator.INSTANCE.getInstance().GetCars("001", "凯迪拉克",";client:枚举单例");
    }

    /**
     * 通过Double check locking 创建一个单例对象
     */
    private static void GetInstanceWithDoubleCheckLocking()
    {
        DoubleCheckLockingInstanceCreator client = new DoubleCheckLockingInstanceCreator();
        client.getInstance().GetCars("002","劳斯莱斯",";client:双检锁");
    }

}
