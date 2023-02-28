import Morter from "../../assests/images/morterPestle.jpg"
import React from 'react';
import apothecray from '../../assests/images/apothecray.jpg';
import cheeseCloth from "../../assests/images/cheesecloth.jpg"
import darkBottles from "../../assests/images/darkBottles.jpg"
import doubleBoiler from "../../assests/images/doubleBoiler.jpg"
import freshHerbs from "../../assests/images/freshHerbs.jpg";
import funnels from "../../assests/images/funnels.jpg"
import herbalMedicine from "../../assests/images/herbalMedicine.jpg";
import herbalTea from "../../assests/images/herbalTea.jpg";
import herbsForStore from "../../assests/images/herbsForStore.jpg";
import jar from "../../assests/images/Jars.jpg"
import sproutingScreen from "../../assests/images/sproutingScreen.jpg"
import style from './style.module.scss';

const StoreHerbsPages = () => {

    return (
        <div  className={style.container}>

            <h1 className={style.heading}>Storing Herbs</h1>
            <section className={style.storingHerbs}>
            <div className={style.gallery}>
                <div className={style.box}>
                    <img src={herbsForStore} alt='' />
                    <h4>How to Store Herbs for Culinary & Medicinal Purposes</h4>
                    <p>Are you wondering how to store herbs so they last longer? Learn the best storage methods for fresh, dried, and powdered herbs.
                    Herbs are plants with culinary flavors and medicinal properties. As soon as the plant is harvested it starts to die and so does everything in it. Luckily there are ways to preserve the plant so that it can be stored and used later. However, you have to store the preserved plant materials so that there's no further loss of nutrition so that when you go to use them, there's as much nutrition available to you as possible.
                    The number one rule to storing herbs in a way that preserves as much of their medicinal properties as possible is to store them in a cool, dark, and dry place.
                    Moisture will cause herbs to mold, and light and heat will further diminish the health benefits  they have.</p>
                </div>
            </div>
            
            <div className={style.gallery}>
                <div className={style.box}>
                    <img src={freshHerbs} alt=''/>
                    <h4>How to Store Fresh Herbs</h4>  
                    <p>When not using fresh herbs immediately (whether in foods or in herbal preparations) they can be stored for a short time in the fridge. Cut herbs like basil, parsley, and cilantro can be kept in a bunch in a mason jar with an inch of water at the bottom or wrapped in a damp paper towel and sealed in a plastic bag in the crisper drawer.Stored in the refrigerator, flowers and plant tops will last 2-3 days, while barks and roots will stay good for 2-3 weeks. Be sure to store fresh herbs in labeled bags or jars and use them quickly.
                    Freezing works well for basil, chives, oregano, lemon balm, mint, or tarragon. Wash your fresh herbs and dry them on paper towels or with a salad spinner. Remove large woody stems and chop up the herbs and fill an ice cube tray with them. Top with olive oil and place them in the freezer. Once frozen, you can pop out the herb cubes and store them in a freezer bag.</p>
                </div>
            </div>
            
            <div className={style.gallery}>
                <div className={style.box}>
                    <img src={herbalMedicine} alt=''  />
                    <h4 >How to Store Dried Herbs</h4> 
                    <p>Dried herbs can last anywhere from 2-4 years if stored properly depending upon the type of herb.First of all, make sure you are drying the herbs completely or they will mold and ruin all of the herbs. A dehydrator will make easy work of drying your homegrown herbs. Store herbs in air-tight jars or plastic bags in a cool, dark, and dry spot.Freezing works well for basil, chives, oregano, lemon balm, mint, or tarragon. Wash your fresh herbs and dry them on paper towels or with a salad spinner. Remove large woody stems and chop up the herbs and fill an ice cube tray with them. Top with olive oil and place them in the freezer. Once frozen, you can pop out the herb cubes and store them in a freezer bag.</p>
                </div>
            </div>
            
            <div className={style.gallery}>
                <div className={style.box}>
                    <img src={apothecray} alt='' />
                    <h4>How to Store Powdered Herbs</h4>
                    <p>Tender herbs are easiest to store as powders. Once herbs are powdered, they will lose their freshness fairly quickly. Powdered herbs are best stored in glass jars wrapped in newspaper or some other opaque paper in the freezer or refrigerator. Chilled powdered herbs will last about 6 months.Powdered herbs left at room temperature should be kept in opaque glass jars. The shelf life of powdered herbs at room temperature is about 3 months.</p>
                </div>
            </div>
            
            <div className={style.gallery}>
                <div className={style.box}>
                    <img src={herbalTea} alt=''/>
                    <h4>Storing Herbal Preparations</h4>
                    <p>Once you've used your herbs in your own herbal remedies, whether it's a tea, tincture, or capsule, you still need to remember to store your preparation so that it will last.
                    Herbal teas can last up to two years if stored properly in an airtight container away from direct sunlight and moisture. However, the flavor of herbal teas can start to diminish after six months of storage.Herbal tinctures last about 3 years and preserve the freshness and potency of medicinal plants. Capsules have a one-year shelf life when stored at room temperature. If stored in the refrigerator or freezer, they can stay potent for even longer.
                    Remember that cool, dark, and dry is always best no matter what type of preparation it is because the longer your preparation is exposed to heat or light, the quicker the properties in it will break down.</p>
                </div>
            </div>
            </section>

            <h1 className={style.heading}>Tools For Herbalists</h1>
            <section className={style.tools}>
                <div className={style.box}>
                    <img src={cheeseCloth} alt='cheeseCloth' />
                    <h4>Cheesecloth</h4>
                    <p>It serves as a type of strainer for various herbal concoctions. When you’re making herbal infused oils, it helps remove every last drop of botanical goodness. And same goes for straining your tinctures, vinegars, or even nourishing herbal infusions.</p>
                </div>

                <div className={style.box}>
                    <img src={Morter} alt='morter&pestle' />
                    <h4>Mortar and Pestle</h4>
                    <p>Mortar and pestles are commonly used to grind herbs and spices, crush garlic, make pesto, and prepare dry rubs and marinades. They can also be used to grind grains, nuts, and seeds, and to crush pills for medication.</p>
                </div>

                <div className={style.box}>
                    <img src={funnels} alt='' />
                    <h4>Funnels</h4>
                    <p>Funnels are a simple but useful tool for herbalists that can save time and reduce the risk of spills or other mishaps when working with herbs. Using a funnel can help to ensure consistency in the preparation of herbal remedies, which is essential for maintaining their effectiveness. Funnel is generally easy to clean, which can be helpful for herbalists who need to prepare multiple remedies in a day. Funnel can speed up the preparation process for herbal remedies by allowing the herbalist to quickly transfer ingredients without any mess or waste.</p>
                </div>

                <div className={style.box}>
                    <img src={doubleBoiler} alt='' />
                    <h4>Double Boiler Insert</h4>
                    <p className={style.text}>A double boiler is instrumental for any recipe that requires melting. While you can certainly use a glass jar or measuring cup inside a pot, I much prefer to use a double boiler insert for ease and safety. This handy insert nests in your sauce pan, and has two pour spouts for trouble-free transfer. Regularly use this tool for melting down wax and herbal oils to make salves, creams, and lotions.</p>
                </div>

                <div className={style.box}>
                    <img src={sproutingScreen} alt='' />
                    <h4>Sprouting Screen</h4>
                    <p>  Sprouting screens can be a useful tool for herbalists who want to grow their own herbs for use in teas, tinctures, and other preparations. Sprouting screens are a versatile tool for herbalists that can be used for a variety of purposes, from growing microgreens to drying herbs. They are affordable, easy to use, and can help ensure good results when growing and preparing herbs at home.</p>
                </div>
                
                <div className={style.box}>
                    <img src={jar} alt='' />
                    <h4>Jars</h4>
                    <p> Jars are an excellent way to store dried herbs, tinctures, salves, and other herbal preparations. Glass jars are ideal because they do not absorb or release flavors, odors, or chemicals like plastic containers can. Jars also keep herbs dry and protected from light, which can help preserve their potency and flavor.</p>
                </div>

                <div className={style.box}>
                    <img src={darkBottles} alt='' />
                    <h4>Dark Glass Dropper Bottles</h4>
                    <p>Dark glass dropper bottles are small bottles made of dark-colored glass, typically amber or cobalt blue, that are used for storing and dispensing herbal tinctures, essential oils, and other liquid herbal preparations. They typically have a small dropper or pipette attached to the lid, which allows for precise dosing of the liquid.The dark color of the glass is important because it helps to protect the contents of the bottle from light. Light can cause oxidation and degradation of many herbal preparations, which can reduce their potency and effectiveness over time. Dark glass filters out a large percentage of UV rays, which can help to prevent this type of degradation and prolong the shelf life of the preparation.</p>
                </div>
            </section>

        </div>
    )
};

export default StoreHerbsPages;