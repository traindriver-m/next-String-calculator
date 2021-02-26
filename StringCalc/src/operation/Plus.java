package operation;


import main.Massive;

public class Plus  {


    public void operation(String a) {
        Massive m= new Massive();
        String[] plusMassive = m.getMassive(a);


        if (m.getK()<4) {
            System.err.println("не соответствует условию");
            System.exit(1);
        }

        System.out.println("\"" +plusMassive[0] + plusMassive[1] +"\"");
    }
}

