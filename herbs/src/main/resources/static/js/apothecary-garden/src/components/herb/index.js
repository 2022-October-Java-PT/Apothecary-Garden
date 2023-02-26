// import PropTypes from 'prop-types';
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
import resceratrol from '../../assests/images/resveratrol.jpg';
import rooibosTea from '../../assests/images/rooibosTea.jpg';
import style from './style.module.scss';
import teaTreeOil from '../../assests/images/teaTreeOil.jpg';
import turmeric from '../../assests/images/turmeric.jpg';
import valerian from '../../assests/images/valerian.jpg';
import willowBark from '../../assests/images/willowBark.jpg';

export default function Herb({ name, science, description, fact, sideEffects, picture }) {

    let imgList = [aloevera, ahcc, alphaLipiocicAcid, chamomile, echinacea, elderBerry, folate, ginkgo, licorice, paopereira, papayaLeaf, resceratrol, rooibosTea, teaTreeOil, turmeric, valerian, willowBark];

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

    return (
        <div className={style.images}>
            <img className={style.herb_image} src={imageReturn(imgList, picture)} alt='' ></img>
            <h1 className={style.name}>{name}</h1>
            <section className={style.description}>
                <h2>Description</h2>
                <p>{description}</p>
               
            </section>
            <section className={style.expanded_details}>
                <h2>Side Effects</h2>
                <ul className={style.sideEffects_list}>
                    <li>{sideEffectList}</li>
                </ul>
                <h2>Fun Fact</h2>
                <p>{fact}</p>
                <h3>Research Link</h3>
                <p>Further information can be found <a className={style.link} target='_blank' rel='noreferrer' href={science}>Here</a></p>
            </section>
        </div>
    );
}