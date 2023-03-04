import 'reactjs-popup/dist/index.css';

import Disclaimer from "./disclaimer";
import HerbSpotlight from './herbSpotlight';
import React from "react";
import style from "./style.module.scss";

const HomePage = () => {
    const [open, setOpen] = React.useState(true)
    return(
        <div className={style.homeContent}>
            <div className={style.home_body}>
                {/* <h1>Herbal Medicine History</h1> */}
                <p className={style.home_blurb}><em>"Providing information on Herbal Medicines and home use since 2023..."</em>
                </p>
                <section className={style.spotlight_section}>
                <h2 className={style.spotlight_header}>Herb Spotlight</h2>
                <HerbSpotlight />
                </section>
            </div>
            <button className={style.disclaimer_button} onClick={() => setOpen(true)}>Disclaimer</button>
            <Disclaimer setOpen={setOpen} open={open} />
            

        </div>
    )
}

export default HomePage;