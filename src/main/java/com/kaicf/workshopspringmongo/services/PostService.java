package com.kaicf.workshopspringmongo.services;

import com.kaicf.workshopspringmongo.domain.Post;
import com.kaicf.workshopspringmongo.repositories.PostRepository;
import com.kaicf.workshopspringmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return repository.searchTitle(text);
    }
}
