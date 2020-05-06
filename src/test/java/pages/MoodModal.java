package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class MoodModal {

    String UPDATE_BUTTON_CSS = ".ButtonUpdate";
    String MY_DIARY_BUTTON_CSS = ".ButtonMyDiary";

    public MoodModal isPageOpened() {
        $(UPDATE_BUTTON_CSS).should(Condition.appear);
        return this;
    }

    public MoodModal updateDetails(int moodRating, String description, String date) {
        //TODO set mood rating
        $("#TextBoxUpdateMoodTag").sendKeys(description);
        //TODO click to appropriate Date
        return this;
    }

    public MoodModal clickUpdateMood() {
        $(UPDATE_BUTTON_CSS).click();
        return this;
    }

    //TODO this method should return MyDiaryPage (not yet implemented)
    public void toDiary() {
        $(UPDATE_BUTTON_CSS).click();
    }

}
