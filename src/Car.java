import java.util.UUID;

public class Car {
    int id;
    int numberOfWheels;
    String uuid = UUID.randomUUID().toString();

    public Car(int id){
        this.id = id;
    }

//    public static int compare(int id1, int id2) {
//
//        return (id1 < id2) ? -1 : ((id1 == id2) ? 0 : 1);
//    }
//
//    @Override
//    public int compareTo(Car car) {
//        return compare(this.id, car.id);
//    }
}
