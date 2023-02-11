import PropTypes from 'prop-types'
import React from 'react';
import style from './style.module.scss'

const Herb = ({name, science, description, fact, sideEffects, picture}) => {
    const sideEffectList = sideEffects.map((effect) => 
        <li>{effect}</li>
    );
    return (
        <div className={style.images}>
            <h1 className={style.name}>{name}</h1>
            <section className={style.description}>
                <h2>Description</h2>
                <p>{description}</p>
                <img className={style.herb_image} src={`../../assets/images/${picture}`}></img>
            </section>
            <section className={style.expanded_details}>
                <h2>Side Effects</h2>
                <ul className={style.sideEffects_list}>
                    <li>{sideEffectList}</li>
                </ul>
                <h2>Fun Fact</h2>
                <p>{fact}</p>
                <h3>Research Link</h3>
                <p>Further information can be found <a target='_blank' rel='noreferrer' href={science}>Here</a></p>
            </section>
        </div>
    );
};

Herb.propTypes = {
    name: PropTypes.string,
    science: PropTypes.string,
    description: PropTypes.string,
    fact: PropTypes.string,
    sideEffects: PropTypes.string,
};

export default Herb;