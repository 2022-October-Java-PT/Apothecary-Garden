import PropTypes from 'prop-types'
import React from 'react';
import style from './style.module.scss'

const Herb = ({name, science, description}) => {
    return (
        <div className={style.images}>
            <p className={style.name}>{name}</p>
            <a target='_blank' rel='noreferrer' href={science}>Research Link</a> 
            <p>{description}</p>
        </div>
    );
};

Herb.propTypes = {
    name: PropTypes.string,
    science: PropTypes.string,
    description: PropTypes.string
};

export default Herb;