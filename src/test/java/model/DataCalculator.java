package model;

public class DataCalculator {
    private String numberInstancesInput;
    private String whatInstancesForInput;
    private String operatingSystemInput;
    private String machineClassInput;
    private String seriesInput;
    private String machineTypeInput;
    private String numberGPUsInput;
    private String typeGPUsInput;
    private String localSSDInput;
    private String datacenterLocationInput;
    private String commitedUsageInput;
    private String machineClassExpected;
    private String machineTypeExpected;
    private String localSsdExpected;
    private String datacenterLocationExpected;
    private String commitedUsageExpected;
    private String totalCostExpected;

    public DataCalculator(String numberInstancesInput, String whatInstancesForInput, String operatingSystemInput, String machineClassInput, String seriesInput, String machineTypeInput, String numberGPUsInput, String typeGPUsInput, String localSSDInput, String datacenterLocationInput, String commitedUsageInput, String machineClassExpected, String machineTypeExpected, String localSsdExpected, String datacenterLocationExpected, String commitedUsageExpected, String totalCostExpected) {
        this.numberInstancesInput = numberInstancesInput;
        this.whatInstancesForInput = whatInstancesForInput;
        this.operatingSystemInput = operatingSystemInput;
        this.machineClassInput = machineClassInput;
        this.seriesInput = seriesInput;
        this.machineTypeInput = machineTypeInput;
        this.numberGPUsInput = numberGPUsInput;
        this.typeGPUsInput = typeGPUsInput;
        this.localSSDInput = localSSDInput;
        this.datacenterLocationInput = datacenterLocationInput;
        this.commitedUsageInput = commitedUsageInput;
        this.machineClassExpected = machineClassExpected;
        this.machineTypeExpected = machineTypeExpected;
        this.localSsdExpected = localSsdExpected;
        this.datacenterLocationExpected = datacenterLocationExpected;
        this.commitedUsageExpected = commitedUsageExpected;
        this.totalCostExpected = totalCostExpected;
    }

    public String getNumberInstancesInput() {
        return numberInstancesInput;
    }

    public String getWhatInstancesForInput() {
        return whatInstancesForInput;
    }

    public String getOperatingSystemInput() {
        return operatingSystemInput;
    }

    public String getMachineClassInput() {
        return machineClassInput;
    }

    public String getSeriesInput() {
        return seriesInput;
    }

    public String getMachineTypeInput() {
        return machineTypeInput;
    }

    public String getNumberGPUsInput() {
        return numberGPUsInput;
    }

    public String getTypeGPUsInput() {
        return typeGPUsInput;
    }

    public String getLocalSsdInput() {
        return localSSDInput;
    }

    public String getDatacenterLocationInput() {
        return datacenterLocationInput;
    }

    public String getCommitedUsageInput() {
        return commitedUsageInput;
    }

    public String getMachineClassExpected() {
        return machineClassExpected;
    }

    public String getMachineTypeExpected() {
        return machineTypeExpected;
    }

    public String getLocalSsdExpected() {
        return localSsdExpected;
    }

    public String getDatacenterLocationExpected() {
        return datacenterLocationExpected;
    }

    public String getCommitedUsageExpected() {
        return commitedUsageExpected;
    }

    public String getTotalCostExpected() {
        return totalCostExpected;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
