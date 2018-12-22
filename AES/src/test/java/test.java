public class test {
    public static void main(String[] args) {
        //StringBuilder a = new StringBuilder("A");
        //StringBuilder b = new StringBuilder("B");
        //operate(a,b);
        //System.out.println(a+" :"+ b);

        Integer k = new Integer(9);
        Integer p = new Integer(9);
        System.out.println(k.equals(p));
        System.out.println(k.equals(new Integer(9)));


    }

    public static void operate(StringBuilder x, StringBuilder y) {
        x.append(y);
        y=x;
    }
}
