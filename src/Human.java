import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Human {
    private String lastName;
    private String firstName;
    private String surname;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public Human() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter THROUGH THE SPACE: last name, first name, patronymic, date of birth(dd.mm.yyyy), phone number, gender(f or m).");
        String info = scanner.nextLine();
        String[] data = info.split(" ");
        if (data.length < 6){
            System.out.print("The data was entered incorrectly!");
        }

        this.lastName = data[0];
        this.firstName = data[1];
        this.surname = data[2];
        
        try{
            LocalDate birthDate;
            birthDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            this.dateOfBirth = data[3];
        }catch (Exception e){
            System.out.print("Invalid date of birth format.");
        }
        
        if(data[4].length() <= 11 && data[4].length() > 9){
            this.phoneNumber = data[4];
        }else{
            System.out.print("The phone number format is incorrect.");
        }
        
        if(data[5].equals("f") || data[5].equals("m")){
            this.gender = data[5];
        }else{
            System.out.print("The gender format is incorrect .");
        }
        
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    @Override

    public String toString() {

        return String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, surname, dateOfBirth, phoneNumber,
                gender);
    }

}
