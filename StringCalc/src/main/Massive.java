package main;

public class Massive {
    private int k = 0;

    public String[] getMassive(String a) {
        String[] massive = {"", ""};
        for (int i = 0; i < a.length(); i++) {
            char[] simbols = a.toCharArray();
            if (simbols[i] == '"') {
                k++;
                continue;
            }
            if (k % 2 != 0 && k <= 2 && simbols[i] != '"') {
                massive[0] = massive[0] + simbols[i];
            }
            if (k % 2 != 0 && k > 2 && simbols[i] != '"') massive[1] = massive[1] + simbols[i];

            if (massive[0].length() > 10 || massive[1].length() > 10) {
                System.err.println("Вы вышли за пределы количества вводимых символов");
                System.exit(1);
            }

        }
        return massive;

    }

    public void getNowMass_umn(String a) {  // умножение
        String[] strings = a.split("\\*", 2);
        String res = "";
        int size = 0;
        try {
            size = Integer.parseInt(strings[1]);
        } catch (Exception e) {
            System.out.println("Ошибка ввода данных");
            System.exit(5);
        }
        if (strings[0].length() > 10 ) {
            System.err.println("Вы вышли за пределы количества вводимых символов");
            System.exit(1);
        }
        if (size >10){
            System.err.println("Введено число больше 10");
            System.exit( 6);
        }
        for (int i = 0; i < size; i++)
            for (char c : strings[0].toCharArray()) {
                if (c != '\"') res += c;
            }
        System.out.print("\"");
        if (res.length() > 40) {
            for (int i = 0; i < 40; i++) {
                System.out.print(res.toCharArray()[i]);
            }
            System.out.println("...\"");
        }else {
            for (char c: res.toCharArray())System.out.print(c);
            System.out.println("\"");
        }
    }


    public int getK() {
        return k;
    }

    public void getNowMass_del(String a) { // деление
        String[] strings = a.split("\\/", 2);
        int size = 0;
        try {
            size = Integer.parseInt(strings[1]);
        } catch (Exception e) {
            System.out.println("Ошибка ввода данных");
            System.exit(5);
        }
        if (strings[0].length() > 12 ) {
            System.err.println("Вы вышли за пределы количества вводимых символов");
            System.exit(1);
        }
        if (size >10){
            System.err.println("Введено число больше 10");
            System.exit( 6);
        }
        System.out.print("\"");
        for(int i = 0; i <=(strings[0].length()-2) / size; i++){
            if(strings[0].toCharArray()[i]!='"')System.out.print(strings[0].toCharArray()[i]);
        }
        System.out.print("\"");
    }
}
