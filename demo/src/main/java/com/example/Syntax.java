// Dependent Object: UserDetails
class UserDetails {

  private String username;
  private int age;

  // Getters and setters...

  @Override
  public String toString() {
    return "UserDetails{username='" + username + "', age=" + age + '}';
  }
}

// Composite Entity: UserProfile
class UserProfile {

  private UserDetails userDetails = new UserDetails();

  public void setUserProfile(String username, int age) {
    userDetails.setUsername(username);
    userDetails.setAge(age);
  }

  public UserDetails getUserDetails() {
    return userDetails;
  }
}

// Client
public class CompositeEntityPatternExample {

  public static void main(String[] args) {
    UserProfile userProfile = new UserProfile();

    // Set user profile data through the unified interface
    userProfile.setUserProfile("JohnDoe", 25);

    // Retrieve user details through the unified interface
    UserDetails userDetails = userProfile.getUserDetails();
    System.out.println("User Profile: " + userDetails);
  }
}
