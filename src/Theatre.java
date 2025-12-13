import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        //Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        System.out.println("\n" + "1.Создание актеров, режиссеров, автора музыки и хореографа:");
        ArrayList<Actor> actors = new ArrayList<>();
        Actor actor1 = new Actor("Сергей", "Козлов", Person.Gender.MALE, 179);
        Actor actor2 = new Actor("Евгений", "Маштаков", Person.Gender.MALE, 192);
        Actor actor3 = new Actor("Юлия", "Волкова", Person.Gender.FEMALE, 167);
        System.out.println(actor1 + "\n" + actor2 + "\n" + actor3);

        Director director1 = new Director("Виктор", "Смолянов", Person.Gender.MALE,
                181, 2);
        Director director2 = new Director("Александр", "Добронравов", Person.Gender.MALE,
                184, 3);
        System.out.println(director1 + "\n" + director2);

        String musicAuthor = "Ханс Циммер";
        String choreographer = "Алексей Сидоров";

        System.out.println("Автор музыки: " + musicAuthor + "\n" + "Хореограф: " + choreographer);
        System.out.println("\n" + "-------------------------------------------------------" + "\n");

        //Создать три спектакля: обычный, оперный и балет
        System.out.println("2.Создание трех спектаклей:");
        Show defaultShow = new Show("Ливень над Петербургом", 120, director1);

        String librettoTextOpera = '"' + "Площадь в Севилье. Все торжественно приветствуют " +
                "прибывшего в город тореадора Эскамильо..." + '"';
        Opera opera = new Opera("Кармен", 180, director1, new ArrayList<>(),
                "Ханс Циммер", librettoTextOpera, 30);

        String librettoTextBallet = '"' + "Старинный парк. Принцесса Одетта грустит. " +
                "Внезапно появляется незнакомец..." + '"';
        Ballet ballet = new Ballet("Лебединое озеро", 150, director2, new ArrayList<>(),
                "Ханс Циммер", librettoTextBallet, "Алексей Сидоров");

        System.out.println("Обычный спектакль: " + defaultShow.title);
        System.out.println("Опера: " + opera.title);
        System.out.println("Баллет: " + ballet.title);
        System.out.println("\n" + "-------------------------------------------------------" + "\n");

        //Распределить актёров по спектаклям
        System.out.println("3.Распределение актеров:");

        defaultShow.addActor(actor1);
        defaultShow.addActor(actor2);
        defaultShow.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);

        ballet.addActor(actor2);
        ballet.addActor(actor3);
        System.out.println("\n" + "-------------------------------------------------------" + "\n");

        //Для каждого спектакля выведите на экран список актёров
        System.out.println("4.Список актеров для спектаклей:");

        defaultShow.printAllActors();
        System.out.println();
        opera.printAllActors();
        System.out.println();
        ballet.printAllActors();
        System.out.println("\n" + "-------------------------------------------------------" + "\n");

        //Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров
        System.out.println("5.Замена актера:");
        Actor newActor = new Actor("Сергей", "Новиков", Person.Gender.MALE, 180);
        opera.replaceActor("Козлов", newActor);
        System.out.println("\n" + "-------------------------------------------------------" + "\n");


        //Попробуйте заменить в другом спектакле несуществующего актёра
        System.out.println("6.Ошибочная замена актера:");
        ballet.replaceActor("Чижиков", newActor);
        System.out.println("\n" + "-------------------------------------------------------" + "\n");

        //Для оперного и балетного спектакля выведите на экран текст либретто
        System.out.println("7.Текста либретто:");
        opera.printLibretto();
        System.out.println();
        ballet.printLibretto();
        System.out.println("\n" + "-------------------------------------------------------" + "\n");
    }
}