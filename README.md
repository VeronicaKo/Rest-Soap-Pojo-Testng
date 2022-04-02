### Working with SOAP and REST
Обезличенная часть большого проекта для демонстрации работы с SOAP и REST


### Состав проекта
Пополнение счета клиента src/main/java/core/utilities/api/AddMoneyToCustomerAccount.java  
1. Авторизуемся под клиентом через несколько REST-запросов с передачей Cookies: PostAuthorization
   1. AuthenticationLoginEnter 
   2. AuthenticationAdditional 
   3. AuthenticationNotification
2. Получаем номер расчетного счета клиента: GetAccountsOfCustomer 
3. Собираем xml-файл запроса из Pojo классов для пополнения счета CreateXmlForAddMoneyToCustomerAccount
4. Отправляем запрос и сверяем статус ответа.


Создание новой цифровой карты PostDigitalCardIssueTest.
Для тела REST запроса используется pojo класс NewDigitalCardRequest 

