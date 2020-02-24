public class Bee extends Animal {
    public Bee(String n) {
        super(n, "pollen");
    }
    public void eat(String food) {

        if (food.equals(favoriteFood)) {
            System.out.println(name + " eats " + food);
            System.out.println("YUM!" + name + " wants more " + food);
            this.sleep();
        } else {
                System.out.println("YUCK!" + name + " will not eat " + food);

            }
        }

    public void sleep() {
        System.out.println(name + " never sleeps.");
    }


}

