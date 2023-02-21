package com.example.herbs;

import com.example.herbs.models.AppUser;
import com.example.herbs.models.Herbs;
import com.example.herbs.models.Illness;
import com.example.herbs.repositories.HerbsRepo;
import com.example.herbs.repositories.IllnessRepo;
import com.example.herbs.repositories.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private UserRepo userRepo;

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
        Illness heartDisease = new Illness("Heart Disease");
        Illness diabetes = new Illness("Diabetes");
        Illness eczema = new Illness("Eczema");
        Illness alzheimers = new Illness("Alzheimers");
        Illness acne = new Illness("Acne");
        Illness nervePain = new Illness("Nerve Pain");
        Illness liverDisease = new Illness("Liver Disease");

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
        illnessRepo.save(heartDisease);
        illnessRepo.save(diabetes);
        illnessRepo.save(eczema);
        illnessRepo.save(alzheimers);
        illnessRepo.save(acne);
        illnessRepo.save(nervePain);
        illnessRepo.save(liverDisease);


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

        List<Illness> resveratrolIllnesses = new ArrayList<>();
        resveratrolIllnesses.add(heartDisease);
        resveratrolIllnesses.add(diabetes);
        resveratrolIllnesses.add(jointPain);

        List<Illness> roobibosTeaIllnesses = new ArrayList<>();
        roobibosTeaIllnesses.add(eczema);

        List<Illness> willowBarkIllnesses = new ArrayList<>();
        willowBarkIllnesses.add(fever);
        willowBarkIllnesses.add(jointPain);

        List<Illness> folateIllnesses = new ArrayList<>();
        folateIllnesses.add(heartDisease);
        folateIllnesses.add(alzheimers);

        List<Illness> teaTreeOilIllnesses = new ArrayList<>();
        teaTreeOilIllnesses.add(infections);
        teaTreeOilIllnesses.add(inflammation);
        teaTreeOilIllnesses.add(acne);

        List<Illness> ahccIllnesses = new ArrayList<>();
        ahccIllnesses.add(infections);

        List<Illness> alphaLipoicAcidIllnesses = new ArrayList<>();
        alphaLipoicAcidIllnesses.add(nervePain);
        alphaLipoicAcidIllnesses.add(liverDisease);

        //List of Side effects of each herb
        ArrayList<String> ginkgoSideEffects = new ArrayList<>();
        ginkgoSideEffects.add("Low sodium\n");
        ginkgoSideEffects.add("May increase your risk of bleeding.\n");
        ginkgoSideEffects.add("Can increase your risk of seizures.\n");

        ArrayList<String> aloeVeraSideEffects = new ArrayList<>();
        aloeVeraSideEffects.add("It’s generally safe to use aloe vera as a gel on your skin");

        ArrayList<String> turmericSideEffects = new ArrayList<>();
        turmericSideEffects.add("Abdominal pain/discomfort\n");
        turmericSideEffects.add("Skin rash\n");
        turmericSideEffects.add("Hives\n");

        ArrayList<String> elderBerrySideEffects = new ArrayList<>();
        elderBerrySideEffects.add("These are the side effects if you eat raw elderberries: ");
        elderBerrySideEffects.add("Dizziness (feeling faint, woozy, weak, or unsteady)\n");
        elderBerrySideEffects.add("Numbness (loss of feeling or sensation in a part of your body)\n");
        elderBerrySideEffects.add("Vomiting (throwing up)\n");
        elderBerrySideEffects.add("Nausea (feeling like you’re going to throw up)\n");

        ArrayList<String> licoriceSideEffects = new ArrayList<>();
        licoriceSideEffects.add("High blood pressure\n");
        licoriceSideEffects.add("Lethargy (lack of energy)\n");
        licoriceSideEffects.add("Muscle pain\n");
        licoriceSideEffects.add("Cardiac arrhythmia (irregular heartbeat)\n");
        licoriceSideEffects.add("High sodium retention\n");
        licoriceSideEffects.add("Low blood levels of potassium\n");
        licoriceSideEffects.add("Reduced desire to have sex\n");
        licoriceSideEffects.add("Decreased oil on your scalp\n");
        licoriceSideEffects.add("Low blood platelet count\n");
        licoriceSideEffects.add("Heavy licorice use can cause early pre-term births\n");

        ArrayList<String> chamomileSideEffects = new ArrayList<>();
        chamomileSideEffects.add("Asthma (respiratory condition which makes it difficult to breathe)\n");
        chamomileSideEffects.add("Contact dermatitis (red, itchy rash)\n");
        chamomileSideEffects.add("Anaphylaxis (a serious allergic reaction)\n");

        ArrayList<String> valerianSideEffects = new ArrayList<>();
        valerianSideEffects.add("Bitter taste\n");
        valerianSideEffects.add("Daytime drowsiness/dullness\n");
        valerianSideEffects.add("Depression\n");
        valerianSideEffects.add("Diarrhea\n");
        valerianSideEffects.add("Dizziness\n");
        valerianSideEffects.add("Headache\n");
        valerianSideEffects.add("Heart palpitations\n");
        valerianSideEffects.add("Impaired alertness\n");
        valerianSideEffects.add("Irritability\n");
        valerianSideEffects.add("Liver toxicity\n");
        valerianSideEffects.add("Sweating\n");

        ArrayList<String> echinaceaSideEffects = new ArrayList<>();
        echinaceaSideEffects.add("HeadAche\n");
        echinaceaSideEffects.add("Dizziness\n");
        echinaceaSideEffects.add("Nausea (feeling like you’re going to throw up)\n");
        echinaceaSideEffects.add("Constipation (having fewer bowel movements than usual)\n");
        echinaceaSideEffects.add("Mild stomach pain\n");
        echinaceaSideEffects.add("Skin rash");

        ArrayList<String> papayaLeafSideEffects = new ArrayList<>();
        papayaLeafSideEffects.add("Mild gastrointestinal disturbance\n");
        papayaLeafSideEffects.add("Rash");

        ArrayList<String> paoPereiraSideEffects = new ArrayList<>();
        paoPereiraSideEffects.add("Be careful taking as studies are still lacking");

        ArrayList<String> resveratrolSideEffects = new ArrayList<>();
        resveratrolSideEffects.add("Side effects of high doses of resveratrol may include:\n");
        resveratrolSideEffects.add("Nausea (feeling like you’re going to throw up).\n");
        resveratrolSideEffects.add("Passing gas.\n");
        resveratrolSideEffects.add("Abdominal (stomach) pain.\n");
        resveratrolSideEffects.add("Diarrhea (loose or watery bowel movements).\n");

        ArrayList<String> rooibosTeaSideEffects = new ArrayList<>();
        rooibosTeaSideEffects.add("Liver toxicity and low platelet count: In a 37-year-old patient about to undergo laparoscopic surgery. The cause was identified as long-term large amounts of rooibos daily. The procedure was switched to open surgery instead, to reduce the number of medications that would have to be metabolized by the liver.\n");
        rooibosTeaSideEffects.add("Elevated liver enzymes: In a 42-year-old woman who drank large amounts of rooibos tea. Liver enzyme levels normalized within 1 week after stopping ingestion.");

        ArrayList<String> willowBarkSideEffects = new ArrayList<>();
        willowBarkSideEffects.add("Stomach or intestinal discomfort, allergic reaction, sudden rash, or itching.\n");
        willowBarkSideEffects.add("Salicin in willow bark may affect blood clotting. The clinical significance in patients with impaired platelet functioning is yet to be determined.\n");

        ArrayList<String> folateSideEffects = new ArrayList<>();
        folateSideEffects.add("It’s generally safe to eat foods that are rich in folate. Talk to your doctor before taking supplements.");

        ArrayList<String> teaTreeOilSideEffects = new ArrayList<>();
        teaTreeOilSideEffects.add("Topical: Local skin irritation, itching, redness, and swelling; breast tissue enlargement in boys with application of lavender and tea tree oils.\n");
        teaTreeOilSideEffects.add("Oral: Disorientation, systemic body rash, abnormal white blood cell counts, and coma.");

        ArrayList<String> ahccSideEffects = new ArrayList<>();
        ahccSideEffects.add("Diarrhea (loose or watery bowel movements)\n");
        ahccSideEffects.add("Mild itching");

        ArrayList<String> alphaLipoicAcidSideEffects = new ArrayList<>();
        alphaLipoicAcidSideEffects.add("Nausea (feeling like you’re going to throw up)\n");
        alphaLipoicAcidSideEffects.add("Vomiting (throwing up)\n");
        alphaLipoicAcidSideEffects.add("Low blood sugar level\n");

        AppUser testUser = new AppUser("John Smith", "password");
        userRepo.save(testUser);

        //List of herbs
        Herbs ginkgo = new Herbs("Ginkgo","Ginkgo biloba is one of the oldest living species of trees. Its seeds and leaves are used in traditional Chinese medicine. Ginkgo also comes as capsules, extracts, tablets, and tea.","The Ginkgo tree is considered a living fossil, with fossils dating from 270 million years ago. These trees can live up to 3,000 years.","ginkgo","https://www.mskcc.org/cancer-care/integrative-medicine/herbs/ginkgo", ginkgoIllnesses, ginkgoSideEffects);
        herbsRepo.save(ginkgo);

        Herbs aloeVera = new Herbs("Aloe Vera", "Aloe vera is a succulent plant that’s used in traditional medicine. The clear gel from its leaves can be put on the skin as a moisturizer and to treat burns.","Native americans utilized aloe for a multitude of benefits and referred to it as The Wand Of Heaven.", "aloevera", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/aloe-vera", aloeVeraIllnesses, aloeVeraSideEffects);
        herbsRepo.save(aloeVera);

        Herbs turmeric = new Herbs("Turmeric", "Turmeric is a plant that’s common in South Asia but is grown around the world. The underground part of the stem is a spice that has been used in cooking for hundreds of years. It is used in traditional medicine for many health issues.", "Turmeric is an ancient spice that has been used in Asia for culinary, as well as medical applications for approximately 2,500 years.", "tumeric", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/turmeric", turmericIllnesses, turmericSideEffects);
        herbsRepo.save(turmeric);

        Herbs elderBerries = new Herbs("ElderBerry", "Elderberry is the dark purple berry that comes from the European or black elder tree. Elderberry has many nutrients. It’s used to make jams, syrups, and wine. Both elderberry flowers and fruits are used to help reduce cold and flu symptoms.", "Raw or unripe elderberries have chemicals that can be harmful. It’s important to cook them well before eating.", "elderBerry", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/elderberry-01", elderBerryIllnesses, elderBerrySideEffects);
        herbsRepo.save(elderBerries);

        Herbs licorice = new Herbs("Licorice", "Licorice comes from the root of the licorice plant. It’s commonly used to flavor and sweeten foods and drinks. The herb is also an important part of traditional Chinese medicine and traditional Indian medicine, known as Ayurveda.","Manuscripts from 360 A.D. talk of licorice helping eye ailments, skin diseases, coughs, and loss of hair. Alexander the Great and Julius Caesar are on record as endorsing the benefits of eating licorice. Since the 14th century, it has been used to soothe coughs, colds, and bronchitis.","licorice", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/licorice", licoriceIllnesses, licoriceSideEffects);
        herbsRepo.save(licorice);

        Herbs chamomile = new Herbs("Chamomile", "Chamomile is an herb used in traditional medicine for its relaxing and calming effects. It’s mostly taken as herbal tea. You can also take chamomile capsules or tablets.", "Chamomile grows in the form of small shrub that usually reaches 8 to 12 inches in height. German chamomile grows to the height of 3 feet.", "chamomile", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/chamomile-german", chamomileIllnesses, chamomileSideEffects);
        herbsRepo.save(chamomile);

        Herbs valerian = new Herbs("Valerian", "Valerian is sold as a dietary supplement for calmness and to improve sleep quality. It has a distinct odor that some may find unpleasant. In lab studies, valerian extract appears to have calming effects related to the nervous system. Studies in humans suggest valerian products have a modest effect on sleep quality.", "Valerian has been used medicinally since the times of early Greece and Rome. Historically, valerian was used to treat insomnia, migraine, fatigue, and stomach cramps.", "valerian", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/valerian", valerianIllnesses, valerianSideEffects);
        herbsRepo.save(valerian);

        Herbs echinacea = new Herbs("Echinacea", "Echinacea is a plant that belongs to the sunflower family. It’s commonly used in herbal medicine. Echinacea also comes as capsules, pills, tablets, or liquid extracts.", "These plants are also called coneflowers. The petals may be pink or purple, depending on the species, and they surround a seed head, or cone, that is spiky and dark brown or red.", "echinacea","https://www.mskcc.org/cancer-care/integrative-medicine/herbs/echinacea", echinaceaIllnesses, echinaceaSideEffects);
        herbsRepo.save(echinacea);

        Herbs papayaLeaf = new Herbs("Papaya-Leaf", "The papaya tree is common to many tropical regions of the world. Papaya leaves and their extracts are sold as dietary supplements to improve the immune system and increase platelet counts.", "Lab studies showed that papaya leaf extracts have antibacterial effects. A few clinical studies found benefits of papaya leaf extract in treating dengue fever and in increasing platelet counts.", "papayaLeaf", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/papaya-leaf", papayaLeafIllnesses, papayaLeafSideEffects);
        herbsRepo.save(papayaLeaf);

        Herbs paoPereira = new Herbs("Pao pereira", "Pao pereira is a tree native to the northern part of South America. Preparations made from the stem bark are used in folk medicine as sexual stimulants and to treat malaria, digestive disorders, constipation, fever, liver pain, and cancer. Preclinical studies suggest the bark extracts have antimalarial and pain-relieving properties, may help improve cognition, and may also have anticancer effects, but studies in humans are lacking.", "This property is being explored as a potential treatment for Alzheimer’s disease.", "paopereira", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/pao-pereira", paoPereiraIllnesses, paoPereiraSideEffects);
        herbsRepo.save(paoPereira);

        Herbs resveratrol = new Herbs("Resceratrol", "Resveratrol is a chemical found in grapes, red wine, peanuts, pistachios, blueberries, and cranberries.", "Resveratrol is a compound present in grapes. It is most well-known for its presence in red wine. The popularity of this compound is attributed to a phenomenon called the “French Paradox”, which refers to the low incidence of cardiovascular disease among the French population despite their high intake of dietary fat. ", "resveratrol", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/resveratrol", resveratrolIllnesses, resveratrolSideEffects);
        herbsRepo.save(resveratrol);

        Herbs rooibosTea = new Herbs("Rooibos-Tea", "Lab studies suggest rooibos tea contains compounds that may prevent tumor growth and slow aging, but studies on this have not been conducted in humans. Some compounds isolated from rooibos leaves showed estrogenic activity. Therefore, patients with hormone-sensitive cancers should use caution before taking rooibos.", "Rooibos tea has antioxidant effects and may interfere with the action of certain chemotherapeutic agents.", "rooibosTea", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/rooibos-tea", roobibosTeaIllnesses, rooibosTeaSideEffects);
        herbsRepo.save(rooibosTea);

        Herbs willowBark = new Herbs("Willow-Bark", "Willow bark is commonly used to treat pain and reduce fevers. It contains a compound called salicin that has been shown to have anti-inflammatory effects. Several studies suggest willow bark extracts can help reduce back pain and osteoarthritis.", "Although aspirin is developed from salicin, a direct comparison between aspirin benefits and willow bark benefits cannot be made. At the same time, aspirin-like side effects may occur with willow bark.", "willowBark", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/willow-bark", willowBarkIllnesses, willowBarkSideEffects);
        herbsRepo.save(willowBark);

        Herbs folate = new Herbs("Folate", "Folate is a chemical that you need for healthy cell growth and function. It’s also needed for making red blood cells.", "Folate is found in foods such as dark green leafy vegetables, eggs, dairy products, liver, Brussels sprouts, potatoes, chickpeas, nuts, beans, and poultry. It’s also added to some breakfast cereals, flours, and breads.", "folate", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/folate",  folateIllnesses, folateSideEffects);
        herbsRepo.save(folate);

        Herbs teaTreeOil = new Herbs("Tea Tree Oil", "Tea tree oil is the essential oil distilled from Melaleuca alternifolia, a plant native to Australia. It has been used in traditional medicine for its antiseptic and anti-inflammatory properties to treat various skin conditions and infections.", "It is also a popular ingredient in skin and hair products. In lab studies, tea tree oil killed several bacteria and fungi most commonly found in skin infections and acne.", "teaTreeOil", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/tea-tree-oil", teaTreeOilIllnesses, teaTreeOilSideEffects);
        herbsRepo.save(teaTreeOil);

        Herbs ahcc = new Herbs("AHCC (Active Hexose Correlated Compound)", "Active Hexose Correlated Compound (AHCC) is a group of chemicals that are taken from fungi, like mushrooms, and turned into a supplement. People take this supplement to help their immune system.", "AHCC is the world’s most researched specialty immune supplement. Derived from healing mushrooms, this functional food provides immune system support for people living with and without illness.", "ahcc", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/ahcc", ahccIllnesses, ahccSideEffects);
        herbsRepo.save(ahcc);

        Herbs alphaLipoicAcid = new Herbs("Alpha-Lipioic-Acid", "Alpha-lipoic acid is a chemical your body makes. It’s also found in foods such as red meat, spinach, broccoli, tomatoes, peas, Brussel sprouts, and rice bran.", "Alpha-lipoic acid is a fatty acid found naturally inside every cell of the human body. Its primary role is to convert blood sugar (glucose) into energy using oxygen. Many people use it to help with diabetes, nerve pain, weight loss, heart disease, and primary mitochondrial disorders.", "alphaLipiocicAcid", "https://www.mskcc.org/cancer-care/integrative-medicine/herbs/alpha-lipoic-acid", alphaLipoicAcidIllnesses, alphaLipoicAcidSideEffects);
        herbsRepo.save(alphaLipoicAcid);


    }
}
