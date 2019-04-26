package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        public void run(){}
        public void swim(){}
    }

    public class Duck implements CanFly, CanRun, CanSwim{
        public void fly(){}
        public void run(){}
        public void swim(){}

    }

    public class Penguin implements CanSwim, CanRun{
        public void swim(){}
        public void run(){}
    }

    public class Airplane implements CanRun, CanFly {
        public void run(){}
        public void fly(){}
    }
}
