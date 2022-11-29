public class CourseWork {
    public static void main(String[] args) {
        //Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
        System.out.println("Задача 3");
        String name = "Mobilisation";
        int nameLength = name.length();
        int nameLength2 = nameLength / 2;
        if (nameLength % 2 != 0) {  //прописал условие, в случае если в строке нечетное количество символов,
            // то ровно пополам поделить не получится, в таком случае в 1 части будет на 1 символ больше, без условия символы дублируются на каждой части строки.
            String name1 = name.substring(0, nameLength - nameLength2);
            String name2 = name.substring(nameLength2 + 1);
            System.out.println(name1);
            System.out.println(name2);
        } else if (nameLength % 2 == 0) {
            String name1 = name.substring(0, nameLength - nameLength2);
            String name2 = name.substring(nameLength2);
            System.out.println(name1);
            System.out.println(name2);
        }
    }
}

