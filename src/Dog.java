    public class Dog extends Animal {
        private static int dogCount;

        public Dog(String name) {
            super(name);
            distanceSwim = 10;
            distanceRun = 500;
            dogCount++;
        }

        public static int getDogCount() {
            return dogCount;
        }
    }


