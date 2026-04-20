package com.pluralsight;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "The most common way people give up their power is by thinking they don't have any. — Alice Walker",
                "Define yourself as one who is beautifully made, and divinely placed. — Oprah Winfrey",
                "I am not free while any woman is unfree, even when her shackles are very different from my own. — Audre Lorde",
                "You don't make progress by standing on the sidelines, whimpering and complaining. You make progress by implementing ideas. — Shirley Chisholm",
                "Your silence will not protect you. — Audre Lorde",
                "I love to see a young girl go out and grab the world by the lapels. Life's a bitch. You've got to go out and kick ass. — Maya Angelou",
                "Success is liking yourself, liking what you do, and liking how you do it. — Maya Angelou",
                "If you have no confidence in self, you are twice defeated in the race of life. — Marcus Garvey (often echoed by Black women leaders)",
                "I have learned over the years that when one's mind is made up, this diminishes fear. — Rosa Parks",
                "Don't sit down and wait for the opportunities to come. Get up and make them. — Madam C.J. Walker"
        };

        Scanner scanner = new Scanner(System.in);
        boolean seeSaying = true;

        do {
        System.out.print("Enter a number between 1 and 10 to display a quote: ");
        int userChoice;

        try {
            userChoice = scanner.nextInt();
            System.out.println(quotes[userChoice-1]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This number doesn't exist!");
            continue;
        }

        System.out.println("Do you want to see another quote? (true/false)");
        boolean userSaying = scanner.nextBoolean();

        if (!userSaying){
            seeSaying = false;
        }

    } while (seeSaying);
    }
}
