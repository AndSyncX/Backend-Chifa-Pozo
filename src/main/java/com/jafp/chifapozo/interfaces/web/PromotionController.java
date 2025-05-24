package com.jafp.chifapozo.interfaces.web;

import com.jafp.chifapozo.domain.model.Promotion;
import com.jafp.chifapozo.domain.services.PromotionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/promotions")
public class PromotionController {
    private final PromotionService promotionService;

    @GetMapping
    public List<Promotion> getAllPromotions() {
        return promotionService.getAllPromotions();
    }

    @GetMapping("/{id}")
    public Optional<Promotion> getPromotionById(@PathVariable Integer id) {
        return promotionService.getPromotionById(id);
    }

    @PostMapping
    public Promotion createPromotion(@RequestBody Promotion promotion) {
        return promotionService.createPromotion(promotion);
    }

    @DeleteMapping("/{id}")
    public void deletePromotion(@PathVariable Integer id) {
        promotionService.deletePromotion(id);
    }
}
