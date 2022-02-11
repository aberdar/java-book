package aberdar.interfaces.defaultMethods;

public class DefaultMethods {

    public static void main(String[] args) {
        TextHtml textHtml = new TextHtml();

        String text = textHtml.asText();
        String html = textHtml.asHtml();

        System.out.println("Text is " + text);
        System.out.println("Html is " + html);
    }
}

interface IText {
    default String asText() {
        return "text";
    }
}

interface IHtml {
    default String asHtml() {
        return "<span>html</span>";
    }
}

class TextHtml implements IText, IHtml {

}