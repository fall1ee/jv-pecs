package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private String excavatorName;
    private int yearOfInstallation;

    public Excavator() {
    }

    public String getExcavatorName() {
        return excavatorName;
    }

    public void setExcavatorName(String excavatorName) {
        this.excavatorName = excavatorName;
    }

    public int getYearOfInstallation() {
        return yearOfInstallation;
    }

    public void setYearOfInstallation(int yearOfInstallation) {
        this.yearOfInstallation = yearOfInstallation;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
