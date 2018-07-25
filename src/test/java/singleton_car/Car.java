package singleton_car;

public class Car {

    //mutex object is used to achieve synchronization
    private static final Object lock = new Object();

    /**
     * By using the volatile keyword we prevent the write of a volatile
     * to be reordered with respect to any previous read or write and a
     * read of a volatile to be reordered with respect to any following read or write.
     */
    private static volatile Car car;

    private Car() {}

    public static Car getCar() {
        if (car == null) {
            synchronized (lock) {
                if (car == null) {
                    car = new Car();
                }
            }
        }
        return car;
    }

    @Override
    public String toString() {
        return "done";
    }

    public static void main(String[] args) {
        Car testCar = Car.getCar();
        System.out.println(testCar);
    }
}
