package operation;


import main.Massive;

public class Minus {

    public void operation(String a) {
        Massive l = new Massive();
        String[] minusMassive = l.getMassive(a);

        if (l.getK() < 4) {
            System.err.println("не соответствует условию");
            System.exit(1);
        }
            String result = new String("");
            String[] m1 = minusMassive[0].split("");
            String[] m2 = minusMassive[1].split("");
            boolean b = true;
            for (String s : m1) {
                for (String s2 : m2) if (s.equals(s2)) b = false;
                if (b) {
                    result += s;

                } else b = true;
            }
            System.out.println("\"" + result + "\"");
        }
    }
