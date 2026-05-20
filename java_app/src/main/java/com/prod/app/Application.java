package com.prod.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/")
    public String home() {

        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Production Java App</title>

                <style>

                    body{
                        margin:0;
                        height:100vh;
                        display:flex;
                        justify-content:center;
                        align-items:center;
                        background:#0f172a;
                        color:white;
                        font-family:Arial;
                    }

                    .container{
                        text-align:center;
                        background:#1e293b;
                        padding:40px;
                        border-radius:16px;
                        box-shadow:0 0 20px rgba(0,0,0,0.4);
                    }

                    h1{
                        color:#22c55e;
                    }

                </style>
            </head>

            <body>

                <div class="container">

                    <h1>Java Docker Application Running</h1>

                    <p>Spring Boot + Maven + Java 17</p>

                </div>

            </body>
            </html>
        """;
    }

    @GetMapping("/health")
    public String health() {

        return "Application is Healthy";
    }
}
