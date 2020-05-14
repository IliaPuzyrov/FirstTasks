package interfacesAndAbstractClasses.Mobile;

public abstract class sistemsMobile implements Mobile {
    @Override
    public void settings() {
        System.out.println("настраиваются самостоятельно");
    }

    @Override
    public void games() {
        System.out.println("баскетбол");
    }

    @Override
    public void mesengers() {
        System.out.println("Vk,instagram");

    }
}
