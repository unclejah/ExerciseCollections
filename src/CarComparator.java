import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return (car1.id < car2.id) ? -1 : ((car1.id == car2.id) ? 0 : 1);
    }
}
