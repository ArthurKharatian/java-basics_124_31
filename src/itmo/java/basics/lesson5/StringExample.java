package itmo.java.basics.lesson5;

public class StringExample {

    public static void main(String[] args) {
        String java = "Java";

//        String java2 = new String("JaVa");


//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));
//        String concat = java.concat(" Developer");
//        java = java.concat(" Developer");

//        System.out.println(java);
//        System.out.println(concat);
//
//        java = java + 123;
//
//        System.out.println(java);

//        java = 80 + 120 + java + (140 + 160);
//        System.out.println(java);

//
//        int length = java.length();
////        System.out.println(length);
//
//        boolean isEmpty = java.isEmpty();
//
//        String s = "";
//        String space = " ";
//
//        String text = "Java Developer";
//        //             0123456789
////        System.out.println(text);
////        text = text.trim();
////        System.out.println(text);
//
//
//        System.out.println(text.substring(2));
//        System.out.println(text.substring(2, 6));


//        System.out.println(java.replace("a", "&"));


        String ipsumLorem = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";

//        String[] split = ipsumLorem.split(" ");
//
//        for (String s : split) {
//            System.out.println(s);
//        }

//        Integer number = 123123;

//        number.toString();

//        String s = String.valueOf(number);
//        System.out.println(s);


//        char[] chars = ipsumLorem.toCharArray();
//        int counter = 0;
//
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                counter++;
//            }
//        }
//
//        System.out.println(counter);

//
//        StringBuilder builder = new StringBuilder(ipsumLorem);
//        StringBuilder builder2 = new StringBuilder(ipsumLorem);

//        System.out.println(ipsumLorem == builder.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
//        System.out.println(ipsumLorem.equals(builder.toString()));
//        System.out.println(ipsumLorem.equals(builder));


        // true false true true false
        // false true true true false

        //false
        //false
        //false
        //true
        //false


        StringBuilder builder = new StringBuilder(java);

//        String[] split = ipsumLorem.split(" ");
//
//        for (String s : split) {
//            builder.append(s)
//                    .append("++++++");
//        }
//
//        String string = builder.toString();
//        System.out.println(string);


//        System.out.println(builder.reverse());


        System.out.println(builder.insert(2, "Programmer"));

        System.out.println(builder.delete(2, 12));

        StringBuffer buffer = new StringBuffer();




    }
}
