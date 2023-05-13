package br.com.thonwelling.apilinguagens.repositories;

import br.com.thonwelling.apilinguagens.models.Linguagem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinguagemRepository extends MongoRepository<Linguagem, String> {
}
