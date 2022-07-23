import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private final List<Car> carsList;
    
    public RentCompany() {
        carsList = new ArrayList<>();
    }
    
    public static RentCompany create() {
        return new RentCompany();
    }
    
    public void addCar(Car car) {
        carsList.add(car);
    }
    
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        for (Car car : carsList) {
            report.append(car.getName()).append(" : ")
                    .append((int) car.getChargeQuantity())
                    .append("리터")
                    .append(Car.NEWLINE);
        }
        return report.toString();
    }
}
