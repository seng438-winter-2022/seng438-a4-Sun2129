**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#:       |   |
|-----------------|---|
| Student Names:  | Sanchit Kumar  |
|                 | Aninda Shome  |
|                 | Ibrahim Asad  |
|                 | Isaiah Asaolu  |

# Introduction
This lab is mainly focused on testing systems. However, it is split into two parts: part 1 focuses on testing a program using mutation testing, while part 2 focuses on testing GUI using tools such as Selenium. In part 1 of the project, we were able to learn the way in which mutation testing can be carried out on a program to further improve a test suite and find errors in a program. It was able to teach us the ways in which mutations can be generated and the types of test cases needed to properly kill the mutants that have been generated. We used PiTest to generate mutations in the source code so that we could determine areas where more rigorous testing is required in the source code. In the second part of the lab, we learned about the ways in which GUI testing could be conducted and automated to make it easier to repeat tests. Our group picked the Walmart website to create tests for and automate using Selenium. Through Selenium, we were able to test the various functionality present on the Walmart website and create automated test cases that could be replayed with the click of a button. Through this lab, we were able to learn techniques through which we could thoroughly test a program and GUI. Using tools such as PiTest, Selenium, and Sikulix, we gained valuable experience in the various ways in which testing practices could be made better and even improved.

# Analysis of 10 Mutants of the Range class 
Surviving Mutant: Decremented (a--) double field upper
This mutant decrements the value of the double upper in the method getCentralValue. It survives which means that our test suite does not cover this mutant.

Killed Mutant: Incremented (++a) double field lower
This mutant increases the value of the lower bound in the function getLowerBound. We were able to kill it with our single test case for the method getLowerBound.

Survived Mutant: Substituted 1 with -1
This mutant substitutes the true value return with false instead in the function contains which returns a boolean. This mutant survived because our test suite was not extensive enough for this method to kill it.

Killed Mutant: Decremented (a--) double upper field
This mutant decrements the value of the upper bound in the getUpperBound method. The mutant was killed by our singular test case from before as it was big enough to kill quite a few mutants for that method.

Survived Mutant: Greater than to not equal
This mutant changes the if condition in the method intersects from greater than or equal to (<=) to just greater than and not equal. It survived because we did not have a test in our suite to tackle this mutant, even the ones we added to get the 10% did not cover this.

Killed Mutant: Incremented (++a) double local variable number 1
This mutant increments the value of the variable result which is a double in the method constrain. It was killed by some of the new test cases we added to increase our mutation score.

Survived Mutant: Replaced return value with null for org/jfree/data/Range::combine
This mutant replaced a return range2 statement with a return null in the combine method. It survived because our test cases for this method did not cover a null return from the method. Thus it survived.

Killed Mutant: Removed conditional - replaced equality check with true
The mutant removed the condition of this if statement: if(range.isNaNRange()) and replaced it with just a if(true) check. This occurred in the method combineIgnoringNaN. It was killed by our test cases we had previously for this method, when we first ran our mutation test.

Survived Mutant: Decremented (a--) double local variable number 0
This mutant decreased the value of the double d1 which was being returned in the method max. It survived because our test suite did not directly test this method, as it is private so we could not directly call it.

Killed Mutant: Removed conditional - replaced comparison check with true
This mutant changed the comparison check from (value < range.getLowerBound()) to just true for the method expandToInclude(). This was killed by our test cases that we had previously, before adding any new ones to increase our mutation score.


# Report all the statistics and the mutation score for each test class

# Analysis drawn on the effectiveness of each of the test classes

# A discussion on the effect of equivalent mutants on mutation score accuracy

# A discussion of what could have been done to improve the mutation score of the test suites
When improving the Mutation Score we would first run our test suite and this would show us our percentage in PIT Summary. Once we have the PIT Results we are able to see the mutations that both survived and got killed which can be seen in the PIT Mutations tab in Eclipse. The ones we want to kill are going to have green bugs attached to it and have a number with a small description such as “81: equal to less or equal” we then look at the source code that pur test cases are testing and look at line 81 so for this example we would see that line 81 falls under method equals in DataUtilities and the description asks for two double arrays where one array is a smaller size and then therefore that test case would kill the mutation. With this knowledge we can then look at each line of code and be able to kill any mutations. Killing mutations any surviving mutations is important as that is how the score increases and when the score increases it is an indication that a program will not fail if it encounters any typical bugs. 

