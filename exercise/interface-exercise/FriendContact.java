public class FriendContact implements Contact {
    private String name;
    private String number;

    public FriendContact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void getName() {
        System.out.println("name: " + name);
    };

    public void getPhoneNumber() {
        System.out.println("Phone number: " + number);

    };

    public void displayContacInfo() {
        System.out.println("name: " + name);
        System.out.println("Phone number: " + number);
    };
}
