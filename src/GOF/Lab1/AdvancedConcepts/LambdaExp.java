package GOF.Lab1.AdvancedConcepts;

// demonstrate the use of lambda
public class LambdaExp {


    public static void main(String[] args) {




        Lambda lambda=new Lambda();

        lambda.traverseList();


        Arthematic add= (i,j)->i+j;
        Arthematic sub= (i,j)->i-j;
        Arthematic mul= (i,j)->i*j;
        Arthematic div= (i,j)->i/j;


        lambda.lambdaAsArgumant(add,1,2);
        lambda.lambdaAsArgumant(sub,1,2);
        lambda.lambdaAsArgumant(div,1,2);
        lambda.lambdaAsArgumant(mul,1,2);




    }
}
