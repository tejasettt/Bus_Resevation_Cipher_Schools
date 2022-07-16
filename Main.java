package org.example;

public class Main {
    public static void main(String[] args) {

        LoginSignup loginSignup = new LoginSignup();
        UserOperation userOperation = new UserOperation();
        AdminOperations adminOperations = new AdminOperations();
//        Signing up into the portal
        System.out.println(loginSignup.signup("teja",528639417,"teja1@gmail","siva","csp","ap","1234567890"));
        System.out.println(loginSignup.signup("Rocky",52863417,"teja2@gmail","siva","csp","ap","1234567890"));
        System.out.println(loginSignup.signup("teja",528639417,"teja3@gmail","siva","csp","ap","1234567890"));
//        Logging in into the portal
        System.out.println(loginSignup.login("teja1@gmail","1234567890"));
        System.out.println(loginSignup.login("teja2@gmail","1234567890"));
//        Creating new bus details
        adminOperations.createBus("AP 21 CG 3281","self","AP","Delhi");
        adminOperations.createBus("AP 71 CG 1234","driver","UP","HYD");
//        updating username
        userOperation.updateUserName("teja2@gmail","Rocky");
//        displaying the updated username
        System.out.println(userOperation.findUser("teja2@gmail"));
    }
}