import React, { useEffect, useState } from 'react';

import Axios from 'axios';
import style from './style.module.scss';
import { useParams } from 'react-router-dom';

const HerbPage = () => {

    const { name } = useParams();
    const [herb, setHerb] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(() => {
        const fetchHerbData = async () => {
            const result = await Axios(`http://localhost:8080/api/herbs/HerbName/${name}`);
            setHerb(result.data); 
        }
        
        if (herb) {
            setLoading(false);
        }

        const timer = setTimeout(() => {
            !herb && fetchHerbData();
        }, 100);

        return () => clearTimeout(timer);
        // eslint-disable-next-line
    }, [herb])
    
    return (
        <div className={style.content}>
            
            {loading ? <h3>Loading...</h3> :
                <div key={herb.id}>
                    <h1 className={style.herb_name}>{herb.name}</h1>
                    <button onClick={() => this.props.add(herb.id)}>Add to Fav</button>
                    <h2>Description</h2>
                    <p className={style.herb_description}>{herb.description}</p>
                    <h2>Side Effects</h2>
                    <ul className={style.sideEffects_list}>
                        <li>{herb.sideEffects}</li>
                    </ul>
                    <h2>Fun Fact</h2>
                    <p className={style.herb_fact}>{herb.fact}</p>
                    <h3>Research Link</h3>
                    <p>Further information can be found <a className={style.link} target='_blank' rel='noreferrer' href={herb.science}>Here</a></p>
                </div>
            }
        </div>
    );
}

export default HerbPage;

