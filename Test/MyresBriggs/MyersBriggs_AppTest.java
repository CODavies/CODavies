package MyresBriggs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyersBriggs_AppTest {
    MyersBriggs_App myersBriggs_app;
    MyersBriggsQuestions myersBriggsQuestions;


    @BeforeEach
    void setUp() {
        myersBriggs_app = new MyersBriggs_App();
        myersBriggsQuestions = new MyersBriggsQuestions();
        myersBriggs_app.setMyersBriggsQuestions(myersBriggsQuestions);
    }

    @AfterEach
    void tearDown() {
        myersBriggs_app = null;
        myersBriggsQuestions = null;
    }

    @Test
    void testThatMyersBriggsClassIsNotNull() {
        assertNotNull(myersBriggs_app);
    }

    @Test
    void testThatTheMyersBriggsQuestionArraySize() {
        assertEquals(20, myersBriggs_app.getMyersBriggsQuestions().length);
    }

    @Test
    void testForFirstElementInArray() {
        assertEquals("2)  A. Interpret literally, B. Look for meaning and possibilities", myersBriggsQuestions.getQuestions()[1]);
    }



    @Test
    void testAssertionsThrows() {
        assertThrows(ExceptionClass.class, () -> myersBriggs_app.displayQuestion());
    }

    @Test
    void testForPersonality() {
        myersBriggs_app.getAnswersToQuestions()[0] = "a";
        myersBriggs_app.getAnswersToQuestions()[1] = "b";
        myersBriggs_app.getAnswersToQuestions()[2] = "a";
        myersBriggs_app.getAnswersToQuestions()[3] = "a";
        myersBriggs_app.getAnswersToQuestions()[4] = "a";
        myersBriggs_app.getAnswersToQuestions()[5] = "b";
        myersBriggs_app.getAnswersToQuestions()[6] = "a";
        myersBriggs_app.getAnswersToQuestions()[7] = "a";
        myersBriggs_app.getAnswersToQuestions()[8] = "b";
        myersBriggs_app.getAnswersToQuestions()[9] = "a";
        myersBriggs_app.getAnswersToQuestions()[10] = "a";
        myersBriggs_app.getAnswersToQuestions()[11] = "a";
        myersBriggs_app.getAnswersToQuestions()[12] = "b";
        myersBriggs_app.getAnswersToQuestions()[13] = "a";
        myersBriggs_app.getAnswersToQuestions()[14] = "a";
        myersBriggs_app.getAnswersToQuestions()[15] = "a";
        myersBriggs_app.getAnswersToQuestions()[16] = "a";
        myersBriggs_app.getAnswersToQuestions()[17] = "a";
        myersBriggs_app.getAnswersToQuestions()[18] = "a";
        myersBriggs_app.getAnswersToQuestions()[19] = "a";
        assertEquals("E", myersBriggs_app.personalityCheckForSourceOfEnergy());
        assertEquals("S", myersBriggs_app.personalityCheckProcessingInformation());
        assertEquals("T", myersBriggs_app.personalityCheckApproachToDecisionMaking());
        assertEquals("J", myersBriggs_app.personalityCheckNeedForStructure());
    }
}
