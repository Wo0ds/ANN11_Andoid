import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TComp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Computer comp = new Computer();
        comp.description();
        System.out.println("Введите число дл включения компьютера : ");
        comp.turnOn();
        comp.turnOff();
        comp.turnOn();
        comp.turnOff();
        comp.turnOn();
        comp.turnOff();
        comp.turnOn();
        comp.turnOff();
    }
}

class Computer {
    String processor = "i9-9900k";
    String ram = "A-DATA";
    String hdd = "Baracooda";
    int resource = 3;

    public void description() {
        System.out.println("Процессор: " + processor + '\n' + "Оперативная память: " + ram + '\n' + "Жесткий диск: " + hdd + '\n' + "Ресурс полных циклов работы: " +  resource);
    }

    public void turnOn() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int turnOn = Integer.parseInt(reader.readLine());
        double onOrOff = Math.random();
        double onOrOff2 = Math.round(onOrOff);


        if (turnOn == onOrOff2 && resource > 0) {
            System.out.println("Компьютер включен!");
            resource -= 1;
        }
        else if (resource == 0) {
            System.out.println("Ему конец!");
        }
        else {
            System.out.println("Компьютер сгорел!");
            resource = 0;
        }
    }

    public void  turnOff() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int turnOn = Integer.parseInt(reader.readLine());
        double onOrOff = Math.random();
        double onOrOff2 = Math.round(onOrOff);

        if (turnOn == onOrOff2 && resource > 0) {
            System.out.println("Компьютер выключен!");
            resource -= 1;
        }
        else if (resource == 0) {
            System.out.println("Ему конец!");
        }
        else {
            System.out.println("Компьютер сгорел!");
            resource = 0;
        }
    }
}
