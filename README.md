# Assignment_2_Test

# **Computer mouse**<br />_
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

**Catastrophic failure**<br />
Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?<br /><br />



**Investigation of tools**<br />
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
Er et godt værktøj hvis man på forhånd ved at testen vil fejle hvis ens antagelse ikke passer.<br />
