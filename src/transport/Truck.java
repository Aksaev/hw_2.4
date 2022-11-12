package transport;

import java.util.concurrent.ThreadLocalRandom;

// Класс Грузовые автомобили
public class Truck extends Transport implements Competing {

    public Truck(String brand,
               String model,
               float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Грузовой автомобиль %s %s начал движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void stopMovement() {
        System.out.printf("Грузовой автомобиль %s %s закончил движение.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовой автомобиль %s %s выполняет пит-стоп.\n", this.getBrand(), this.getModel());
    }

    @Override
    public void getBestLapTime() {
        System.out.printf("Грузовой автомобиль %s %s имеет лучшее время круга %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 100));
    }

    @Override
    public void getMaxSpeed() {
        System.out.printf("Грузовой автомобиль %s %s имеет максимальную скорость %d.\n",
                this.getBrand(),
                this.getModel(),
                ThreadLocalRandom.current().nextInt(1, 180));
    }
}
