public class MethodHeader {
    public static void main(String[] args) {
        MethodHeader obj = new MethodHeader();
        int i = obj.m(1, 1);
        System.out.println(i);
    }

    int m(int a, int b) {
        return a + b;
    }
}
