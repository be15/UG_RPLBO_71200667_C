package com.ug11;

public class App 
{
    public static void main(String[] args) throws UsernameException, EmailException, LoginException, PasswordException
    {
        System.out.println("Selamat datang di Toko Beatrix");
        System.out.println("Silahkan daftarkan diri kamu untuk dapat mengakses menu di Toko Beatrix");
        char user = System.console().readLine("Username: ");
        String username = new String(user);
        try{
            if(username.isEmpty()){
                throw new UsernameException(1);
            }else if(username.length() < 6){
                throw new UsernameException(2);
            }
        }catch(UsernameException e){
            System.out.println("Maaf, " + e.getErrorMessage());
        }
        char[] mail = System.console().readLine("Email: ");
        String email = new String(mail);
        try{
            if(email.isEmpty()){
                throw new EmailException(1);
            }else (email.){
                throw new EmailException(2);
            }
        }catch (EmailException e){
            System.out.println("Maaf, " + e.getErrorMessage());
        }
        char[] pass = System.console().readPassword("Password: ");
        String password = new String(pass);
        try {
            if(password.isEmpty()){
                throw new PasswordException(1);
            }else if(password.length() < 7){
                throw new PasswordException(2);
            }else if(password.equals(username)){
                throw new PasswordException(4);
            }else if{
                boolean flagKecil = false;
                boolean flagBesar= false;
                boolean flagAngka = false;
                for(int i = 0; i < password.length();i++){
                    char c = password.charAt(i);
                    if(Character.isLetter(c) &&
                    Character.isLowerCase(c))
                        flagKecil = true;
                    if(Character.isLetter(c) &&
                            Character.isUpperCase(c))
                        flagBesar = true;
                    if(Character.isDigit(c))
                        flagAngka = true;
                } if(!(flagKecil && flagAngka && flagBesar)){
                    throw new PasswordException(3);
                }
            }
        }catch (PasswordException e){
            System.out.println("Maaf, " + e.getErrorMessage());
        }

    }
}
