# Diagnosis and Treatment of Cucumber Diseases in Java with Cucumber

Can you spot the Cucumber Diseases in this code? We’ll explore the code smells lurking in Gherkin and Cucumber. 🧪👃 These subtle yet impactful issues can creep into our test scenarios, affecting readability, maintainability, and overall quality.

Refactor this code, take small steps, run the tests often. See how small and beautiful can make it.

## Installation
For the workshop Java 17 or later is a pre-requisite for building und runnnig the Cucumber features. It needs to be installed before the local setup.

### Local

* Clone the repository localy
* Find more details about the repostory structure in our [Repository Tutorial](https://cucumber-diseases.github.io/repos/)
* Import the repository in your favourite IDE and configure the Maven build
* Install a Cucumber extension or plugin in you IDE
   * IntelliJ IDEA: https://www.jetbrains.com/help/idea/cucumber-support.html
   * VS Code: https://marketplace.visualstudio.com/items?itemName=CucumberOpen.cucumber-official
   * Eclipse: https://marketplace.eclipse.org/content/cucumber-eclipse-plugin

#### Platform notes
The VC Code Cucumber extension fails on any Unix distribution. It's recommended to use VS Code on Windows.

Restrictions of missing Cucumber extension on Unix:
* You won't have Gherkin support
* You can't generate step definition
* There is NO linkage between your feature files and step definition implementation
* You are still able to edit all file and execute your Unit Tests.

### gitpod.io
Since gitpod.io uses Linux, the same restrictions as on any other Unix distribution apply.

<a href="https://gitpod.io/#https://github.com/rolger/cucumber-diseases-java" target="_blank"> 
<img src="https://gitpod.io/button/open-in-gitpod.svg" alt="Open in Gitpod">
</a>

1. [Login to GitHub](https://github.com/login) or [create an account](https://github.com/join).

2. [Create a new workspace at Gitpod](https://gitpod.io/new/#https://github.com/rolger/cucumber-diseases-java).
   This usually takes a little while, just be patient.

3. At the bottom there is a Terminal window executing the Maven build the of project. Wait until _BUILD SUCCESS_ apprears in the log.
  
5. Open  from the file tree on the left and wait for the Java installation to finish.

6. After the installation is done, you can open files via the Java Project explorer, edit the code, and select _Run Tests_ on either the test folder or the _RunAllCucumberTests_ class file.

## 📝 Refactoring Exercises

The code in the `main` branch contains multiple Cucumber smells. The smells can be removed by a variety of refactoring exercises. It's recommended to follow the suggested order. 

Look at our [Code Smells Documentation](https://cucumber-diseases.github.io/exercise/) for a detailed introduction to all exercises.


