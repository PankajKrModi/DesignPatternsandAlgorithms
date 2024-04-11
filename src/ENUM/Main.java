package ENUM;
//This is example of decision tree ,alternative of multiple if else
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.calculate(Operator.ADD,3,4));
        System.out.println(Main.calculate(Operator.MULTIPLY,3,4));
    }

    public static int calculate(Operator operator,int a, int b){
        return operator.apply(a,b);
    }
}

enum Operator{
    ADD {
        public int apply(int a, int b){
            return a+b;
        }
    },
    SUBTRACT{
        public int apply(int a, int b){
            return a-b;
        }
    },
    MULTIPLY{
        public int apply(int a, int b){
            return a*b;
        }
    };

    public abstract int apply(int a,int b);
}

