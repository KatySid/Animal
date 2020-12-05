    public class Cat extends Animal{
        private static int catCount;

        public Cat (String name){
            super (name);
            distanceRun = 200;
            distanceSwim = 0;
            catCount++;
        }

        @Override
        public void swim(int distance) {
            System.out.println(name + " не умеет плавать");
        }

        @Override
        public void setDistanceSwim(int distanceSwim) {
            System.out.println(name + " не умеет плавать");
        }

        public static int getCatCount() {
            return catCount;
        }
    }

