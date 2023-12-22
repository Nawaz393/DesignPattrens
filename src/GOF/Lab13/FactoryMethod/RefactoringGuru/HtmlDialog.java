package GOF.Lab13.FactoryMethod.RefactoringGuru;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
