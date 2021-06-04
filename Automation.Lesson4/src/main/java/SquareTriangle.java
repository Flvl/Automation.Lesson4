import java.io.IOException;

public class SquareTriangle {


    public double Square(int a, int b, int c){

        existTriangle(a,b,c);
        double p= ((double)a+b+c)/2;
        return roundSquare(Math.sqrt(p*(p-a)*(p-b)*(p-c)));

    }

     double roundSquare (double square){

        return (double)Math.round(square*1000)/1000;
    }

    void existTriangle (int a, int b, int c){
        if ((a<=0)||(b<=0)||(c<=0)||(a+b<=c)||(a+c<=b)||(b+c<=a))
            throw new UnsupportedOperationException("Triangle doesn't exist") ;

    }

}
