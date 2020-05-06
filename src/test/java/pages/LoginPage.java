package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    String URL = "https://moodpanda.com/Login/";

    public LoginPage openPage() {
        open(URL);
        $("[alt='MoodPanda Android App on Google Play']").waitUntil(Condition.visible, 30);
        return this;
    }

    public LoginPage login(String user, String password) {
        $("#ContentPlaceHolderContent_TextBoxEmail").sendKeys(user);
        $("#ContentPlaceHolderContent_TextBoxPassword").sendKeys(password);
        $("#ContentPlaceHolderContent_ButtonLogin").click();
        return this;
    }

}
