
# Progam Over View
This is a Java  Spring boot Web Service implementation of basic arithmetic functions .
This application should perform following tasks
1. Addition
2. Subtraction
3. Multiplication
4. Division

## Requirements :
1. [Java](https://java.com/en/download/)
2. [Maven](http://maven.apache.org)

## Arithmetic library
Arithmetic library is place under **"com.generic.arithmetic"** package. 
This library is intended to be widely reuasable due to its ability to perform basic arithmetic operations on binary, octal, decimal, hexadecimal, and floating point numbers. It also performs conversions between the various types. All input for number values, regardless of type, is taken as a String. All output is given as a String as well. Base values (binary, octal, decimal, hexadecimal) are represented as the numbers 2, 8, 10, and 16, respectively, and are passed as the primitive Java int type. All functions return an error if there is an invalid base, a mismatch between the given base and one of the arguments, or invalid characters in any of the arguments.
## Acceptable Number Formats: 
in order to be able to perform arithmetic operation , user must pass base to the library.
Acceptable bases are as follow
* 2
* 8
* 10
* 16
## Location of WSDL.
http://localhost:8080/ws/arithmetic.wsdl
## WSDL Definition
WSDL definition generated from XSD file located at **/WebService/src/main/resources/countries.xsd**
## How to change port
Add following into **src/main/resources/application.properties**
server.port=[port number]
## Tests
Load the WSDL into SoapUI and perform/test functionality of WS
## Build :
mvn clean install

