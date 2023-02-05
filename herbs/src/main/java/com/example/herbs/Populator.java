package com.example.herbs;

import com.example.herbs.models.Herbs;
import com.example.herbs.models.Illness;
import com.example.herbs.repositories.HerbsRepo;
import com.example.herbs.repositories.IllnessRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private HerbsRepo herbsRepo;

    @Resource
    private IllnessRepo illnessRepo;

    @Override
    public void run(String... args) throws Exception {

        //Illness Section
        Illness arthritis = new Illness("Arthritis");
        Illness memoryLoss = new Illness("Memory Loss");
        Illness burns = new Illness("Burns");
        Illness tinnitus = new Illness("Tinnitus");
        Illness circulatoryDisorders  = new Illness("Circulatory Disorders");
        Illness inflammation = new Illness("Inflammation");
        Illness rashes = new Illness("Rashes");

        illnessRepo.save(arthritis);
        illnessRepo.save(memoryLoss);
        illnessRepo.save(burns);
        illnessRepo.save(tinnitus);
        illnessRepo.save(circulatoryDisorders);
        illnessRepo.save(inflammation);
        illnessRepo.save(rashes);

        //List of Illnesses for different herbs
        List<Illness> ginkgoIllnesses = new ArrayList<>();
        ginkgoIllnesses.add(circulatoryDisorders);
        ginkgoIllnesses.add(memoryLoss);
        ginkgoIllnesses.add(tinnitus);

        List<Illness> aloeVeraIllnesses = new ArrayList<>();
        aloeVeraIllnesses.add(inflammation);
        aloeVeraIllnesses.add(burns);
        aloeVeraIllnesses.add(rashes);

        //List of Side effects of each herb
        ArrayList<String> ginkgoSideEffects = new ArrayList<>();
        ginkgoSideEffects.add("Low sodium");
        ginkgoSideEffects.add("May increase your risk of bleeding.");
        ginkgoSideEffects.add("Can increase your risk of seizures.");

        ArrayList<String> aloeVeraSideEffects = new ArrayList<>();
        aloeVeraSideEffects.add("It’s generally safe to use aloe vera as a gel on your skin");

        //List of herbs
        Herbs ginkgo = new Herbs("Ginkgo","Ginkgo biloba is one of the oldest living species of trees. Its seeds and leaves are used in traditional Chinese medicine. Ginkgo also comes as capsules, extracts, tablets, and tea.","The Ginkgo tree is considered a living fossil, with fossils dating from 270 million years ago. These trees can live up to 3,000 years.","","https://www.mskcc.org/cancer-care/integrative-medicine/herbs/ginkgo", ginkgoIllnesses, ginkgoSideEffects);
        herbsRepo.save(ginkgo);

        Herbs aloeVera = new Herbs("Aloe Vera", "Aloe vera is a succulent plant that’s used in traditional medicine. The clear gel from its leaves can be put on the skin as a moisturizer and to treat burns.","Native americans utilized aloe for a multitude of benefits and referred to it as The Wand Of Heaven.","","https://www.mskcc.org/cancer-care/integrative-medicine/herbs/aloe-vera",aloeVeraIllnesses, aloeVeraSideEffects);
        herbsRepo.save(aloeVera);
    }
}
