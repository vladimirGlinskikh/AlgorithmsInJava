package arrayExample;

import javax.swing.*;

public class New {
    public static void main(String[] args) {
        int yearNow, yearBorn, userAge;
        String userData;
        userData = JOptionPane.showInputDialog("Какой сейчас год?");
        yearNow = Integer.parseInt(userData);
        userData = JOptionPane.showInputDialog("В каком году ты родился?");
        yearBorn = Integer.parseInt(userData);
        userAge = yearNow - yearBorn;
        JOptionPane.showConfirmDialog(null, "Ваш возраст: " + userAge);
    }
}
