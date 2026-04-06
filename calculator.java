class cal {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class calculator {
    public static void main(String[] args) {
        cal c = new cal();  

        System.out.println(c.add(5, 10));
        System.out.println(c.add(5, 10, 15));
    }
}