import {React, useEffect, useState} from "react";
import Axios from 'axios';
import { getUsername } from "../../../components/common";
import style from './style.module.scss'

const PortalHome = () => {

    const userName = getUsername(); 
    const [loading, setLoading] = useState(true);
    const [herbs, setHerbs] = useState(null);   

    useEffect(() => {
        const fetchData = async () => {
            const herbsData = await Axios(`http://localhost:8080/api/${userName}/herbs`);
            
            setHerbs(herbsData.data);
            console.log(herbsData.data);
        }

        if (herbs) {
            setLoading(false);
        }

        const timer = setTimeout(() => {
        !herbs && fetchData() ;
        }, 1000);
        return () => clearTimeout(timer);

    }, [herbs]);

    return (
        <div className={style.portHomeMain}>
            <section className={style.portHome}>
                <h1>Portal Page works</h1>
            </section> 
            
        </div>
    )
}

export default PortalHome;