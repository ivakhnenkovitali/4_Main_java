package model;

public class Animal {
    public String nickname;
    private double weight;

 // котструктор по умолчанию
    public Animal() {
        nickname = "noname";
        weight = 0.1;

    }



    /// котструктор - метод вызывается автоматически при создании объекта  с параметрами кончтруктор-
    // цель конструктора сразу при  создания объета придать в переменную ссылку person1
    public Animal(String nickname, double weight) {
        this.nickname = nickname;
        if (weight > 0) {
            this.weight = weight;

        }
    }


    ///метод доступа сеетер --- принимаем значение если оно положительное то присваиваем его в значение веса животного
    //когда запускается метод унего есть не явный оргумет
    // this- ссыклка на объет для которого работает метод
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;


        }
    }

    /// метод доступа гееетер
    public double getWeight() {
        return weight;

    }

    public void info() {
        System.out.println("кличка: " + nickname + ", вес: " + weight);


    }

}
