import java.util.ArrayList;
import java.util.List;

public class Resume extends Document{

    public Resume() {

        pages = new ArrayList<>();
    }

    @Override
    public void CreatePages() {

        pages.add(new IntroductionPage());
        pages.add(new EducationPage());
        pages.add(new ExperiencePage());
        pages.add(new SkillsPage());
    }
    public void getDocumentName() {
        System.out.println("Resume");
    }
}
