package GOF.Lab13.FactoryMethod.RefactoringGuru;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}