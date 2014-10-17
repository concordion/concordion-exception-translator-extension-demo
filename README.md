Introduction
------------------

This project demonstrates the usage of the [Concordion](http://concordion.org) [Exception Translator Extension](http://github.com/concordion/concordion-exception-translator-extension) with [Selenium WebDriver](http://docs.seleniumhq.org/projects/webdriver/).

Example output is shown [here](http://concordion.github.io/concordion-exception-translator-extension-demo/spec/ExceptionTranslatorDemo.html).

Running the tests
---------------------------

The tests use Selenium's FirefoxDriver, so you'll need to have Firefox installed (or you could change the code to use a different driver).
    
The download includes support to run the tests with either <a href="http://www.gradle.org/">Gradle</a> or <a href="http://maven.apache.org/">Maven</a>.  
    
### Using Gradle
1. [Download](http://www.gradle.org/downloads.html) and [install](http://www.gradle.org/installation.html) Gradle (this has been tested with 2.1)
1. From a command line opened at the location to which this package has been unzipped, run `gradle clean test`
1. View the Concordion output under the subfolder `build/reports/spec/org/concordion/ext/demo/selenium/`
    
### Using Maven
1. Download and install maven (this has been tested with 3.0.3)
1. From a command line opened at the location to which this package has been unzipped, run `mvn test`
1. View the Concordion output under the subfolder `target/concordion/org/concordion/ext/demo/selenium/`

### Running from your IDE
Import as a Gradle or as a Maven project. This may require additional plugins to be installed to support Gradle or Maven.

Under the `src/test/java` folder, find the `ExceptionTranslatorDemo` class in the `org.concordion.ext.demo.selenium` package and run as a JUnit test. The location of the Concordion output is shown on the standard output console.

What you should see
--------------------------------
The test will open a Firefox browser at the Google home page.
    
### JUnit output
The test should pass successfully, though the console output will show an exception with the message:

> <-- Note: This test has been marked as EXPECTED_TO_FAIL

The test deliberately throws an exception in order to demonstrate the extension.  It uses Concordion's `@ExpectedToFail` annotation to keep the JUnit passing (you'd normally only use this when you have a partially implemented feature).

### Concordion output
The output folder should contain the following specification. (You can see an example of it [here](http://concordion.github.io/concordion-exception-translator-extension-demo/spec/ExceptionTranslatorDemo.html)).
    
#### ExceptionTranslatorDemo.html
Shows the use of the ExceptionTranslatorExtension to remove debug information from the WebDriver exception output.
    
Potential Issues
------------------------
### Proxy

If you are behind a HTTP proxy server, you may need to configure the proxy to allow access to www.google.com

The easiest way to do this may be to add the following lines to the Site() constructor:

```java
    System.setProperty("http.proxyHost", "<proxy.host>");
    System.setProperty("http.proxyPort", "<proxy.port>");
```    

replacing `<proxy.host>` with the host name of the proxy server, and `<proxy.port>` with the port number.

If your proxy requires authentication, you will also need to set the properties `http.ProxyUser` and `http.proxyPassword`.
  
Additional Gradle Files
-----------------------
`dev.gradle` is only needed if you want to run against snapshot or local builds of the concordion-screenshot-extension.
`publish.gradle` is only needed if you want to publish the output to Github pages.

If copying the project for your own use, you probably won't want either of these files.

Mailing List
-----------------
Feel free to discuss this demo project on the Concordion [mailing list](https://groups.google.com/d/forum/concordion).