# Why do we need mutation testing? Advantages and disadvantages of mutation testing
The complete coverage of a program may often be unfeasible or a great time sink. At the same time, it may not reveal all of the errors in a program. For this reason, mutation testing can be used to provide a stable program that has been thoroughly tested. It can provide a robust test suite that is able to verify that a program is free of errors from multiple angles. Lastly, mutation testing can also naturally increase the coverage of a program as it requires in depth white box testing. The disadvantages of mutation testing, however, is that it cannot be done with black-box testing. By the nature of mutation testing, an in-depth knowledge of the source code is needed. Also, mutation testing can take quite some time because a mastery of the source code is needed and mutation programs themselves can take an incredibly long amount of time to run if the source code is large. Lastly, writing test cases for mutants can also often be confusing and complicated.

# Explain your SELENUIM test case design process
Our Selenium test case design process first consisted of some brainstorming as to what functionalities we wanted to test on the website we had picked, which was the Walmart website. We looked thoroughly over the website and identified key features that might be worth testing. Once we came up with the 8 different functionalities we wanted to test, we came up with inputs and test cases as a group. So we started with our first functionality, then we ran tests according to the inputs we had come up with and recorded them. The test cases were all generated based on valid/invalid inputs to see how the system would react to different stimuli. We did the same for all the other functionalities. One thing we had to be wary of is that at the end of some of our tests we had to delete the items from the cart (for some functionalities) so that the next test would not be disturbed by something already being in the cart.

# Explain the use of assertions and checkpoints
Assertions and checkpoints are used to make sure that a webpage has the expected outcome for a test case. By adding this, we can automate the verification of whether a test case is actually working rather than having to manually verify the contents of the webpage every time we execute a test. This can help to greatly speed up the verification of test cases when we are re-running test cases that we have written before. However, these assertions and checkpoints need to be added to every test case and that can initially be a time sink. In our test cases, we used assertions and checked whether our test cases landed on the correct webpage after certain actions and functionalities. When there was functionality that created output, we used assertions to verify whether the output produced during the test was what we were expecting originally.

# how did you test each functionaity with different test data
We considered all possible inputs for a given functionality that we were testing as a group. Also, it was important to brainstorm the possible inputs of an ordinary customer to make sure that the intended functionality of the website is being provided. Then, we picked the inputs most likely to cause errors for a functionality and based tests around those. For instance, we entered an email without the “@” sign into the newsletter functionality on the Walmart website and it displayed a reminder to enter a valid email. An ordinary customer may forget to include the “@” sign when entering their email into the Newsletter window, so it was important to try to create a test case for this. We also tried to enter different invalid inputs into the different functionalities such as the Search bar, Login, and Store Locator. For example, we had a test case where we entered invalid emails into the Login page and we also had a test case where we entered valid emails with invalid passwords into the Login page.

# Discuss advantages and disadvantages of Selenium vs. Sikulix
Firstly, the installation process for Selenium and Sikulix were both incredibly easy.

The Selenium IDE provides an easy way to record and replay tests. It is very intuitive in that it is incredibly easy to understand the functionality of the buttons on the UI present in the IDE. To record a test and play it back, it is as simple as entering a URL for the project, pressing the record button, performing actions on the webpage, ending the recording, and then playing the recording back. However, Selenium can also be quite buggy. For one, it can slow down browsers when recording quite a lot. It can also sometimes get stuck on the “Mouse Over” commands that it generates when you try to play back a test. These have to be manually deleted in order to allow for the overall test to function properly. The playback on Selenium IDE can also be really quick or incredibly slow with no in between. Also, individual tests cannot be imported from one machine to another. Entire projects containing multiple tests have to be imported, which also result in your previous tests in a project getting wiped out. Another problem with the playback was that it was not possible to see what was being clicked on when the IDE executed a command. Lastly, the Selenium IDE automatically places verification check points that can tell a tester the point at which a test has failed on the webpage. This was useful to know when there was a problem either with Selenium or with the website.

