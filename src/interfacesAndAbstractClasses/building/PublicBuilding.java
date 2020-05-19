package interfacesAndAbstractClasses.building;

public abstract class PublicBuilding implements Building {
    @Override
    public void build() {
        System.out.println("bom-bom");

    }

    @Override
    public void shatter() {
        System.out.println("kr-kr");
    }

    public void throuthRepair() {
        System.out.println("bam-bam");
    }

}
