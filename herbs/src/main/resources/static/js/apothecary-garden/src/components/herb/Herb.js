// import PropTypes from 'prop-types';

import FavoriteButton from '../favoritebutton/FavoriteButton';
import React from 'react';
import ahcc from '../../assests/images/ahcc.jpg';
import aloevera from '../../assests/images/aloevera.jpg';
import alphaLipiocicAcid from '../../assests/images/alphaLipiocicAcid.jpg';
import chamomile from '../../assests/images/chamomile.jpg';
import echinacea from '../../assests/images/echinacea.jpg';
import elderBerry from '../../assests/images/elderBerry.jpg';
import folate from '../../assests/images/folate.jpg';
import ginkgo from '../../assests/images/ginkgo.jpg';
import licorice from '../../assests/images/licorice.jpg';
import paopereira from '../../assests/images/paopereira.jpg';
import papayaLeaf from '../../assests/images/papayaLeaf.jpg';
import resveratrol from '../../assests/images/resveratrol.jpg';
import rooibosTea from '../../assests/images/rooibosTea.jpg';
import style from './Herb.module.scss';
import teaTreeOil from '../../assests/images/teaTreeOil.jpg';
import turmeric from '../../assests/images/turmeric.jpg';
import valerian from '../../assests/images/valerian.jpg';
import willowBark from '../../assests/images/willowBark.jpg';

export default function Herb({ id, name, science, description, fact, sideEffects, picture }) {

    let imgList = [aloevera, ahcc, alphaLipiocicAcid, chamomile, echinacea, elderBerry, folate, ginkgo, licorice, paopereira, papayaLeaf, resveratrol, rooibosTea, teaTreeOil, turmeric, valerian, willowBark];

    function imageReturn(array, requiredImage) {
        let returnedImage;
        array.forEach(element => {
            if(element.includes(requiredImage)){
                returnedImage = element;
            }
        });
        return returnedImage;
    }

    const sideEffectList = sideEffects.map((effect) => 
        <li>{effect}</li>
    );

    // return (
    //     <div className={style.images}>
    //         <img className={style.herb_image} src={imageReturn(imgList, picture)} alt='' ></img>
    //         <h1 className={style.name}>{name}</h1>
    //         <div >
    //             <FavoriteButton herbName={name} id={id} />
    //         </div>
    //         <section className={style.description}>
    //             <h2>Description</h2>
    //             <p>{description}</p>
               
    //         </section>
    //         <section className={style.expanded_details}>
    //             <h2>Side Effects</h2>
    //             <ul className={style.sideEffects_list}>
    //                 <li>{sideEffectList}</li>
    //             </ul>
    //             <h2>Fun Fact</h2>
    //             <p>{fact}</p>
    //             <h3>Research Link</h3>
    //             <p>Further information can be found <a className={style.link} target='_blank' rel='noreferrer' href={science}>Here</a></p>
    //         </section>
    //     </div>
    // );

    return (
       <div className={style.herb_container}>
           <div className={style.name_button_container}>
               <h1 className={style.herb_name}>{name}</h1>
               <div className={style.favorite_button}>
                   <FavoriteButton herbName={name} id={id} />
               </div>
           </div>
           <div className={style.image_data_container}>
               <img className={style.herb_image} src={imageReturn(imgList, picture)} alt='' ></img>
               <div className={style.right_container}>
                   <section className={style.description_container}>
                       <h2 className={style.description_heading}>DESCRIPTION:</h2>
                       <p className={style.description}>{description}</p> 
                   </section>
                   <section className={style.sideEffectList_container}>
                       <h2 className={style.sideEffects_listTitle}>SIDE EFFECTS:</h2>
                       <ul className={style.sideEffects_list}>
                           <li className={style.sideEffects_item}>{sideEffectList}</li>
                       </ul>
                   </section>
                   <section className={style.funFact_container}>
                       <h2 className={style.funFact_title}>FUN FACT:</h2>
                       <p className={style.funFact}>{fact}</p>
                   </section>
                   <section className={style.researchLink_container}>
                       {/* <h3 className={style.researchLink_title}>Research Link</h3> */}
                       <p className={style.researchLink}>Further information can be found <a className={style.link} target='_blank' rel='noreferrer' href={science}>here.</a></p>
                   </section>
               </div>
           </div>
       </div>
   );
}
