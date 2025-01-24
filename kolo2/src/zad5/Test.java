package zad5;

public class Test
{
    public static void main(String[] args)
    {
        UserAuthentication u = new UserAuthentication("ziomek1337", "qwerty654321");
        AdminAuthentication a = new AdminAuthentication("admin1", "admin1");

        u.login("ziomek1337", "qwerty654321");
        u.resetPassword("ziomek1337", "qwerty65432`", "!Jakies_Lepsze_Hasło@1369");
        u.resetPassword("ziomek1337", "qwerty654321", "!Jakies_Lepsze_Hasło@1369");
        u.resetPassword("ziomek1337", "qwerty654321", "znamtwojehaslo");
        u.logout();

        a.login("admin1", "admin1");
        a.ban(u);
        a.logout();

        u.login("ziomek1337", "!Jakies_Lepsze_Hasło@1369");
    }
}
