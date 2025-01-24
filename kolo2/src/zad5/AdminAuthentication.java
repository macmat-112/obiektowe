package zad5;

public class AdminAuthentication
{
    public String username;
    public String password;
    public boolean loggedIn;

    public AdminAuthentication(String a, String b)
    {
        this.username = a;
        this.password = b;
        this.loggedIn = false;
    }

    public boolean login(String username, String password)
    {
        if(this.username.equals(username) && this.password.equals(password) && !this.loggedIn)
        {
            this.loggedIn = true;
            System.out.println("Admin Login successful");
            return true;
        }
        else
        {
            System.out.println("Admin Login failed");
            return false;
        }
    }

    public void logout()
    {
        if(this.loggedIn)
        {
            this.loggedIn = false;
            System.out.println("Admin Logout successful");
        }
        else System.out.println("Admin Logout failed");
    }

    public boolean resetPassword(String username, String oldPassword, String newPassword)
    {
        if(this.username.equals(username) && this.password.equals(oldPassword) && this.loggedIn)
        {
            this.password = newPassword;
            System.out.println("Admin Password change successful");
            return true;
        }
        else
        {
            System.out.println("Admin Password change failed");
            return false;
        }
    }

    public void ban(UserAuthentication user)
    {
        if(this.loggedIn)
        {
            System.out.println("User Ban successful");
            user.username = "banned";
            user.password = "banned";
        }
    }
}