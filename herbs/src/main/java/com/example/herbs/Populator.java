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
        Illness infections = new Illness("Infections");
        Illness jointPain = new Illness("Joint Pain");
        Illness cold = new Illness("Cold");
        Illness flu = new Illness("Flu");
        Illness gastrointestinal = new Illness("Gastrointestinal");
        Illness hepatitis = new Illness("Hepatitis");
        Illness pepticUlcers = new Illness("Peptic Ulcers");
        Illness bronchitis = new Illness("Bronchitis");
        Illness insomnia = new Illness("Insomnia (trouble falling asleep, staying asleep, or waking up too early)");
        Illness diarrhea = new Illness("Diarrhea");
        Illness muscleSpasms = new Illness("Muscle Spasms");
        Illness menopausalSymptoms = new Illness("Menopausal Symptoms");
        Illness dengueFever = new Illness("Dengue Fever");
        Illness fever = new Illness("Fever");
        Illness malaria = new Illness("Malaria");
        Illness liverPain = new Illness("Liver pain");

        illnessRepo.save(arthritis);
        illnessRepo.save(memoryLoss);
        illnessRepo.save(burns);
        illnessRepo.save(tinnitus);
        illnessRepo.save(circulatoryDisorders);
        illnessRepo.save(inflammation);
        illnessRepo.save(rashes);
        illnessRepo.save(infections);
        illnessRepo.save(jointPain);
        illnessRepo.save(cold);
        illnessRepo.save(flu);
        illnessRepo.save(gastrointestinal);
        illnessRepo.save(hepatitis);
        illnessRepo.save(pepticUlcers);
        illnessRepo.save(bronchitis);
        illnessRepo.save(insomnia);
        illnessRepo.save(diarrhea);
        illnessRepo.save(muscleSpasms);
        illnessRepo.save(menopausalSymptoms);
        illnessRepo.save(dengueFever);
        illnessRepo.save(fever);
        illnessRepo.save(malaria);
        illnessRepo.save(liverPain);


        //List of Illnesses for different herbs
        List<Illness> ginkgoIllnesses = new ArrayList<>();
        ginkgoIllnesses.add(circulatoryDisorders);
        ginkgoIllnesses.add(memoryLoss);
        ginkgoIllnesses.add(tinnitus);

        List<Illness> aloeVeraIllnesses = new ArrayList<>();
        aloeVeraIllnesses.add(inflammation);
        aloeVeraIllnesses.add(burns);
        aloeVeraIllnesses.add(rashes);

        List<Illness> turmericIllnesses = new ArrayList<>();
        turmericIllnesses.add(infections);
        turmericIllnesses.add(inflammation);
        turmericIllnesses.add(jointPain);

        List<Illness> elderBerryIllnesses = new ArrayList<>();
        elderBerryIllnesses.add(cold);
        elderBerryIllnesses.add(flu);
        elderBerryIllnesses.add(inflammation);

        List<Illness> licoriceIllnesses = new ArrayList<>();
        licoriceIllnesses.add(gastrointestinal);
        licoriceIllnesses.add(pepticUlcers);
        licoriceIllnesses.add(hepatitis);
        licoriceIllnesses.add(bronchitis);
        licoriceIllnesses.add(inflammation);

        List<Illness> chamomileIllnesses = new ArrayList<>();
        chamomileIllnesses.add(insomnia);
        chamomileIllnesses.add(diarrhea);

        List<Illness> valerianIllnesses = new ArrayList<>();
        valerianIllnesses.add(insomnia);
        valerianIllnesses.add(muscleSpasms);
        valerianIllnesses.add(menopausalSymptoms);

        List<Illness> echinaceaIllnesses = new ArrayList<>();
        echinaceaIllnesses.add(cold);
        echinaceaIllnesses.add(flu);

        List<Illness> papayaLeafIllnesses = new ArrayList<>();
        papayaLeafIllnesses.add(dengueFever);

        List<Illness> paoPereiraIllnesses = new ArrayList<>();
        paoPereiraIllnesses.add(fever);
        paoPereiraIllnesses.add(malaria);
        paoPereiraIllnesses.add(liverPain);

        //List of Side effects of each herb
        ArrayList<String> ginkgoSideEffects = new ArrayList<>();
        ginkgoSideEffects.add("Low sodium");
        ginkgoSideEffects.add("May increase your risk of bleeding.");
        ginkgoSideEffects.add("Can increase your risk of seizures.");

        ArrayList<String> aloeVeraSideEffects = new ArrayList<>();
        aloeVeraSideEffects.add("It’s generally safe to use aloe vera as a gel on your skin");

        ArrayList<String> turmericSideEffects = new ArrayList<>();
        turmericSideEffects.add("Abdominal pain/discomfort");
        turmericSideEffects.add("Skin rash");
        turmericSideEffects.add("Hives");

        ArrayList<String> elderBerrySideEffects = new ArrayList<>();
        elderBerrySideEffects.add("These are the side effects if you eat raw elderberries: ");
        elderBerrySideEffects.add("Dizziness (feeling faint, woozy, weak, or unsteady)");
        elderBerrySideEffects.add("Numbness (loss of feeling or sensation in a part of your body )");
        elderBerrySideEffects.add("Vomiting (throwing up)");
        elderBerrySideEffects.add("Nausea (feeling like you’re going to throw up)");

        ArrayList<String> licoriceSideEffects = new ArrayList<>();
        licoriceSideEffects.add("High blood pressure");
        licoriceSideEffects.add("Lethargy (lack of energy)");
        licoriceSideEffects.add("Muscle pain");
        licoriceSideEffects.add("Cardiac arrhythmia (irregular heartbeat)");
        licoriceSideEffects.add("High sodium retention");
        licoriceSideEffects.add("Low blood levels of potassium");
        licoriceSideEffects.add("Reduced desire to have sex");
        licoriceSideEffects.add("Decreased oil on your scalp");
        licoriceSideEffects.add("Low blood platelet count");
        licoriceSideEffects.add("Heavy licorice use can cause early pre-term births");

        ArrayList<String> chamomileSideEffects = new ArrayList<>();
        chamomileSideEffects.add("Asthma (respiratory condition which makes it difficult to breathe)");
        chamomileSideEffects.add("Contact dermatitis (red, itchy rash)");
        chamomileSideEffects.add("Anaphylaxis (a serious allergic reaction)");

        ArrayList<String> valerianSideEffects = new ArrayList<>();
        valerianSideEffects.add("Bitter taste");
        valerianSideEffects.add("Daytime drowsiness/dullness");
        valerianSideEffects.add("Depression");
        valerianSideEffects.add("Diarrhea");
        valerianSideEffects.add("Dizziness");
        valerianSideEffects.add("Headache");
        valerianSideEffects.add("Heart palpitations");
        valerianSideEffects.add("Impaired alertness");
        valerianSideEffects.add("Irritability");
        valerianSideEffects.add("Liver toxicity");
        valerianSideEffects.add("Sweating");

        ArrayList<String> echinaceaSideEffects = new ArrayList<>();
        echinaceaSideEffects.add("HeadAche");
        echinaceaSideEffects.add("Dizziness");
        echinaceaSideEffects.add("Nausea (feeling like you’re going to throw up)");
        echinaceaSideEffects.add("Constipation (having fewer bowel movements than usual)");
        echinaceaSideEffects.add("Mild stomach pain");
        echinaceaSideEffects.add("Skin rash");

        ArrayList<String> papayaLeafSideEffects = new ArrayList<>();
        papayaLeafSideEffects.add("Mild gastrointestinal disturbance");
        papayaLeafSideEffects.add("Rash");

        ArrayList<String> paoPereiraSideEffects = new ArrayList<>();
        paoPereiraSideEffects.add("Be careful taking as studies are still lacking");

        //List of herbs
        Herbs ginkgo = new Herbs("Ginkgo","Ginkgo biloba is one of the oldest living species of trees. Its seeds and leaves are used in traditional Chinese medicine. Ginkgo also comes as capsules, extracts, tablets, and tea.","The Ginkgo tree is considered a living fossil, with fossils dating from 270 million years ago. These trees can live up to 3,000 years.","","https://www.mskcc.org/cancer-care/integrative-medicine/herbs/ginkgo", ginkgoIllnesses, ginkgoSideEffects);
        herbsRepo.save(ginkgo);

        Herbs aloeVera = new Herbs("Aloe Vera", "Aloe vera is a succulent plant that’s used in traditional medicine. The clear gel from its leaves can be put on the skin as a moisturizer and to treat burns.","Native americans utilized aloe for a multitude of benefits and referred to it as The Wand Of Heaven.","","https://www.mskcc.org/cancer-care/integrative-medicine/herbs/aloe-vera",aloeVeraIllnesses, aloeVeraSideEffects);
        herbsRepo.save(aloeVera);

        Herbs turmeric = new Herbs("Turmeric", "Turmeric is a plant that’s common in South Asia but is grown around the world. The underground part of the stem is a spice that has been used in cooking for hundreds of years. It is used in traditional medicine for many health issues.", "Turmeric is an ancient spice that has been used in Asia for culinary, as well as medical applications for approximately 2,500 years.", "", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/turmeric", turmericIllnesses, turmericSideEffects);
        herbsRepo.save(turmeric);

        Herbs elderBerries = new Herbs("ElderBerry", "Elderberry is the dark purple berry that comes from the European or black elder tree. Elderberry has many nutrients. It’s used to make jams, syrups, and wine. Both elderberry flowers and fruits are used to help reduce cold and flu symptoms.", "Raw or unripe elderberries have chemicals that can be harmful. It’s important to cook them well before eating.", "", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/elderberry-01", elderBerryIllnesses, elderBerrySideEffects);
        herbsRepo.save(elderBerries);

        Herbs licorice = new Herbs("Licorice", "Licorice comes from the root of the licorice plant. It’s commonly used to flavor and sweeten foods and drinks. The herb is also an important part of traditional Chinese medicine and traditional Indian medicine, known as Ayurveda.","Manuscripts from 360 A.D. talk of licorice helping eye ailments, skin diseases, coughs, and loss of hair. Alexander the Great and Julius Caesar are on record as endorsing the benefits of eating licorice. Since the 14th century, it has been used to soothe coughs, colds, and bronchitis.","", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/licorice", licoriceIllnesses, licoriceSideEffects);
        herbsRepo.save(licorice);

        Herbs chamomile = new Herbs("Chamomile", "Chamomile is an herb used in traditional medicine for its relaxing and calming effects. It’s mostly taken as herbal tea. You can also take chamomile capsules or tablets.", "Chamomile grows in the form of small shrub that usually reaches 8 to 12 inches in height. German chamomile grows to the height of 3 feet.", "", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/chamomile-german", chamomileIllnesses, chamomileSideEffects);
        herbsRepo.save(chamomile);

        Herbs valerian = new Herbs("Valerian", "Valerian is sold as a dietary supplement for calmness and to improve sleep quality. It has a distinct odor that some may find unpleasant. In lab studies, valerian extract appears to have calming effects related to the nervous system. Studies in humans suggest valerian products have a modest effect on sleep quality.", "Valerian has been used medicinally since the times of early Greece and Rome. Historically, valerian was used to treat insomnia, migraine, fatigue, and stomach cramps.", "", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/valerian", valerianIllnesses, valerianSideEffects);
        herbsRepo.save(valerian);

        Herbs echinacea = new Herbs("Echinacea", "Echinacea is a plant that belongs to the sunflower family. It’s commonly used in herbal medicine. Echinacea also comes as capsules, pills, tablets, or liquid extracts.", "These plants are also called coneflowers. The petals may be pink or purple, depending on the species, and they surround a seed head, or cone, that is spiky and dark brown or red.", "","https://www.mskcc.org/cancer-care/integrative-medicine/herbs/echinacea", echinaceaIllnesses, echinaceaSideEffects);
        herbsRepo.save(echinacea);

        Herbs papayaLeaf = new Herbs("Papaya-Leaf", "The papaya tree is common to many tropical regions of the world. Papaya leaves and their extracts are sold as dietary supplements to improve the immune system and increase platelet counts.", "Lab studies showed that papaya leaf extracts have antibacterial effects. A few clinical studies found benefits of papaya leaf extract in treating dengue fever and in increasing platelet counts.", "", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/papaya-leaf", papayaLeafIllnesses, papayaLeafSideEffects);
        herbsRepo.save(papayaLeaf);

        Herbs paoPereira = new Herbs("Pao pereira", "Pao pereira is a tree native to the northern part of South America. Preparations made from the stem bark are used in folk medicine as sexual stimulants and to treat malaria, digestive disorders, constipation, fever, liver pain, and cancer. Preclinical studies suggest the bark extracts have antimalarial and pain-relieving properties, may help improve cognition, and may also have anticancer effects, but studies in humans are lacking.", "This property is being explored as a potential treatment for Alzheimer’s disease.", "", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/pao-pereira", paoPereiraIllnesses, paoPereiraSideEffects);
        herbsRepo.save(paoPereira);
    }
}
