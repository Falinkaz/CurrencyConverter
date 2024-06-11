<em> # Rob's Currency Converter </em>

This is a simple Currency Converter tool created using Java. It uses the ExchangeRate API to obtain a currency exchange value and multiply it by a value which must be entered by the user. 

The api key for the ExchangeRate api can be obtained for free from  https://app.exchangerate-api.com/keys

The project is divided into two classes:

The Main class, which executes the code, and the getRate class, which calls the API and returns the exchange rate value. Once the user enters the amount that wants to exchange, then the Main class multiplies the amount by the exchange rate value that was obtained via the api call, and prints it. 
