public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("KIA", 200, 30000);
        Car car2 = new Car("BMW", 210, 40000);
        Car car3 = new Car("MAZDA", 150, 15000);
        try {
            car1.startCar();
        } catch (StartErrorException e) {
            e.printStackTrace();
        }
        try {
            car2.startCar();
        } catch (StartErrorException e) {
            e.printStackTrace();
        }
        try {
            car3.startCar();
        } catch (StartErrorException e) {
            e.printStackTrace();
        }
    }
}

class Car {
    private String Mark;
    private int Speed;
    private int Price;

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public Car(String mark, int speed, int price) {
        this.Mark = mark;
        this.Speed = speed;
        this.Price = price;
    }

    public Car() {

    }

    public void startCar() throws StartErrorException {
        int NumRandom = (int) (Math.random() * 20);

        if (NumRandom % 2 == 0) {
            throw new StartErrorException("Машина марки " + Mark + " не завелась!");
        }
        else {
            System.out.println("Машина марки " + Mark + " успешно завелась!");
        }
    }
}

class StartErrorException extends Exception {
    public StartErrorException(String message) {
        super(message);
    }
}