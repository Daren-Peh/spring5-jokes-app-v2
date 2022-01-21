package guru.springframework.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public interface JokeService {
    ChuckNorrisQuotes getRandomQuote();
}
