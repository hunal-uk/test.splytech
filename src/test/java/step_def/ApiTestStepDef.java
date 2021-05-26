package step_def;

import page.TestPOJO;
import page.TestPOJO_1;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiTestStepDef {

    int statusCodeAct;

    @When("User send request with valid information")
    public void user_send_request_with_valid_information() {
        TestPOJO body = new TestPOJO("2021-05-21T15:25:35.000Z", "John", "Smith", "+447745123456", 51.5, -0.15);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @Then("Response status code should be {int} created")
    public void response_status_code_should_be_created(int statusCode) {

        statusCode = statusCodeAct;
        assertEquals(201, statusCode);
    }


    @When("User send request with only require valid information")
    public void userSendRequestWithOnlyRequireValidInformation() {
        TestPOJO body = new TestPOJO("2021-05-21T15:25:35.000Z", "Erick", "+447755442211", 51.27, 0.35);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with require information without phone_number")
    public void userSendRequestWithRequireInformationWithoutPhone_number() {
        TestPOJO body = new TestPOJO("2021-05-21T15:25:35.000Z", "Scott", 50.78, 1.23);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @Then("Response status code should be {int} Bad Request")
    public void responseStatusCodeShouldBeBadRequest(int statusCode) {

        statusCode = statusCodeAct;
        assertEquals(400, statusCode);
    }


    @When("User send request with invalid date")
    public void userSendRequestWithInvalidDate() {
        TestPOJO body = new TestPOJO("3000-25-21T15:25:35.000Z", "Joshua", "+447766543298", 50.01, -2.01);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with invalid latitude")
    public void userSendRequestWithInvalidLatitude() {
        TestPOJO body = new TestPOJO("2021-05-25T15:25:35.000Z", "Maximus", "+447756543298", 567, 1.90);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with invalid longitude")
    public void userSendRequestWithInvalidLongitude() {
        TestPOJO body = new TestPOJO("2021-05-25T15:25:35.000Z", "Sasha", "+447746543298", 51.75, 1234.56);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with invalid name")
    public void userSendRequestWithInvalidName() {
        TestPOJO body = new TestPOJO("2021-05-25T15:25:35.000Z", "?12345@", "+447776543298", 51.56, -2.34);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with invalid phone_number")
    public void userSendRequestWithInvalidPhone_number() {
        TestPOJO body = new TestPOJO("2021-05-25T15:25:35.000Z", "Dylan", "+Dylan@123?", 51.56, -2.34);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with invalid surname")
    public void userSendRequestWithInvalidSurname() {
        TestPOJO body = new TestPOJO("2021-05-25T15:25:35.000Z", "Rebecca", "@John57", "+447755661234", 51.55, -2.49);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with require information without latitude")
    public void userSendRequestWithRequireInformationWithoutLatitude() {
        TestPOJO body = new TestPOJO("2021-05-25T15:25:35.000Z", "Harry", "+449876543298", -1.75);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with require information without pickup")
    public void userSendRequestWithRequireInformationWithoutPickup() {
        TestPOJO body = new TestPOJO("2021-05-25T15:25:35.000Z", "Holly", "+449876543298");
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with require information without longitude")
    public void userSendRequestWithRequireInformationWithoutLongitude() {
        TestPOJO_1 body = new TestPOJO_1("2021-05-25T15:25:35.000Z", "Emily", "+449876543298", 55.55);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with require information without name")
    public void userSendRequestWithRequireInformationWithoutName() {
        TestPOJO_1 body = new TestPOJO_1("2021-05-25T15:25:35.000Z", "+447755661234", 51.55, -2.49);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                            when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }


    @When("User send request with require information without departure_date")
    public void userSendRequestWithRequireInformationWithoutDeparture_date() {
        TestPOJO_1 body = new TestPOJO_1("Mia", "Brown", "+447755661234", 51.55, -2.49);
        Response response = given()
                                    .contentType(ContentType.JSON)
                                    .body(body)
                                    .log().all().
                        when()
                                    .post("/journeys").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @When("User send request with valid journeys_id")
    public void userSendRequestWithValidJourneys_id() {

        Response response = given().pathParam("journey_id", "60aeafb0d474579f8727bef9").

                            get("/journeys/{journey_id}").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }

    @Then("Response status code should be {int} OK")
    public void responseStatusCodeShouldBeOK(int statusCode) {
        statusCode = statusCodeAct;
        assertEquals(200, statusCode);

    }

    @When("User send request with invalid id")
    public void userSendRequestWithInvalidId() {
        Response response = given().pathParam("journey_id", "1234567890").

                            get("/journeys/{journey_id}").prettyPeek();

        statusCodeAct = response.getStatusCode();
    }
}