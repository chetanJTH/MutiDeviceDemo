package utils;

public enum Apps {

    ApiDemo("com.bg.flyermaker", "com.ui.activity.SplashActivity", "src/app/ApiDemos-debug.apk");


    private String appPackage;
    private String appPath;
    private String appActivity;

    public String getAppPackage() {
        return appPackage;
    }
    public String getAppPath() {

        return appPath;
    }
    public String getAppActivity() {

        return appActivity;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }
    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }
    public void setAppActivity(String appActivity) {
        this.appActivity = appActivity;
    }

    Apps(String appPackage, String appActivity, String appPath) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
        this.appPath = appPath;
    }
}
