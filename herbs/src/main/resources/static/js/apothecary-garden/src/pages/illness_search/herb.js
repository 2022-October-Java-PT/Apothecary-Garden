import PropTypes from 'prop-types'
import React from 'react';
import style from './style.module.scss'

const Herb = ({name, science, description, fact, sideEffects}) => {
    return (
        <div className={style.images}>
            <p className={style.name}>{name}</p>
            <a target='_blank' rel='noreferrer' href={science}>Research Link</a>
            <h2>Description</h2>
            <p>{description}</p>
            <h2>Facts</h2>
            <p>{fact}</p>
            <h2>Side Effects</h2>
            <p>{sideEffects}</p>
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