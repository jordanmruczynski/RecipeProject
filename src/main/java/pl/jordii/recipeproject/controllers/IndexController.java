package pl.jordii.recipeproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jordii.recipeproject.domain.Category;
import pl.jordii.recipeproject.repositories.CategoryRepository;
import pl.jordii.recipeproject.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        Optional<Category> category = categoryRepository.findByDescription("Polish");

        System.out.println("=================");
        System.out.println(category.get().getId());
        System.out.println("=================");

        return "index";
    }
}
