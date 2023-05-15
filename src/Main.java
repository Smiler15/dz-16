import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();


        try {
            bankApplication.process("accountId001", 50, "USD");
            bankApplication.process("accountId003", 250, "HRV");
            bankApplication.process("accountId001", 50, "EUR");
            bankApplication.process("accountId001", 50, "USD");
            bankApplication.process("accountId001", 50, "USD");

        } catch (WrongAccountException e) {
            System.out.println("Such account doesn't exist");
        } catch (WrongCurrencyException e) {
            System.out.println("Account has another currency");
        } catch (WrongOperationException e) {
            System.out.println("Account doesn't have enough money");
        } catch (Exception e) {
            System.out.println("Error in processing, try again");

        } finally {
            System.out.println("Thank for using our service");
        }

    }
}