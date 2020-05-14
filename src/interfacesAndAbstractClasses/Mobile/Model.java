package interfacesAndAbstractClasses.Mobile;

public class Model extends sistemsMobile {
    private String internet;
    private int calls;

    @Override
    public void settings() {
        super.settings();
        System.out.println("настраиваются самостоятельно");
    }

    @Override
    public void games() {
        super.games();
        System.out.println("баскетбол");
    }

    @Override
    public void mesengers() {
        super.mesengers();
        System.out.println("Vk,instagram");
    }

    public Model(String internet, int calls) {
        this.internet = internet;
        this.calls = calls;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getCalls() {
        return calls;
    }

    public void setCalls(int calls) {
        this.calls = calls;
    }

    @Override
    public String toString() {
        return "Model{" +
                "internet='" + internet + '\'' +
                ", calls=" + calls +
                '}';
    }
}
