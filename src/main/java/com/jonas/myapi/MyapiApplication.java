package com.jonas.myapi;

import com.jonas.myapi.domain.Usuario;
import com.jonas.myapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyapiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Usuario user1 = new Usuario(null,"jonas","jonaslima", "12");
        Usuario user2 = new Usuario(null,"jonas","jonaslima", "122");

        usuarioRepository.saveAll(Arrays.asList(user1, user2));

    }
}
