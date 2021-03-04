import java.util.List;

abstract class Document {

    public List<Page> pages;
    public abstract void CreatePages();
    public abstract void getDocumentName();

}
