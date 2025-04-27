package com.example.emailSender.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class emailService {
    @Autowired
    private JavaMailSender JavaMailSender;

    public void basicEmail() {
        try {
            //destinatario
            String addressMail = "correodestino@gmail.com";
            //asunto
            String subject = "Este es un correo de prueba";
            //cuerpo de correo
            String bodyMail = "Correo prueba";

            emailSender(addressMail, subject, bodyMail);
            
        } catch (Exception e) {

        }
    }

    public void advancedEmail(String addressMail) {
        try {
            // destinatario
            // String addressMail = "cjcs.cadenasarasty8@gmail.com";
            // Asunto
            String subject = "Este es un correo de prueba";
            // Cuerpo Correo
            String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Correo de Prueba</title>\n"
            + "    <style>\n"
            + "        body {\n"
            + "            font-family: Arial, sans-serif;\n"
            + "            background-color: #f4f4f4;\n"
            + "            margin: 0;\n"
            + "            padding: 0;\n"
            + "        }\n"
            + "        .correo-container {\n"
            + "            background-color: #ffffff;\n"
            + "            max-width: 600px;\n"
            + "            margin: 40px auto;\n"
            + "            padding: 30px;\n"
            + "            border-radius: 8px;\n"
            + "            box-shadow: 0 0 8px rgba(0, 0, 0, 0.1);\n"
            + "        }\n"
            + "        h2 {\n"
            + "            color: #333333;\n"
            + "        }\n"
            + "        p {\n"
            + "            font-size: 16px;\n"
            + "            color: #555555;\n"
            + "        }\n"
            + "        .btn {\n"
            + "            display: inline-block;\n"
            + "            margin-top: 20px;\n"
            + "            padding: 12px 20px;\n"
            + "            background-color: #007BFF;\n"
            + "            color: white;\n"
            + "            text-decoration: none;\n"
            + "            border-radius: 5px;\n"
            + "        }\n"
            + "        .footer {\n"
            + "            margin-top: 30px;\n"
            + "            font-size: 12px;\n"
            + "            color: #aaaaaa;\n"
            + "            text-align: center;\n"
            + "        }\n"
            + "    </style>\n"
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"correo-container\">\n"
            + "        <h2>¡Hola, Juan!</h2>\n"
            + "        <p>Este es un correo de prueba enviado desde nuestra aplicación de Spring Boot.</p>\n"
            + "        <p>Haz clic en el botón a continuación para visitar nuestro sitio:</p>\n"
            + "        <a href=\"https://www.ejemplo.com\" class=\"btn\">Ir al sitio</a>\n"
            + "        <div class=\"footer\">\n"
            + "            © 2025 Tu Empresa. Todos los derechos reservados.\n"
            + "        </div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    String estiloBase = ""
    + "<style>\n"
    + "    body {\n"
    + "        font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;\n"
    + "        background-color: #f2f4f8;\n"
    + "        margin: 0;\n"
    + "        padding: 0;\n"
    + "    }\n"
    + "    .correo-container {\n"
    + "        background-color: #ffffff;\n"
    + "        max-width: 600px;\n"
    + "        margin: 50px auto;\n"
    + "        padding: 40px;\n"
    + "        border-radius: 10px;\n"
    + "        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);\n"
    + "    }\n"
    + "    h2 {\n"
    + "        color: #2c3e50;\n"
    + "        font-size: 24px;\n"
    + "        margin-bottom: 20px;\n"
    + "    }\n"
    + "    p {\n"
    + "        font-size: 16px;\n"
    + "        color: #555555;\n"
    + "        line-height: 1.6;\n"
    + "    }\n"
    + "    .btn {\n"
    + "        display: inline-block;\n"
    + "        margin-top: 25px;\n"
    + "        padding: 14px 24px;\n"
    + "        background-color: #3498db;\n"
    + "        color: #ffffff;\n"
    + "        text-decoration: none;\n"
    + "        border-radius: 6px;\n"
    + "        font-size: 16px;\n"
    + "        transition: background-color 0.3s ease;\n"
    + "    }\n"
    + "    .btn:hover {\n"
    + "        background-color: #2980b9;\n"
    + "    }\n"
    + "    .footer {\n"
    + "        margin-top: 40px;\n"
    + "        font-size: 13px;\n"
    + "        color: #999999;\n"
    + "        text-align: center;\n"
    + "    }\n"
    + "</style>\n";

    public void newAccountEmail(String addressMail) {
        try {
            String subject = "Cuenta Creada - RetroVision";
            String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Cuenta Creada - RetroVision</title>\n"
            + estiloBase
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"correo-container\">\n"
            + "        <h2>¡Bienvenido a RetroVision!</h2>\n"
            + "        <p>Tu cuenta ha sido creada exitosamente. Disfruta de nuestro catálogo de películas clásicas, actores y reseñas.</p>\n"
            + "        <a href=\"http://127.0.0.1:5500/frontend/index.html\" class=\"btn\">Explorar ahora</a>\n"
            + "        <div class=\"footer\">© 2025 RetroVision. Todos los derechos reservados.</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    public void RecoverPasswordEmail(String addressMail) {
        try {
            String subject = "Recuperación de contraseña - RetroVision";
            String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Recuperar Contraseña - RetroVision</title>\n"
            + estiloBase
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"correo-container\">\n"
            + "        <h2>¿Olvidaste tu contraseña?</h2>\n"
            + "        <p>No te preocupes. Haz clic en el siguiente botón para restablecerla:</p>\n"
            + "        <a href=\"http://127.0.0.1:5500/frontend/changePassword.html\" class=\"btn\">Restablecer Contraseña</a>\n"
            + "        <div class=\"footer\">© 2025 RetroVision. Todos los derechos reservados.</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    public void codeActivationEmail(String addressMail) {
        try {
            String subject = "Código de activación - RetroVision";
            String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Activar Cuenta - RetroVision</title>\n"
            + estiloBase
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"correo-container\">\n"
            + "        <h2>Activa tu cuenta</h2>\n"
            + "        <p>Usa el siguiente código para activar tu cuenta: </p>\n"
            + "        <h3 style=\"text-align:center; color:#007BFF;\">6789</h3>\n"
            + "        <div class=\"footer\">© 2025 RetroVision. Todos los derechos reservados.</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    public void changedPasswordEmail(String addressMail) {
        try {
            String subject = "Contraseña cambiada - RetroVision";
            String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Contraseña Actualizada - RetroVision</title>\n"
            + estiloBase
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"correo-container\">\n"
            + "        <h2>Contraseña Actualizada</h2>\n"
            + "        <p>Tu contraseña ha sido actualizada exitosamente.</p>\n"
            + "        <p>Si no realizaste este cambio, por favor contáctanos de inmediato.</p>\n"
            + "        <div class=\"footer\">© 2025 RetroVision. Todos los derechos reservados.</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    public void lowStockEmail(String addressMail) {
        try {
            String subject = "Producto bajo stock - RetroVision";
            String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Stock Bajo - RetroVision</title>\n"
            + estiloBase
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"correo-container\">\n"
            + "        <h2>¡Producto en bajo stock!</h2>\n"
            + "        <p>Algunos de tus productos están por agotarse.</p>\n"
            + "        <a href=\"http://127.0.0.1:5500/frontend/inventory.html\"><button>Ir a Inventario</button></a>\n"
            + "        <div class=\"footer\">© 2025 RetroVision. Todos los derechos reservados.</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    public void purchaseEmail(String addressMail) {
        try {
            String subject = "Compra realizada - RetroVision";
            String bodyMail = ""
            + "<!DOCTYPE html>\n"
            + "<html lang=\"es\">\n"
            + "<head>\n"
            + "    <meta charset=\"UTF-8\">\n"
            + "    <title>Compra Confirmada - RetroVision</title>\n"
            + estiloBase
            + "</head>\n"
            + "<body>\n"
            + "    <div class=\"correo-container\">\n"
            + "        <h2>¡Gracias por tu compra!</h2>\n"
            + "        <p>Hemos recibido tu pedido. Aquí están los detalles:</p>\n"
            + "        <ul style=\"font-size: 16px; color: #555555;\">\n"
            + "            <li>La Noche de los Muertos Vivientes (1968) - $60,000</li>\n"
            + "            <li>Star Wars: Episodio IV - Una Nueva Esperanza (1977) - $70,000</li>\n"
            + "            <li>El Exorcista (1973) - $50,000</li>\n"
            + "        </ul>\n"
            + "        <h3>Total de tu compra: $180,000 COP</h3>\n"
            + "        <p>Te notificaremos cuando tu pedido esté en camino.</p>\n"
            + "        <div class=\"footer\">© 2025 RetroVision. Todos los derechos reservados.</div>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>";
            emailSender(addressMail, subject, bodyMail);
        } catch (Exception e) {

        }
    }

    public boolean emailSender(String addressMail, String subject, String bodyMail) throws MessagingException {
        try {
            MimeMessage message = JavaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(addressMail);
            helper.setSubject(subject);
            helper.setText(bodyMail, true);
            JavaMailSender.send(message);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
