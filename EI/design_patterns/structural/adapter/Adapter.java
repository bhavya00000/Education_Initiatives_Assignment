package design_patterns.structural.adapter;

public class Adapter implements DatabaseClient {
    private ThirdPartyLibrary library;

    public Adapter(ThirdPartyLibrary library) {
        this.library = library;
    }

    @Override
    public void queryDatabase() {
        library.fetchData();
    }
}
