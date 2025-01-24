package zad5;

public interface Authentication
{
    public abstract boolean login(String username, String password);

    public abstract void logout();

    public abstract boolean resetPassword(String username, String oldPassword, String newPassword);
}
