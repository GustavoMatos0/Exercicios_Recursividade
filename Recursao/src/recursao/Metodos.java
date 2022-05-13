package recursao;

public class Metodos {

    public int fatorial(int n) { //ex01
        int f = 1;
        while (n >= 1) {
            f *= n;
            n--;
        }
        return f;
    }

    public int ex02(int x) {  //ex02
        if (x == 0) {
            return 2;
        } else {
            return 2 * ex02(x - 1) - 4;
        }
    }

    public int fib(int n) {   //ex03
        if (n >= 0) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        } else {
            return -1;
        }
    }
    
    public int ex04(int n){    //ex04
        if(n == 1)return 1;
        else{
            return (((2 * n*n) + 2) * n) + 8;
        }
    }
}
