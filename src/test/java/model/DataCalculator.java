package model;

import java.util.Objects;

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
    public String toString() {
        return "DataCalculator{" +
                "numberInstancesInput='" + numberInstancesInput + '\'' +
                ", whatInstancesForInput='" + whatInstancesForInput + '\'' +
                ", operatingSystemInput='" + operatingSystemInput + '\'' +
                ", machineClassInput='" + machineClassInput + '\'' +
                ", seriesInput='" + seriesInput + '\'' +
                ", machineTypeInput='" + machineTypeInput + '\'' +
                ", numberGPUsInput='" + numberGPUsInput + '\'' +
                ", typeGPUsInput='" + typeGPUsInput + '\'' +
                ", localSSDInput='" + localSSDInput + '\'' +
                ", datacenterLocationInput='" + datacenterLocationInput + '\'' +
                ", commitedUsageInput='" + commitedUsageInput + '\'' +
                ", machineClassExpected='" + machineClassExpected + '\'' +
                ", machineTypeExpected='" + machineTypeExpected + '\'' +
                ", localSsdExpected='" + localSsdExpected + '\'' +
                ", datacenterLocationExpected='" + datacenterLocationExpected + '\'' +
                ", commitedUsageExpected='" + commitedUsageExpected + '\'' +
                ", totalCostExpected='" + totalCostExpected + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataCalculator that = (DataCalculator) o;
        return Objects.equals(numberInstancesInput, that.numberInstancesInput) && Objects.equals(whatInstancesForInput, that.whatInstancesForInput) && Objects.equals(operatingSystemInput, that.operatingSystemInput) && Objects.equals(machineClassInput, that.machineClassInput) && Objects.equals(seriesInput, that.seriesInput) && Objects.equals(machineTypeInput, that.machineTypeInput) && Objects.equals(numberGPUsInput, that.numberGPUsInput) && Objects.equals(typeGPUsInput, that.typeGPUsInput) && Objects.equals(localSSDInput, that.localSSDInput) && Objects.equals(datacenterLocationInput, that.datacenterLocationInput) && Objects.equals(commitedUsageInput, that.commitedUsageInput) && Objects.equals(machineClassExpected, that.machineClassExpected) && Objects.equals(machineTypeExpected, that.machineTypeExpected) && Objects.equals(localSsdExpected, that.localSsdExpected) && Objects.equals(datacenterLocationExpected, that.datacenterLocationExpected) && Objects.equals(commitedUsageExpected, that.commitedUsageExpected) && Objects.equals(totalCostExpected, that.totalCostExpected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberInstancesInput, whatInstancesForInput, operatingSystemInput, machineClassInput, seriesInput, machineTypeInput, numberGPUsInput, typeGPUsInput, localSSDInput, datacenterLocationInput, commitedUsageInput, machineClassExpected, machineTypeExpected, localSsdExpected, datacenterLocationExpected, commitedUsageExpected, totalCostExpected);
    }
}
