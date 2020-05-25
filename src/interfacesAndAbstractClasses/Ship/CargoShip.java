package interfacesAndAbstractClasses.Ship;

public abstract class CargoShip implements Ship{
    @Override
    public void sail() {
        System.out.println("буль-буль-буль");
    }

    @Override
    public void turn() {
        System.out.println("право руля!");

    }

    @Override
    public void motorDrive() {
        System.out.println("р-р-р-р-р");

    }
    public void shipLoading(){
        System.out.println("поторапливайтесь ребята!");
    }
}
