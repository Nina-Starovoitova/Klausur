import java.util.Objects;

public class TestNina {

    private TestNina testNina;
    private double testFloat = 0.465544;
    private Integer testInt = null;
    private String testString = null;
    public String testPubString = null;
    public static String testStatString = null;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestNina)) return false;
        TestNina nina = (TestNina) o;
        return Double.compare(getTestFloat(), nina.getTestFloat()) == 0 && Objects.equals(getTestNina(), nina.getTestNina()) && Objects.equals(getTestInt(), nina.getTestInt()) && Objects.equals(getTestString(), nina.getTestString()) && Objects.equals(getTestPubString(), nina.getTestPubString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTestNina(), getTestFloat(), getTestInt(), getTestString(), getTestPubString());
    }

    public TestNina() {
    }

    public TestNina getTestNina() {
        return testNina;
    }

    public double getTestFloat() {
        return testFloat;
    }

    public Integer getTestInt() {
        return testInt;
    }

    public String getTestString() {
        return testString;
    }

    public String getTestPubString() {
        return testPubString;
    }

    public static String getTestStatString() {
        return testStatString;
    }

    public TestNina(String s) {
        this.testString = s;
    }

    public TestNina(int i) {

        int ires = 23454;

        this.testInt = i;
        i = 34 + i;

    }

    public TestNina(double f) {
        f = 456 + f;
        this.testFloat = f;
    }

    public TestNina(TestNina testNina) {
        this.testNina = testNina;

    }

    public void testVar(String testr) {
        String secTest = "testr";
        this.testString = testr;
        double dfgd = this.testFloat;
        String testry = this.testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public static void main(String[] args) {

        String s1 = "vasya";
        String s2 = "Nina ".concat(s1);
        int a = 2;
        int d = 4;
        int c = a++ + ++d - --a;
        System.out.println(c);


        boolean b = s2 == "Nina vasya";
        System.out.println(b);
        System.out.println(s2);

        TestNina test1 = new TestNina();
        int h = 4;
        TestNina nina = new TestNina("Vasiliy");
        System.out.println(nina.getTestString());

        TestNina sonya = new TestNina(nina);
        sonya.getTestNina().setTestString("Kolyanich");
        System.out.println(sonya.getTestNina().getTestString());

        TestNina test3 = new TestNina("rest");
        TestNina test5 = new TestNina(12);
        TestNina test6 = new TestNina(12);
        TestNina test7 = new TestNina("ewfge");
        new TestNina().testPubString = "fsdsgdr";
    }
}


