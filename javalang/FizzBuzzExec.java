import java.util.stream.IntStream;

public class FizzBuzzExec {
    public static void main(String[] args){
        String message = "FizzBuzz Start";
        System.out.println(message);

        // 未初期化はJavaでもエラーだった
        String ret = "null";
        // inはないのでIntStreamと拡張Forで
        for(int i : IntStream.range(1, 100).toArray()){
            System.out.println(ret);
            ret = FizzBuzzExec.fizzbuzz(i);
        }

    }
    public static String fizzbuzz(int value) {
        // ここは流石にもっときれいに書けるはずだが、ぱっと思いついたら
        if (value % 15 == 0){
            return "FizzBuzz";
        } else if(value % 3 == 0) {
            return "Fizz";
        } else if(value % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(value);
        }
    }
}

