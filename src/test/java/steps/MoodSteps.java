package steps;

import pages.FeedPage;
import pages.LoginPage;

public class MoodSteps {
    LoginPage loginPage;
    FeedPage feedPage;

    public MoodSteps login(String user, String password) {
        loginPage.open("https://moodpanda.com/Login/");
        loginPage.login(user, password);
        feedPage.isPageopened();
        return this;
    }

    public MoodSteps updateMood(int moodRating, String description, String date) {

        return this;
    }
}
