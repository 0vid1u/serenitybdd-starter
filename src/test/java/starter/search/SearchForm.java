package starter.search;

import net.serenitybdd.screenplay.targets.Target;

public class SearchForm {
    public static final Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("#searchbox_input");
}
