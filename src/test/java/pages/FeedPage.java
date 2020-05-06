package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class FeedPage {

    public FeedPage isPageOpened() {
        $("#LinkUpdate").waitUntil(Condition.visible, 30000);
        return this;
    }

}
