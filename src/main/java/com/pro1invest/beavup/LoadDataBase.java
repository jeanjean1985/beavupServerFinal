package com.pro1invest.beavup;

import com.pro1invest.beavup.model.*;
import com.pro1invest.beavup.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDataBase {
    @Bean
    CommandLineRunner initDb(PostRepo postRepo, UserRepo userRepo, AvisRepo avisRepo, CommentaireRepo commentaireRepo, CompetenceRepo competenceRepo, ContactRepo contactRepo, ImagePostRepo imagePostRepo, MessageRepo messageRepo) {


        return args -> {

            postRepo.save(new Post(1, "descritoion du post", "liege", 1, 1));

            userRepo.save(new User("jeanjean", "cecic est une description complete d'un profil", "jean@jean.com", "", 1));
            userRepo.save(new User("jean marie ", "cecic est 2 description complete d'un profil", "jean2@jean.com", "", 2));

            commentaireRepo.save(new Commentaire(2, 1, "commentaires d'un post"));

            avisRepo.save(new Avis(2, 1, 3, "mon premier avis est bon "));

            contactRepo.save(new Contact(2, 1));
            contactRepo.save(new Contact(1, 2));

            imagePostRepo.save(new ImagePost((long) 2, "image/userid-postid"));
            imagePostRepo.save(new ImagePost((long) 1, "image/userid-postid"));
            imagePostRepo.save(new ImagePost((long) 1, "image/userid-postid"));

            messageRepo.save(new Message(2, 1, "salut ca va ?"));
            messageRepo.save(new Message(1, 2, "salut ca va ?"));
            messageRepo.save(new Message(2, 1, "salut ca va ?"));
            messageRepo.save(new Message(1, 2, "salut ca va ?"));

            competenceRepo.save(new Competence("Electricien"));

        };

    }

}
