import java.util.ArrayList;

public class Lucas_Series implements ISubscriber {

    private static long a[] =new long [102];
    public static long getLucasSeries(int x) {

        if (x == 0){
            return 2;}
        if (x == 1){
            return 1;}

        if ( a[x] != -1 ){
            return a[x];
        }
        a[x]=getLucasSeries(x - 1) + getLucasSeries(x - 2);
        return a[x];
    }

    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        for (int i =0 ; i < 102 ; i++){
            a[i] = -1;
        }
        int x = Integer.valueOf(input);
        System.out.println("Lucas Series = " + getLucasSeries(x));
    }
}

