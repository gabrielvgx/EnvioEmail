package enviaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviaEmail {

    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator("seuEmail", "suaSenha"));
        
        email.setStartTLSEnabled(true);
        email.setFrom("seuEmail");
        email.setSubject("Confirmação de Conta GERAL");
        email.setMsg("Ola, Gabriel Víctor, digite o código abaixo para validar sua conta no software GERAL"
                + "\n\nCódigo: 10395810958");
        email.addTo("emailDestinatario");
        email.send();

    }

}
