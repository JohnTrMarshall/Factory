public class Main {

    public static void main(String[] args) {

        Document[] documents = new Document[2];
        documents[0] = new Report();
        documents[1] = new Resume();

        documents[0].CreatePages();
        documents[1].CreatePages();

        for (Document doc: documents) {

            doc.getDocumentName();

            for(Page page : doc.pages) {
                page.getPageName();
            }

        }
    }
}
