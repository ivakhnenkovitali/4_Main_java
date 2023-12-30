import model.Animal;
import model.Person;
import model.Worker;

public class Main {
    public static void main(String[] args) {

        new Person(); /// создание объета класса Person. однако при таком создании объета мы
        /// в дальный момент не омжем с ним взаимодейсвтовать так как нет ссылки указывающей на этот объект


        /// создание объекта и запись его адреса в переменнню
        Person person1 = new Person();
        person1.name = " Igor";
        person1.age = 35;
        System.out.println("имя: "+person1.name + " , возраст: " + person1.age);

        Animal animal1 = new Animal();
        animal1.nickname = "murzik";
        animal1.setWeight(5.5);
        System.out.println("вес: " + animal1.getWeight());

        animal1.info();

        Animal animal2 = new Animal();
        animal2.info();
        Animal animal3 = new Animal("kesha", 0.5);
        animal3.info();
        System.out.println("-----------------------------");
        Worker worker1 = new Worker();
        worker1.info();
        worker1.setName("misha");
        worker1.setBones(500);
        worker1.info();
        Worker worker2 = new Worker("Grisha" , 1500, 700);
        worker2.info();

    }
}
