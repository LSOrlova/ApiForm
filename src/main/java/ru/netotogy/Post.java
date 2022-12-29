package ru.netotogy;

public class Post {
    public String name; // поле для ввода имени
    public String passport; // поле для ввода паспорта - нужен другой тип данных в зависимости от требований дальнейшей обработки этих данных
    public String patronymic; // поле для ввода отчества
    public String phone; // поле для ввода телефона - нужен другой тип данных в зависимости от требований дальнейшей обработки этих данных
    public String surname; // поле для ввода фамилии
    public boolean subscription; // поле для ввода подписки на рассылку
    public FormDate birthday; // поле для ввода даты рождения
}
