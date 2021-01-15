package server.contract;

public class CalculationResponse {
    private String content;

    public CalculationResponse() {
    }

    public CalculationResponse(String result) {
        this.content = result;
    }

    public String getContent() {
        return content;
    }
}
