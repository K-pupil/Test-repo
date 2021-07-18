package com.a_level;

public class Fruit implements Comparable{
    private String name;
    private int price;

    Fruit(String name, int price){
        this.name=name;
        this.price=price;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
//переопределяем, чтоб сравнивал по нейму

    public boolean equals(Fruit fruit){
                if(name.equalsIgnoreCase(fruit.name))
            return true;
        return false;
    }
    //переопределяем метод генерации хэш-кода
    @Override
    public int hashCode(){
        if (this.name.length()%2==0)
            return 100;
        else
            return 200;
    }

    @Override
    public int compareTo(Object o) {
               return 0;
    }

}