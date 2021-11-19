public class Main {
    public static void main(String[] args) {
        Passenger passengerCar = new Passenger("KIA",210,210,3100,4,15,"Хечбек",6);
        passengerCar.Description();
        passengerCar.Counting(6);
        System.out.println();
        Cargo cargoCar = new Cargo("Маз",320,170,5800,8,17,4500);
        cargoCar.Description();
        cargoCar.Load();
        System.out.println();
        Civil civilAir = new Civil("WWW",540,810,4900,15,48,45,true);
        civilAir.Description();
        civilAir.loadPassengers();
        System.out.println();
        War warAir = new War("ИС",700,970,5050,13,34,true,6);
        warAir.Description();
        warAir.Shoot();
        warAir.Ejection();
    }
}
class Transport {
    String brand;
    double power;
    double maxSpeed;
    double  weight;

    public Transport(String brand, int power, int maxSpeed, int weight) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.power = power;
    }



    public double PowerCalc () {
        return power * 0.74;
    }
}
class Ground extends Transport {
    int countWheels;
    int fuelCons;
    public Ground(String brand, int power, int maxSpeed, int weight, int countWheels, int fuelCons) {
        super(brand, power, maxSpeed, weight);
        this.countWheels = countWheels;
        this.fuelCons = fuelCons;
    }
}
class Passenger extends Ground {
    String body;
    int countPassengers;
    double time;

    private double Fuel () {
        return fuelCons * time;
    }

    public void Counting(double time) {
        double km = time * maxSpeed;
        double Fuel = time * fuelCons;
        System.out.println("За время " + time + "ч" + ", автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + "км/ч" + " проедет " + km + " и израсходует " + Fuel + " литров топлива");
    }

    public Passenger(String brand, int power, int maxSpeed, int weight, int countWheels, int fuelCons, String body, int countPassengers) {
        super(brand, power, maxSpeed, weight, countWheels, fuelCons);
        this.body = body;
        this.countPassengers = countPassengers;
    }

    public  void Description () {
        System.out.println("Бренд машины : " + brand + "\n Мощность : " + power + " лошадиных сил" + "\n Мощность в кв : " + PowerCalc() + "\n Максимальная скорость : " + maxSpeed + "км/ч" + "\n Масса автомобиля : " + weight + "кг" + "\n Тип кузова : " + body + "\n Количество колёс : " + countWheels + "\n Расход топлива : " + fuelCons + "л/100км" + "\n Количество пассажиров : " + countPassengers);
    }

}
class Cargo extends Ground {
    int carryingCapacity;

    public Cargo(String brand, int power, int maxSpeed, int weight, int countWheels, int fuelCons, int carryingCapacity) {
        super(brand, power, maxSpeed, weight, countWheels, fuelCons);
        this.carryingCapacity = carryingCapacity;
    }

    public void Load () {
        if (carryingCapacity >= 4500) {
            System.out.println("Грузовик загружен!");
        }
        else {
            System.out.println("Вам нужен грузовик побольше!");
        }
    }

    public void Description () {
        System.out.println("Бренд машины : " + brand + "\n Мощность : " + power + " лошадиных сил" + "\n Мощность в кв : " + PowerCalc() + "\n Максимальная скорость : " + maxSpeed + "км/ч" + "\n Масса : " + weight + "кг" + "\n Количество колёс : " + countWheels + "\n Расход топлива : " + fuelCons + "л/100км" + "\n Грузоподъёмность : " + carryingCapacity + "кг");
    }
}
class AirTransport extends Transport {
    int wingspan;
    int minRunwayLength;

    public AirTransport(String brand, int power, int maxSpeed, int weight, int wingspan, int minRunwayLength) {
        super(brand, power, maxSpeed, weight);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }
}
class Civil extends AirTransport {
    int counterPassengers;
    boolean businessClass;

    public Civil(String brand, int power, int maxSpeed, int weight, int wingspan, int minRunwayLength,int counterPassengers, boolean businessClass) {
        super(brand, power, maxSpeed, weight, wingspan, minRunwayLength);
        this.counterPassengers = counterPassengers;
        this.businessClass = businessClass;
    }
    public void loadPassengers() {
        if (counterPassengers >= 45) {
            System.out.println("Самолёт загружен!");
        }
        else {
            System.out.println("Вам нужен самолёт побольше!");
        }
    }
    public void Description () {
        System.out.println("Бренд : " + brand + "\n Мощность : " + power + " лошадиных сил" + "\n Мощность в кв : " + PowerCalc() + "\n Масса : " + weight + "кг" + "\n Размах крыльев : " + wingspan + "\n Кол-во пассажиров : " + counterPassengers + "м" + "\n Минимальная длинна полосы : " + minRunwayLength + "м" + "\n Наличиние бизнес-класса : " + businessClass);
    }
}
class War extends AirTransport {
    boolean systemEjection;
    int counterRocket;

    public War(String brand, int power, int maxSpeed, int weight, int wingspan, int minRunwayLength,boolean systemEjection, int counterRocket) {
        super(brand, power, maxSpeed, weight, wingspan, minRunwayLength);
        this.systemEjection = systemEjection;
        this.counterRocket = counterRocket;
    }

    public void Ejection () {
        if (systemEjection == true) {
            System.out.println("Катапультирование прошло успешно!");
        }
        else {
            System.out.println("У вас нет такой системы!");
        }
    }

    public void Shoot () {
        if (counterRocket > 0) {
            System.out.println("Ракета пошла..");
        }
        else {
            System.out.println("Боеприпасы отсутствуют!");
        }
    }

    public void Description () {
        System.out.println("Бренд : " + brand + "\n Мощность : " + power + " лошадиных сил" + "\n Мощность в кв : " + PowerCalc() + "\n Максимальная скорость : " + maxSpeed + "км/ч" + "\n Размах крыльев : " + wingspan + "м" + "\n Минимальная длинна полосы : " + minRunwayLength + "м" + "\n Наличие системы катапультирования : " + systemEjection + "\n Кол-во ракет : " + counterRocket + " штук");
    }
}

