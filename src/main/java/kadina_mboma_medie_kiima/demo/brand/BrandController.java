package kadina_mboma_medie_kiima.demo.brand;


import kadina_mboma_medie_kiima.demo.Category.Category;
import kadina_mboma_medie_kiima.demo.Category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BrandController {
    @Autowired
    private BrandRepository brandRepo;

    @Autowired
    private CategoryRepository categoryRepo;

    @GetMapping("/brands/new")
    public String showCreateNewBrandForm(Model model){
        List<Category> listCategories =  categoryRepo.findAll();
        model.addAttribute("listCategories",listCategories);
        model.addAttribute("brand",new Brand());

        return "brand_form";
    }

}
