import React, {useEffect, useState} from "react";

import Axios from 'axios';
import style from './style.module.scss';

const Herbs = () => {

    const [herbs, setHerbs] = useState(null);
    const [loading, setLoading] = useState(true);

    useEffect(()=>{

        const fetchHerbsData = async () => {
            const result = await Axios('http://localhost:8080/api/herbs');
            setHerbs(result.data);
        }

        if(herbs) {
            setLoading(false);
        }

        const timer = setTimeout(() => {
            !herbs && fetchHerbsData();
        }, 1000);

        return () => clearTimeout(timer);

    }, [herbs]);

    return (
        <div className={style.container}>
        <div className={style.herb_link}>
        <h2>HERB CATALOG</h2>
        </div>
            <div className={style.herb_section}>
            {loading ? <h3>Loading...</h3> : herbs.map(herb => (
                <a key={herb.id} href={`herbs/${herb.name}`}>
                <div className={style.herb_section}>
                    <h2>{herb.name}</h2>
                </div>
                </a>
            ))}
            </div>
        </div>  
    );
}

export default Herbs;