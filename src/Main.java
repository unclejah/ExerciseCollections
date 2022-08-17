import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Car> carsMap = new HashMap<>();
        String cacheCarUuid="";
        for(int i =0;i<100;i++){
            Car car = new Car(i);
            carsMap.put(car.uuid, car);
            if(i ==27){
                cacheCarUuid = car.uuid;
            }
        }
        Car cachedCar = carsMap.get(cacheCarUuid);
        System.out.println(cachedCar.id +" "+ cachedCar.uuid);
        System.out.println("====================================================");
        //====================================================
//        Integer id = 0;
//        TreeMap<Car, Car> carTreeMap = new TreeMap<>();
//        for(int i =0;i<100;i++){
//            Car car = new Car(i);
//            carTreeMap.put(car, car);
//        }
//
//        System.out.println(carTreeMap.entrySet());
//        carTreeMap.forEach((key, value) ->{
//            System.out.println(value.id);
//        });
        System.out.println("====================================================");
        //====================================================
        Integer id = 0;
        TreeMap<Car, Car> carTreeMap = new TreeMap<>(new CarComparator());
        for(int i =0;i<100;i++){
            Car car = new Car(i);
            carTreeMap.put(car, car);
        }

        System.out.println(carTreeMap.entrySet());
        carTreeMap.forEach((key, value) ->{
            System.out.println(value.id);
        });
        System.out.println("====================================================");
        //====================================================

        File file = new File("WarAndPeace.txt");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parse(file);
        lines.forEach((String line) ->{
            System.out.println(line);
        });
        System.out.println("====================================================");
        //====================================================
        int count = parser.parseCount(file);
        System.out.println("Количество слов Страдание = "+count);
        System.out.println("====================================================");
        //====================================================
        int countScanner = parser.parseCountScaner(file);
        System.out.println("Количество слов Страдание через Scanner= "+count);
        System.out.println("====================================================");
        //====================================================
        for(int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
