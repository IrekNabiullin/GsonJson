import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

class UsingListDemo {
    public static void main(String[] args) {
        // Текстовый массив с названиями стран:
        CountriesList countriesList = new CountriesList();
        String[] countryName = countriesList.getCountriesArray();
        // Текстовый массив из названий файлов с изображениями :
        String[] countryFlags = countriesList.getCountryFlags();
        // Текстовая переменная, определяющая путь к файлам с изображениями флагов (без указания страны):
        String url = "https://restcountries.eu/data/";
        // Текст для отображения в диалоговом окне:
        String msg = "Please choose a country";
        // Текст с названием диалогового окна:
        String title = "Country Frame API";
        // Объект для пиктограммы, отображаемой в диалоговом окне:
        ImageIcon img = new ImageIcon("api.jpg");
        // Текстовая переменная для записи выбранной пользователем страны:
        String country;
        // Объект для отображения страны:
        String text;
        // Отображение диалогового окна с раскрывающимся списком для выбора страны:
        country = (String) JOptionPane.showInputDialog(null,
                msg,   // Текст над раскрывающимся списком
                title, // Название окна
                JOptionPane.PLAIN_MESSAGE, // Тип окна
                img, // Пиктограмма, отображаемая в окне
                countryName,   // Элементы раскрывающегося списка
                countryName[0] // Выбранный по умолчанию элемент
        );
        // Если пользователь отменил ввод:
        if (country == null) {
            // Завершение выполнения программы:
            System.exit(0);
        }
        // Определение пиктограммы для отображения в диалоговом окне:
        for (int k = 0; k < countryName.length; k++) {
            // Если текст в переменной animal совпадает с текстовым значением элемента в массиве:
            if (country.equals(countryName[k])) {
                // Создание объекта пиктограммы:
 //               img = new ImageIcon(url + flags[k]);
                // открытие ссылки с флагом страны
                // TODO добавить объект класса TempClass  и проверять его на наличие скачанной мапы с фалагами
                openWebpage(url + countryFlags[k]+".svg");
                // Завершение оператора цикла:
                break;
            }
        }

        String countryToRequest = country;
        CountriesAPIReguest countriesAPIReguest = new CountriesAPIReguest();
        Country[] countrySet = countriesAPIReguest.getCountriesFromApi(countryToRequest);
        // output to text frame:
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < countrySet.length; i++) {
            output.append("Country: " + countrySet[i].name + "\n");
            output.append("Translations: " + countrySet[i].translations + "\n");
            output.append("Capital: " + countrySet[i].capital + "\n");
            output.append("Region: " + countrySet[i].region + "\n");
            output.append("Population: " + countrySet[i].population + "\n");
            output.append("Languages: " + countrySet[i].languages + "\n");
            output.append("Currencies: " + countrySet[i].currencies + "\n");
        }
        text = output.toString();

        // Отображение диалогового окна с пиктограммой:
        JOptionPane.showMessageDialog(null,
//                img,    // Отображаемое изображение
                text, // Отображаемое изображение
                country, // Название окна
                JOptionPane.PLAIN_MESSAGE // Тип окна
        );

//        JButton button = new JButton("See country flag");
//        button.setFocusable(false);
//        button.setFont(new Font("Verdana", Font.PLAIN, 12));
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                openWebpage(URL);
//
//
//            }
//        });
//        frame.getContentPane().add(button, BorderLayout.SOUTH);
//    }

    }

    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}