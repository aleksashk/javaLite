package com.gmail.aleksandrphilimonov.lesson2.classwork;

public class MainApp {
    static class Human {
        private Transport currentTransport;

        public void stop() {
            if (currentTransport != null) {
                currentTransport.stop();
                currentTransport = null;
            } else {
                System.out.println("I'm not driving.");
            }
        }

        public void skateBoardParkActions() {
            if (!(currentTransport instanceof Skateboard)) {
                System.out.println("wrong transport.");
            } else {
                Skateboard skateboard = (Skateboard) currentTransport;
                skateboard.makeFint();
            }
        }

        public void drive(Transport transport) {
            transport.start();
            this.currentTransport = transport;
        }
    }

    static class Car implements Transport {
        @Override
        public void start() {
            System.out.println("The car is run.");
        }

        @Override
        public void stop() {
            System.out.println("The car is stop.");
        }
    }

    static class Moto implements Transport {
        @Override
        public void start() {
            System.out.println("The moto is run.");
        }

        @Override
        public void stop() {
            System.out.println("The moto is stop.");
        }
    }

    static class Skateboard implements Transport {
        @Override
        public void start() {
            System.out.println("The skateboard is run.");
        }

        @Override
        public void stop() {
            System.out.println("The skateboard is stop.");
        }

        public void makeFint() {
            System.out.println("The skateboard makes fint.");
        }
    }

    static class Bicycle implements Transport {
        @Override
        public void start() {
            System.out.println("Bicycle car is run.");
        }

        @Override
        public void stop() {
            System.out.println("Bicycle car is stop.");
        }
    }

    public static void main(String[] args) {
        Moto moto = new Moto();
        Skateboard skateboard = new Skateboard();
        Human human = new Human();
        human.stop();
        human.drive(moto);
        human.stop();
        human.drive(skateboard);

        human.skateBoardParkActions();
    }
}