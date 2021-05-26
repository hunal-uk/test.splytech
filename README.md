# Api Testing Assignment

The project was automated inside the Github. <br>
The code is inside the Github repository, and can be clone to local computer.<br>
Once push the updated code to the remote repository. <br>
By clicking this test button, if there is any failed test scenario, the System output (expected and actual result) for the failed text scenarios is visible.

(https://github.com/hunal-uk/test.splytech.git)

## How to install and run
- Clone the repository from Github
- Run the proje with "mvn clean verify"



You can see the endpoints interactions below;

<br>

*Test Scenarios*

*Scenario:* User should be able to Post request with valid information<br>
&nbsp; *When* User send request with valid information<br>
&nbsp; *Then* Response status code should be 201 created<br><br>


*Scenario:* User should be able to Post request with require valid information without surname<br>
&nbsp; *When* User send request with only require valid information<br>
&nbsp; *Then* Response status code should be 201 created<br><br>


*Scenario:* User should be able to Get request with valid_id<br>
&nbsp; *When* User send request with valid journeys_id<br>
&nbsp; *Then* Response status code should be 200 OK<br><br>


*Scenario:* User should not be able to Post request with valid information without phone_number<br>
&nbsp; *When* User send request with require information without phone_number<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with invalid date<br>
&nbsp; *When* User send request with invalid date<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with invalid latitude<br>
&nbsp; *When* User send request with invalid latitude<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with invalid longitude<br>
&nbsp; *When* User send request with invalid longitude<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with invalid name<br>
&nbsp; *When* User send request with invalid name<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with invalid phone_number<br>
&nbsp; *When* User send request with invalid phone_number<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with invalid surname<br>
&nbsp; *When* User send request with invalid surname<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with valid information without latitude<br>
&nbsp; *When* User send request with require information without latitude<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with valid information without longitude<br>
&nbsp; *When* User send request with require information without longitude<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with valid information without pickup<br>
&nbsp; *When* User send request with require information without pickup<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with valid information without name<br>
&nbsp; *When* User send request with require information without name<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Post request with valid information without departure_date<br>
&nbsp; *When* User send request with require information without departure_date<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>


*Scenario:* User should not be able to Get request with invalid journey_id<br>
&nbsp; *When* User send request with invalid id<br>
&nbsp; *Then* Response status code should be 400 Bad Request<br><br>