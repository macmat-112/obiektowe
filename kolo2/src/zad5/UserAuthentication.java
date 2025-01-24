package zad5;

public class UserAuthentication implements Authentication
{
    public String username;
    public String password;
    public boolean loggedIn;

    public UserAuthentication(String a, String b)
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
            System.out.println("User Login successful");
            return true;
        }
        else
        {
            System.out.println("User Login failed");
            return false;
        }
    }

    public void logout()
    {
        if(this.loggedIn)
        {
            this.loggedIn = false;
            System.out.println("User Logout successful");
        }
        else System.out.println("User Logout failed");
    }

    public boolean resetPassword(String username, String oldPassword, String newPassword)
    {
        if(this.username.equals(username) && this.password.equals(oldPassword) && this.loggedIn)
        {
            this.password = newPassword;
            System.out.println("User Password change successful");
            return true;
        }
        else
        {
            System.out.println("User Password change failed");
            return false;
        }
    }
}
