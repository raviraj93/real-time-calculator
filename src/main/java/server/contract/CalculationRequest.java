package server.contract;

public class CalculationRequest {
    private String name;

    public CalculationRequest() {
    }

    public CalculationRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
