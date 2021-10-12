# Convert JSON to HTML using Freemarker

## Install 

- Make sure you have the JDK 11 installed on your machine and the Maven as well. 
- Clone the repository: 
```console
git clone https://github.com/reness0/convert-json-to-freemarker
```
- Go into the folder: 
```console
cd convert-json-to-freemarker
```
- Run these two maven commands:
```console
mvn clean package
```
> This will build the dependencies
```console
mvn exec:java
```
> This will run the program

- Verify the output of the program, access this HTML page: `json-to-freemarker/src/main/kotlin/templates/output.html`

> If you wanna change the JSON, just go inside the class: `src/main/kotlin/freemarker/GenerateTemplateFromObject.kt` and change the variable `json`


