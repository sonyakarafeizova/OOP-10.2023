package interfaces_and_abstraction.birthday_celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthables=new ArrayList<>();
        String command= scanner.nextLine();
        while(!command.equals("End")){

            String type=command.split("\\s+")[0];
            String name=command.split("\\s+")[1];
            String birthdate;
            switch(type){
                case "Citizen":
                    int age = Integer.parseInt(command.split("\\s+")[2]);
                    String id = command.split("\\s+")[3];
                    birthdate = command.split("\\s+")[4];

                    Citizen citizen = new Citizen(name, age, id, birthdate);
                    birthables.add(citizen);
                    break;

                case "Pet":
                    birthdate = command.split("\\s+")[2];

                    Pet pet = new Pet(name, birthdate);
                    birthables.add(pet);
                    break;

            }
            command= scanner.nextLine();
        }

        String filteredYear = scanner.nextLine();

        birthables.stream()
                .map(Birthable::getBirthDate)
                .filter(b -> b.endsWith(filteredYear))
                .forEach(System.out::println);
    }
}


