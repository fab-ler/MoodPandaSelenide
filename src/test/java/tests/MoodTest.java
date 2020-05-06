package tests;

import org.testng.annotations.Test;

public class MoodTest extends BaseTest {

    @Test
    public void updateMoodTest() {
        // open login page
        // login
        // click update
        // fill in mood form
        // save - done
        steps
                .login("miname@mailinator.com", "qaz123")
                .updateMood(5, "I feel like dancing :)", "");
    }
}
