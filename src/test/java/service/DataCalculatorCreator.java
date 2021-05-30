package service;

import model.DataCalculator;

public class DataCalculatorCreator {
    public static final String NUMBER_INSTANCES = "calculator.number_instances.input";
    public static final String WHAT_INSTANCES_FOR = "calculator.what_instances_for.input";
    public static final String OPERATING_SYSTEM = "calculator.operating_system.input";
    public static final String MACHINE_CLASS = "calculator.machine_class.input";
    public static final String SERIES = "calculator.series.input";
    public static final String MACHINE_TYPE = "calculator.machine_type.input";
    public static final String NUMBER_GPUS = "calculator.numberGPUs.input";
    public static final String TYPE_GPUS = "calculator.typeGPUs.input";
    public static final String LOCAL_SSD = "calculator.localSSD.input";
    public static final String DATACENTER_LOCATION = "calculator.datacenter_location.input";
    public static final String COMMITED_USAGE = "calculator.commited_usage.input";
    public static final String MACHINE_CLASS_EXPECTED= "calculator.machine_class.expected";
    public static final String MACHINE_TYPE_EXPECTED = "calculator.machine_type.expected";
    public static final String LOCAL_SSD_EXPECTED = "calculator.localSSD.expected";
    public static final String DATACENTER_LOCATION_EXPECTED = "calculator.datacenter_location.expected";
    public static final String COMMITED_USAGE_EXPECTED = "calculator.commited_usage.expected";
    public static final String TOTAL_COST_EXPECTED = "calculator.total_cost.expected";

    public static DataCalculator getCalculatorParameters() {
        return new DataCalculator(TestDataReader.getTestData(NUMBER_INSTANCES),
                TestDataReader.getTestData(WHAT_INSTANCES_FOR),
                TestDataReader.getTestData(OPERATING_SYSTEM),
                TestDataReader.getTestData(MACHINE_CLASS),
                TestDataReader.getTestData(SERIES),
                TestDataReader.getTestData(MACHINE_TYPE),
                TestDataReader.getTestData(NUMBER_GPUS),
                TestDataReader.getTestData(TYPE_GPUS),
                TestDataReader.getTestData(LOCAL_SSD),
                TestDataReader.getTestData(DATACENTER_LOCATION),
                TestDataReader.getTestData(COMMITED_USAGE),
                TestDataReader.getTestData(MACHINE_CLASS_EXPECTED),
                TestDataReader.getTestData(MACHINE_TYPE_EXPECTED),
                TestDataReader.getTestData(LOCAL_SSD_EXPECTED),
                TestDataReader.getTestData(DATACENTER_LOCATION_EXPECTED),
                TestDataReader.getTestData(COMMITED_USAGE_EXPECTED),
                TestDataReader.getTestData(TOTAL_COST_EXPECTED));
    }
}
