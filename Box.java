public class Box {

    String name;
    String name1;
    String name2;
    int sm;
    int sm3;



        public Box(String light, String width, String depth, int sm) {
            this.sm = sm;
            this.name = light;
            this.name1 = width;
            this.name2 = depth;

            System.out.println("Light: " + light);
            System.out.println("Sm = " + sm);
            System.out.println("Width: " + width);
            System.out.println("Depth: " + depth);
        }
    public Box(String light, String width, int sm3) {
        this.sm3 = sm3;
        this.name = light;
        this.name1 = width;

        System.out.println("Light: " + light);
        System.out.println("Sm3 = " + sm3);
        System.out.println("Width: " + width);

    }

    public Box(String light,  int sm3) {
        this.sm3 = sm3;
        this.name = light;


        System.out.println("Light: " + light);
        System.out.println("Sm3 = " + sm3);


    }

    public Box() {
    }
}



