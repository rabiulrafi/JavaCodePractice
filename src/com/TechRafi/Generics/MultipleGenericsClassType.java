package com.TechRafi.Generics;

public class MultipleGenericsClassType<T,U> {
    T obj1;
    U obj2;

    public MultipleGenericsClassType(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public U getObj2() {
        return obj2;
    }
}

class Test{
    public static void main(String[] args) {
        MultipleGenericsClassType<Integer,String> obj= new MultipleGenericsClassType<Integer,String>(3,"Rafi");
        System.out.println(obj.getObj1());
        System.out.println(obj.getObj2());
    }
}
