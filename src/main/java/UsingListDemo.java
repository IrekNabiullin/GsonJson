import javax.swing.*;
import java.awt.*;
import java.net.URL;

class UsingListDemo {
    public static void main(String[] args) {
        // Текстовый массив с названиями животных:
//        String[] txt = {"Волк", "Лиса", "Медведь", "Енот"};
        CountriesList countriesList = new CountriesList();
        String[] countryName = countriesList.getCountriesArray();
        // Текстовый массив из названий файлов
        // с изображениями животных:
        String[] files = {"wolf.jpg", "fox.jpg", "bear.jpg", "raccoon.jpg"};
        // Текстовая переменная, определяющая путь к
        // файлам с изображениями флагов:
        String url = "https://restcountries.eu/rest/v2/data/";
        // Текст для отображения в диалоговом окне:
        String msg = "Please choose a country";
        // Текст с названием диалогового окна:
        String title = "Country Frame API";
        // Объект для пиктограммы, отображаемой
        // в диалоговом окне:
        ImageIcon img = new ImageIcon("api.jpg");
        // Текстовая переменная для записи выбранного
        // пользователем животного:
        String animal;
        // Отображение диалогового окна с
        // раскрывающимся списком для выбора животного:
        animal = (String) JOptionPane.showInputDialog(null,
                msg,   // Текст над раскрывающимся списком
                title, // Название окна
                JOptionPane.PLAIN_MESSAGE, // Тип окна
                img, // Пиктограмма, отображаемая в окне
                countryName,   // Элементы раскрывающегося списка
                countryName[0] // Выбранный по умолчанию элемент
        );
        // Если пользователь отменил ввод:
        if (animal == null) {
            // Завершение выполнения программы:
            System.exit(0);
        }
        // Определение пиктограммы для отображения в
        // диалоговом окне:
        for (int k = 0; k < countryName.length; k++) {
            // Если текст в переменной animal совпадает
            // с текстовым значением элемента в массиве:
            if (animal.equals(countryName[k])) {
                // Создание объекта пиктограммы:
 //               img = new ImageIcon(url + files[k]);
                // открытие ссылки с флагом страны
                openWebpage(url + countryName[k]);
                // Завершение оператора цикла:
                break;
            }
        }
        // Отображение диалогового окна с пиктограммой:
        JOptionPane.showMessageDialog(null,
                img,    // Отображаемое изображение
                animal, // Название окна
                JOptionPane.PLAIN_MESSAGE // Тип окна
        );
    }
    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}