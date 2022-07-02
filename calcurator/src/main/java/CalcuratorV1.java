public class CalcuratorV1 {
    public Integer calcurate(String op, Integer a, Integer b) {
        Integer ret = 0;
        if (op.equals("+")) {
            return a+b;
        }
        else if (op.equals("-")) {
            return a-b;
        }
        else if (op.equals("*")) {
            return a*b;
        }
        else if (op.equals("/")) {
            return a/b;
        }
        return ret;
    }
}
