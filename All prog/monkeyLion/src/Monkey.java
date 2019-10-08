public class Monkey {
    private Lion b;
    public Monkey() {
    }
    public Monkey(Lion b) {
        this.b = b; }
    public Lion method1() {
        return b;
    }
    public String method2(int a, int b) {
        String s = "";
        for (int i = 0; i < b; i++) {
            s += a;
        }
        return s;
    }
}
