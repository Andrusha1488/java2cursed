import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        int gramsOfTvorog = 400;
        int Eggs = 3;
        int Sugar = 4;
        int Salt = 1;
        int Flour = 3;
        int VanilaSugar = 1;

        String recipe = "1. Соедините в миске творог, яйцо, сахар, ванильный сахар и соль, и все это перемешайте.\n" +
                "2. Затем добавьте муку (2 столовые ложки с горкой) и также все тщательно перемешайте.\n" +
                "3. Сформируйте шарики из творожной массы, на разогретую сковороду нальем растительное масло.\n" +
                "4. Обваляйте сырники в муке и выложим на сковороду. Жарить сырники на среднем огне с двух сторон до золотистой корочки. ";
        String ingredients = " - Творог: " + gramsOfTvorog + " грамм\n" +
                " - Яйца: " + Eggs + " штук\n" +
                " - Сахар: " + Sugar + " столовые ложки\n" +
                " - Соль: " + Salt + " щепотка\n" +
                " - Мука: " + Flour + " столовые ложки\n" +
                " - Яйца: " + VanilaSugar + " пакетик\n";


            FileWriter pw = new FileWriter("sirnichki_recipe.txt");
            pw.write("Рецепт сырничков:\n\n");
            pw.write("Ингредиенты:\n");
            pw.write(ingredients);
            pw.write("Приготовление:\n");
            pw.write(recipe);
            pw.close();
            System.out.println("Рецепт успешно записан в файл sirnichki_recipe.txt");

        }
    }
}
