# Exam_Cucumber_API

## В рамках данного проекта реализован API автотест сервисов REQRES, The Rick and Morty API.

_Используемый стек:_
- Java
- Maven
- Cucumber
- REST Assured
- Allure

### Логика проекта организована по паттену Page Object, осуществлена разбивка по:
- [Методу Создания пользователя](https://github.com/artos64/Exam_Cucumber_API/blob/master/src/main/java/apiSteps/CreateUserSteps.java)
- [Методам Получения и сравнения информации между персонажами](https://github.com/artos64/Exam_Junit_UI/tree/master/src/main/java/pageObject/baseSteps)

### Запуск автотестов осуществляется в методе [RunTest](https://github.com/artos64/Exam_Cucumber_API/blob/master/src/test/java/tests/RunTest.java)

### Команды для запуска автотеста через терминал:
- mvn clean test - запуск всех тестов в проекте c удалением временных файлов
- mvn clean test -Dgrops="@Reg || @RickAndMorty" - для запуска по тегам
- mvn allure:report - генерация allure отчета
- mvn allure:serve - генерация allure отчета и разворачивания локального сервера для просмотра сгенерированного allure отчета
