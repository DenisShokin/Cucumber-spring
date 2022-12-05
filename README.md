
#### Cucumber-java-spring template

### Prerequisites
* Java 11
* Gradle
* Cucumber for Java plugin for IntelliJ
* Gherkin for IntelliJ

### Initial
* clone repository
* open build.gradle file in IDE (IntelliJ)
* import dependencies with gradle

### Customise Cucumber tests
* add your .feature files with scenarios
* create custom steps class / steps classes with @Autowired annotations for page objects class / classes
* generate steps- in .feature file press 'alt+enter' shortcut and choose 'Create step definition' option, choose created steps class / steps classes to paste steps
* create custom page objects classes with methods and with @PageObject and @Autowired annotations for webdriver manager
* delete example .feature files, steps classes and page objects classes
