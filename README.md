# Assignment_2_Test

# **Computer mouse**<br />
Identify the types of testing you would perform on a computer mouse, to
make sure that it is of the highest quality.<br /><br />
Jeg ville teste om den ville følge bevægelse. <br />
side til side,<br />
op og ned, <br />
fra midten til  hjørnerne.<br />
Så ville jeg teste om højre og venstre klik virker. <br />
Så ville jeg teste om hjulet virker med dens rollen og om klikklet virker.<br />
Så ville jeg teste om den kunne man kan klikke og bevæge musen på samme tid.<br />
Og om man kan rolle eller klikke hjulet mens man bevæger musen.<br />
Jeg ville teste om man kunne holde klikket nede om det opfatter der. Også ville jeg se om <br />man kunne bevæge musen men man holder et klik nede.<br /><br />

### Catastrophe failure
**Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?**  
>Two years ago a well-known code collaboration platform GitLab experienced a severe data loss which appeared to be one of the major outages in the IT world. GitLab originally used only one database server but decided to test a solution using two servers. They planned to copy the data from the production environment to the test environment.
>
>In the process, the automatic mechanisms began to remove accounts from the database which were identified as dangerous. As a result of increased traffic, the data copying process began to slow down and then stopped completely due to data discrepancies. To add insult to injury, information from the production database was removed during the copying process.
>
>After several attempts to resume the process, one of the employees decided to delete the test base and start the process again but accidentally deleted the production base. What made things even worse is that the directory holding the copies was empty too — the backups had not been made for a long time due to a configuration error.
>
>What meant to be a standard procedure resulted in an 18-hour outage while the 300 GB of customer data was lost. According to the GitLab’s estimates, the company has lost data on at least 5,000 new projects, 5,000 comments, and 700 users. The company approach to this failure deserves respect.
>
>Gitlab explained in detail what happened, broadcasted the restoration procedure on YouTube and published a list of improvements to ensure that this trouble would never happen again. But as they say — the damage is done.

I would have make the process automatic instead of manual, and then added a test to the function that would run on a mock database to see if the copying of data happened the way it should without any failure before even considering using it on the production environment.


# **Investigation of tools**<br />
**JUnit 5**<br />
Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.<br/>

**@Tag** <br />
Bruges til at opdele sine test i grupper, hvilket gør sådan at man kan vælge kun at køre nogle af sine test. Dette er smart hvis man har et stort system men man kun vil test små dele af det af gange.<br />

**@Disabled** <br />
Gør sådan at testen ikke bliver kørt. Hvilket er ret gør så man ikke behøves at kommentere en test ud som ikke virker.<br />

**@RepeatedTest <br />**
Bruges til at sætte hvor mange gange denne test skal køre. Er et brugbart værktøj hvis man vil havde den samme test til at køre med forskellige data.<br />

**@BeforeEach, @AfterEach<br />**
Kan blive brugt til at indramme test date. Godt til at gøre det nemmere at se i konsollen.<br />

**@BeforeAll, @AfterAll<br />**
Bruges til at køre ting før og efter alle test. Fx at sætte random data it et array der bliver brugt i en test. After kan fx blive brugt til at tømme en test database når testne er kørt. Godt til at sætte store ting op i din test klasse og slutte dem af igen.<br />

**@DisplayName<br />**
Kan blive brugt til at sætte kommentar til testne. Gør det nemmere at holde styr på hvad testene skal hvis de fejler.<br />



**@Nested<br />**
Gør så du kan lave en klasse inde i dine test hvor du kan lave en specifik 
@BeforeEach, @AfterEach som kun bliver kørt i din nested test klasse. Hvilket kan være smart hvis du kan bruge nogle specifikke 
@BeforeEach, @AfterEach som kun testne i den nested klasse skal bruge.<br />

**assumeFalse, assumeTrue<br />**
Bliver brugt til sætte retningslinjer i testene, fx at testen skal kun køre hvis assumeTrue passer, og hvis det ikke er rigtigt bliver testen aborted.
Er et godt værktøj hvis man på forhånd ved at testen vil fejle hvis ens antagelse ikke passer.<br /><br />


### Mockito or EasyMock
1. **Simlarities**
Mockito allow the same level verification as EasyMock. They are essentially the same mocking framework, but EasyMock is built in a way that makes it easier to setup tests.


2. **Differences**  

|      xxxxxxxxxxxx                   | Mockito                                                 | EasyMock
| -------------           |-------------------------------------------                          | ---------------------------
| Support test spies      | Mockito support both mock as well as spies                          | EasyMock only supports mocks
| Mocked method calls     | To mock we use `Mockito.when(mock.method(args)).thenReturn(value)`  | In EasyMock, the `EasyMock.expect(mock.method(args)).andReturn(Value)` method for mocking a method call.
| Verifying Calls         | In Mockito, `verify(mock).method(args)` is used to verify calls | In EasyMock, `EasyMock.verify(mock)` is used for verifying calls to a mock. |
| Exception throwing      | To throw execptions, the `.thenThrow(ExceptionClass.class)` is used after calling the `Mockito.when(mock.method(args))` method | To throw exceptions, `.andThrow(new ExceptionClass())` is used after calling `EasyMock.expect(..)` |
| Accessibility | In addition, Mockito can also mock `private` and `final` methods. | EasyMock cannot mock `final` and `private` methods

In conclusion they are fairly similar, with the biggest difference being EasyMock not supporting spies and private/final methods.