Sikulix also has its fair share of advantages and disadvantages. While Sikulix gives the user more control over the testing by providing commands and screenshots that a user needs to enter, it also is somewhat complicated in that a tutorial is needed beforehand in order to be able to use Sikulix properly. We found the UI to be unintuitive because it was hard to tell the functionality of certain buttons by just looking at them and reading their names. Unlike Selenium, the playback was helpful when it executed because it was clearly possible to see what was being clicked on and what was being entered where. The mouse would physically move to the location of the where the command needs to be executed. This made the playback a lot more insightful than Selenium’s playback. The playback also played itself at a reasonable pace to make sure that testers understood the entire process of the test. Lastly, in Sikulix, verification checkpoints need to be manually added through code to ensure that a webpage is meeting certain requirements.


# How the team work/effort was divided and managed
The team worked on each part together, and that includes brainstorming functionalities, tests inputs/cases, etc. When determining the Mutation Score we divided the work up into so that we were creating tests for mutations in different functions. This would ensure we were making progress killing different mutants so that we could increase our original score of 61% or 771/1259. When making these test cases to kill the surviving mutations we looked at what methods most of these surviving test cases were from and each made test cases for those. For part two, we came up with the functionalities we wanted to test together, and then split up the 8 functionalities amongst the 4 of us (2 each). Then we came up with test cases together for each functionality, considering all possible input types, and then split up to do those tests using the inputs we thought of together.

# Difficulties encountered, challenges overcome, and lessons learned
During our time working with Selenium we encountered numerous issues and challenges that we had to resolve or work around to in order to complete the lab. One such issue was when recording test cases selenium often crashes the page, resulting in us spending half an hour recording one of these. Once the test was recorded we ran into another problem, which is selenium  freezing at the mouse over command. We learnt to overcome this issue by deleting the mouse over command from our test. Another problem encountered was as the test case got bigger and involved more command, selenium would randomly crash when replaying the test. These behaviours led to an unpredictably when completely the lab, as we had no idea what issue was going to happen next. Selenium prevented us from splitting up the recording of test cases because there wasn’t a way to export and combine all of our individual tests into one. Therefore it had to be done on one person's computer. Combined with the issues all talked about slowed down our pace tremendously.

# Comments/feedback on the lab itself
Part 2 of the lab was significantly easier to understand compared to Part 1. Part Two some difficulties we observed were running some of our test cases using Selenium and this was largely due because the website may have a pop-up message in the middle of our tests to do surveys. We also incurred a problem because Selenium would refuse to load pages after it said that it was selected or not even select them. With Sikulik our only problem was that the document itself does not tell us how to develop the code for it and does not warn us that we should wait after every procedure. Part 1 is where our group had problems like many others and we had to ask the TA Esmaiel for help and he helped us with it during his own spare time. The Lab Document itself does not mention anywhere that you need to have a specific version of Eclipse to even run the PIT Mutations as well as the specific Java System Environment. Our whole group was using Eclipse 2021 and 2022 versions and it would not run as intended. We were told in the Labs to use 1.5 however it did not work as well. Once we got it running we noticed how long the system took to run as it took one member of our group 25 mins to run the RangeTypeTest.java JUnit file on their Macbook and this was especially concerning as it was one of the smaller JUnit files however we realised that if we were to work on a desktop the time is significantly slowed down as we tested it that it took 2:59 to run our test cases on the desktop and 13:01 to run on the laptop. Showing us that if this lab was done again we run on a more powerful computer as the time it takes to run files is significantly longer if they use a laptop unless they use a higher performance computer. The Lab document should also be updated and specify that you should not use a Java System Environment that is higher than 1.8 as well that you cannot use a version of Eclipse that is newer than version 2020-06 as there are significant problems and that it will not run.
