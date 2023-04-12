import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class Game {

    /*
        Данный класс содержит информацию об игре(её название, жанр, издателя и дату релиза)
        Программа возвращает количество дней, прошедших с момента релиза игры.
    */

    private String name;
    private String genre;
    private String publisher;
    private String dateOfRealize;

    //Опишем сеттеры и геттеры класса

    public void setName(String name){
        this.name = name;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDateOfRealize(String dateOfRealize) {
        this.dateOfRealize = dateOfRealize;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDateOfRealize() {
        return dateOfRealize;
    }

    // Опишем метод подсчитывающий кол-во дней с момента релиза

    public long daysSinceRealize(String currentDate){
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
            Date date1 = null;
            Date date2 = null;
            try {
                date1 = format.parse(currentDate);
                date2 = format.parse(dateOfRealize);
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }

        return (date1.getTime() - date2.getTime()) / (24 * 60 * 60 * 1000);
    }

    public static void main(String[] args) {
        Game game = new Game();

        // Присваиваем значения полям экземпляра

        game.setName("Need For Speed: Most Wanted");
        game.setGenre("AutoRacing");
        game.setPublisher("Electronic Arts");
        game.setDateOfRealize("15.11.2005");

        // Получаем значения экземпляра класса

        String name = game.getName();
        String genre = game.getGenre();
        String publisher = game.getPublisher();
        String dateOfRealize = game.getDateOfRealize();

        // Определяем текущую дату

        Date d = new Date();
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setTimeZone(TimeZone.getTimeZone("EAT"));
        String d1 = df.format(d);

        long days = game.daysSinceRealize(d1);

        //Выводим информацию об объекте

        System.out.println("Название игры: "+ name);
        System.out.println("Жанр: "+ genre);
        System.out.println("Издатель: "+ publisher);
        System.out.println("Количество дней с релиза: "+ days);
    }
}


