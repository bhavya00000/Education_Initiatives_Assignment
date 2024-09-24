package design_patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        ThirdPartyLibrary thirdPartyLibrary = new ThirdPartyLibrary();
        DatabaseClient adapter = new Adapter(thirdPartyLibrary);

        adapter.queryDatabase();
    }
}
