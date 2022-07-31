public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox1 = new MagicBox<>(new Integer[4]);
        System.out.println(magicBox1.add(2));
        System.out.println(magicBox1.add(5));
        System.out.println(magicBox1.add(1));
        System.out.println(magicBox1.add(7));
        System.out.println(magicBox1.add(6));

        System.out.println(magicBox1.pick());


        MagicBox<String> magicBox2 = new MagicBox<>(new String[3]);
        System.out.println(magicBox2.add("Строка1"));
        System.out.println(magicBox2.add("Строка2"));
        //  System.out.println( magicBox2.add("Строка3"));
        //  System.out.println( magicBox2.add("Строка4"));

        System.out.println(magicBox2.pick());


    }

}
