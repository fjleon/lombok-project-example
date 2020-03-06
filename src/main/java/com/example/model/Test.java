package com.example.model;

public class Test {

    /**
     * Example of Lombok annotations.
     */
    public static void main(String[] args) {
	// Use of @Builder
	User user1 = User.builder()
			.firstName("john")
			.lastName("smith")
			.email("example@mail.com")
			.build();

	User user2 = User.builder().firstName("sarah").lastName("smith").email("another@mail.com").build();

	// Use of @AllArgsConstructor
	User user3 = new User("john", "smith", "example@mail.com");

	// Use of @NoArgsConstructor
	User user4 = new User();

	// Use of @ToString
	System.out.println("User 1: " + user1);
	System.out.println("User 2: " + user2);
	System.out.println("User 3: " + user3);
	System.out.println("User 4: " + user4);

	// Use of @EqualsAndHashCode
	System.out.println("Equals user 1 and user 2? " + user1.equals(user2));
	System.out.println("Equals user 1 and user 3? " + user1.equals(user3));
	System.out.println("HashCode user 1: " + user1.hashCode());
	System.out.println("HashCode user 2: " + user2.hashCode());

	// Use of @Getter and @Setter
	user1.setEmail("another_user1@mail.com");
	System.out.println("User 1: " + user1.getEmail());
    }

}
