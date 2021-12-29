package day3;

public class FunctionConcept {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result1 = addition(a, b);

        int d = 5;
        int e = 50;
        int result2 =  addition(d, e);

        int g = 2;
        int h = 6;
        int result3 = addition(g,h);
    }

    public static int addition(int x, int y){
        int c = x + y;
        System.out.println(c);
        return  c;
    }
}
