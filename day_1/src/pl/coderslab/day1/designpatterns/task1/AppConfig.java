package pl.coderslab.day1.designpatterns.task1;

import java.util.ArrayList;
import java.util.List;

public class AppConfig {

    private static AppConfig INSTANCE;

    private String databaseUrl;
    private String rootUser;
    private List<String> users;

    public static AppConfig getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new AppConfig("databaseUrl","boss", new ArrayList<>());
        }
        return INSTANCE;
    }

    private AppConfig(String databaseUrl, String rootUser, List<String> users) {
        this.databaseUrl = databaseUrl;
        this.rootUser = rootUser;
        this.users = users;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getRootUser() {
        return rootUser;
    }

    public void setRootUser(String rootUser) {
        this.rootUser = rootUser;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }
}
