#language: ru
@RickAndMorty
Функционал: Сравнение последнего персонажа из последнего эпизода, в котором встречатеся персонаж Morty Smith с id=2
  Сценарий: Получение информации последнего персонажа
    Дано Отправляем get-запрос для нахождения по персонажу с id "2" последнего эпизода, где он учавствовал
    Затем Отправляем get-запрос для нахождения последнего персонажа в последнем эпизоде
    И Отправляем get-запрос для нахождения локации последнего персонажа в последнем эпизоде
    Тогда Сравниваем значения персонажей по расе и локации


