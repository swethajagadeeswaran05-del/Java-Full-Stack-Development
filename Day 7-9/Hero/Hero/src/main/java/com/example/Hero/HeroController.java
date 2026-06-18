package com.example.Hero;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/heroes")
public class HeroController {
    private List<Hero>heroes = new ArrayList<>();
    @GetMapping
    public List<Hero> getHeroes(){
        return heroes;
    }
    @PostMapping
    public Hero addHero(@RequestBody Hero hero){
        heroes.add(hero);
        return hero;
    }
}
