public class Animal {
    // properties here
    public String name;
    public String favoriteFood;
    static int population = 0;


    public Animal(String n, String ff) {
        name = n;
        favoriteFood=ff;
        population++;
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours.");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food.equals(favoriteFood)) {
            System.out.println("YUM! " + name + " wants more " + food );
        } else {
            this.sleep();
        }
    }
}


