
# Introduction 
FlightPricePrediction is a python web application which can predict the flight price based on Departue Time, Arrival Time, Source, destination, Stopage and based on airlines. This platform is  used  FLASK  and give response based on HTTP request. Random Forest Machine learning approach has been used here.

# About Data 
 Data is taken from kaggle.[Here](https://www.kaggle.com/nikhilmittal/flight-fare-prediction-mh) is  more information of the Data.
 
# Random Forest
Random forests or random decision forests are an ensemble learning method for classification, regression and other tasks that operate by constructing a multitude of decision  trees at training time and outputting the class that is the mode of the classes (classification) or mean/average prediction (regression) of the individual trees.Random    decision forests correct for decision trees' habit of overfitting to their training set.Random forests generally outperform decision trees, but their accuracy is lower than gradient boosted trees.

![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Random%20Forest/random_forest.JPG)


# UML
Following are the UML diagrams of the project.
## 1. Activity Diagram
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/1(Activity%20Diagram).JPG)

## 2. Use Case Diagram 
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/2(UserCaseDiagram).JPG)

## 3. Deployment Diagram
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/3(Deployment%20Diagram).JPG)

# Clean Code Development
### 1.Consistent naming convention
 Throughout coding, naming scheme of camel case is used for both variables and functions. Moreover, for immutable/final variables all-upper-casing scheme is used.
 
### 2.Modularity

Source code has been divided into two modules. Module "Analyzer" is responsible for object recognition tasks, while module "Router" is responsible for routing of incoming and outgoing rest API requests.
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Modularity.JPG)

### 3. Configure Data at Higher Level
All configurable data (for example: Directory names, paths), have been placed at higher level, making tweaking of values easier for the purpose of debugging.

![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Configure%20Data%20at%20Higer%20Level.JPG)

### 4. Clean  use of Functions
*I always tried to  keep small and do one thing.
*Used descriptive names and fewer arguments.

![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Clean%20code/function.JPG)

### 5.Follow of comments rule
*Always tried to  explain what is happening.
* Tried to give explantion

![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Clean%20code/comments%20rule.JPG)

### 6. General Rules
*Followed standard conventions
* Tried to keep it simple
*Tried to keep clean

# Merics
 In FlightPricePrediction I have used two Metrics which is Sonarcloud and Codacy.

**SonarCloud** is a cloud service offered by SonarSource and based on SonarQube. SonarQube is a widely adopted open source platform to inspect continuously the quality of source code and detect bugs, vulnerabilities and code smells in more than 20 different languages.
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/sonar%20cloud.JPG)

**Codacy** Automatically identify issues through static code review analysis. Therefore we can be notified on security issues, code coverage, code duplication, and code complexity in every commit and pull request, directly from your current workflow.[![Codacy Badge](https://app.codacy.com/project/badge/Grade/b4e50059ed3149c7be657492dec30b58)](https://www.codacy.com/gh/allmamun556/FlightPricePrediction1/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=allmamun556/FlightPricePrediction1&amp;utm_campaign=Badge_Grade)

![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/codacy%20test.JPG)
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Codacy%20test%202.JPG)

# Unit Test

### Test using Selenium Automation
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Test%20with%20selenium.JPG)

### Selenium  Automation Directory
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/working%20directory%20for%20%20automation%20testing.JPG)
###  Unit test from GitBash using pytest
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Unit%20test.JPG)

# Git Bash
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Git%20%20Bash.JPG)

# Continuous Integration(Using GitHub Action)
GitHub Action is a continuous integration service used to build and test software projects hosted at GitHub by GitHub. 

GitHub Action is configured by adding a file named python-app.yml, which is a YAML format text file, to the .github/workflows directory of the repository.This file specifies the programming language used, the desired building and testing environment (including dependencies which must be installed before the software can be built and tested), and various other parameters. Finally It was built all succesfull and complete.
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Github%20Action%20CI/Git%20hub%20action%20CI.JPG)
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Github%20Action%20CI/Install%20dependency.JPG)
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Github%20Action%20CI/Test.JPG)
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Github%20Action%20CI/Run%20Check%20out.JPG)
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Github%20Action%20CI/Complete.JPG)

# IDE

![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/intellij_picture.JPG)

Intellij is my favourite IDE. Here is some of my favourite shortcut.


![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/IntellijShortcut.JPG)

# Functional Programming
Throughout this project, good practices for functional programming have been adopted. Following are few examples of such practices;
### 1. Side Effect Free Functions
As discussed earlier, wherever necessary context management has been used. So that effect of overlying function could remain locally. Hence using them would not result any side effects.
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Modularity.JPG)
# Deployment(using Heroku) / Build
To see ***Heroku Live Deployment*** [please click here](https://git.heroku.com/flightbg225.git).
### User interface
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Herok%20Build%20or%20%20Deployment/User%20interface.JPG)
### Heroku Overview
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Herok%20Build%20or%20%20Deployment/heroku%20overview.JPG)
### heroku build or Application logs
![Alt Text](https://github.com/allmamun556/FlightPricePrediction1/blob/master/Herok%20Build%20or%20%20Deployment/heroku%20build%20or%20Application%20log.JPG)
