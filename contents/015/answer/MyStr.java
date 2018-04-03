public class MyStr {
    private String str = null;

    public String getStr() { return str; }

    public MyStr(String str) {
        this.str = str;
    }

    public MyStr() {
        this("no name");
    }
}
