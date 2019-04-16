# Регистрация
Прежде чем приступать к реализации вашего бота необходимо пройти регистрацию на игромов сервере.
Для этого необходимо перейти по адресу http://localhost:8080/codenjoy-contest/resources/icancode/registration.html
В открывшейся форме указываем следующие данные:
* Имя Фамилия (обязательно наличие двух слов с пробелом между ними)
* Адрес электронной почты (в формате email@email.com)
* Пароль (произвольное значение)
* В поле выбора игры необходимо выбрать значение 'iCanCode Contest' (соревнование)
* Платформа на которой пишется бот
* Опыт разработки на выбранной платформе
* Компания

**Примечание:**
* значения полей могут отличаться от реальных; важно, чтобы они были валидными с точки зрения правил валидации регистрационной формы.
* значения адреса электронной почты и пароль необходмо запомнить, т.к. они используются для входа в свою игровую сессию в браузере.

В случае успешной регистрации открывается игровое окно.
В адресной строке игрового окна содержатся данные, необходимые для регистрации вашего бота.
Пример адресной строки: http://localhost:8080/codenjoy-contest/board/player/2bkbcyqz4af73addp7e6?code=8114855158616289483
В данной строке:
* localhost:8080 - адрес игрового сервера
* 2bkbcyqz4af73addp7e6 - идентификатор юзера
* 8114855158616289483 - код подключения

# Реализация бота
Примечание: В случае возникновения каких-либо проблем, или вопросов, обратитесь к ментору

## Java клиент
* убедитесь, что на вашем компьютере установлена JVM версии 8
* убедитесь, что на вашем компьютере установлен фреймворк для автоматизации сборки проектов Maven версии 3
* скачайте директорию java-kotlin
* откройте клиент как Maven проект (java-kotlin/pom.xml)
* откройте класс java-kotlin/src/main/java/com/codenjoy/dojo/icancode/client/YourSolver.java
* скопируйте значение из адресной строки игрового окна и присвойте его значению константы: CONNECTION_URL
* добавьте реализацию логики вашего бота в метод whatToDo
* запустите вашего бота с помощью метода main
* для реализиации алгоритма через тесты (TDD) вы можете написать модульные тесты; примеры модульных тестов расположены в папке java-kotlin/src/test/java/com/codenjoy/dojo/icancode/client

## JavaScript клиент
* убедитесь, что на вашем компютере установлен node.js версии 10
* убедитесь, что на вашем компьютере установлен менеджер пакетов npm
* скачайте директорию js
* перейдите в директорию js и выполните установку необходимых модулей npm -i
* откройте файл your-solver.js
* присвойте переменной server значение адреса игрового сервера
* присвойте переменной user значение идентификатора юзера
* присвойте переменной code значение кода подключения
* добавьте реализиацию логики вашего бота в метод whatToDo
* запустите вашего бота с помощью команды node your-solver.js

## Kotlin клиент
* убедитесь, что на вашем компьютере установлена JVM версии 8
* убедитесь, что на вашем компьютере установлен фреймворк для автоматизации сборки проектов Maven версии 3
* скачайте директорию java-kotlin
* откройте клиент как Maven проект (java-kotlin/pom.xml)
* откройте класс java-kotlin/src/main/kotlin/com/codenjoy/dojo/icancode/client/YourSolver.kt
* скопируйте значение из адресной строки игрового окна и присвойте его значению константы CONNECTION_URL
* добавьте реализацию логики вашего бота в метод whatToDo
* запустите вашего бота с помощью метода main
* для реализиации алгоритма через тесты (TDD) вы можете написать модульные тесты; примеры модульных тестов расположены в папке java-kotlin/src/test/kotlin/com/codenjoy/dojo/icancode/client