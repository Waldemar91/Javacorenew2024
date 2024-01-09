package resolvehw2.Task1;

public class Main {
    public static void main(String[] args) {
        //створити клас, який би описував подібні об'єкти
        //https://jsonplaceholder.typicode.com/users/1

        User<Integer, Double> user1 = new User<>(1, "name", "username", "email", "street", "suite",
                "city", "zipcode", -37.3159, 81.1496, "phone", "website",
                "company name", "catch phrase", "bs");
        System.out.println(user1);

        User<String, String> user2 = new User<>("2", "name2", "username2", "email2",
                new Address<>("street2", "suite2", "city2", "zipcode2",
                        new Geo<>("-37.3159", "81.1496")), "phone2", "website2",
                new Company("company name2", "catch phrase2", "bs2"));
        System.out.println(user2);

        // builder lombok
        User<Object, Object> user3 = User.builder().id(3).username("username3").email("email3").phone("phone3").build();
        System.out.println(user3);

        // custom builder
        User<String, String> user4 = User.getBuilder().setId("4").setUsername("username4").setEmail("email").setPhone("phone").build();
        System.out.println(user4);
    }
}
