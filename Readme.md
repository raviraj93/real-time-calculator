###### Realtime-Calculator

###### What it does:-

A SpringBoot web app that logs calculations as the request is received and publish this to other users also who are connected to the application.

For example, user A and user B go use the app at the same time. User A calculates “5 + 5”, which equals “10". This is logged below the calculator as “5 + 5 = 10”. User B is updated about this calculation right after user A posts it. Now, user B calculates “3 x 4".This calculates to “12” and displays “3 x 4=12" right below the prior calculation. User A sees this update immediately after user B posts it. Results remain between sessions.

How I build it:-
1. Front-End: JavaScript
2. Back-End: Java 
3. Deployment: Heroku
4. Libraries/Framework: Gradle, SpringBoot and stomp websocket library. 

Hosted On:
https://serene-earth-00566.herokuapp.com/


How to run in local machine:-
1. Clone this git repository from https://github.com/raviraj93/real-time-calculator.
2. Execute the `./gradlew build` command to build the project.
3. Execute `./gradlew bootRun` or `java -jar build/libs/real-time-calculator-1.0-SNAPSHOT.jar` to run the project.
4. Open the browser and type `localhost:8080` and then click connect.

Assumptions:-
1. Calculation expression are separated by a space.
2. User can see the calculations of other users logged in after him.
3. User will use device keyboard to type the expression.
4. Only digits are entered in the text box.

Scope/Enhancements:-
1. Alerting the User for entering the invalid values. On the backend, proper exceptions are handled for datatype and 
   params length and also logged properly. Since I have worked mostly on the backend, I have implemented this backend,
   On fronted Users can be alerted depending on the response from the backend service.

2. Scientific calculations are out of scope for this project.

3. Input button/ virtual keyboard can be done as an enhancement.

4. UX can be improved more and test cases for UI can also be added.