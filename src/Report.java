import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Report extends Document {

    public Report() {
        pages = new ArrayList<>();
    }

    @Override
    public void CreatePages() {

        pages.add(new ResultsPage());
        pages.add(new SummaryPage());
        pages.add(new ConclusionPage());
    }
    public void getDocumentName() {

        System.out.println("Report");
    }

}
