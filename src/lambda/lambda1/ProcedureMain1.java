package lambda.lambda1;

import lambda.Procedure;

import java.util.Objects;

public class ProcedureMain1 {

    public static void main(String[] args) {
        Procedure procedure = new Procedure() {

            @Override
            public void run() {
                System.out.println("hello! lambda");
            }
        };

        procedure.run();
    }
}
