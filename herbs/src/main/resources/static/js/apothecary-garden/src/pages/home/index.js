import 'reactjs-popup/dist/index.css';

import Disclaimer from "./disclaimer";
import HerbSpotlight from './herbSpotlight';
import React from "react";
import style from "./style.module.scss";

const HomePage = () => {
    const [open, setOpen] = React.useState(true)
    return(
        <div className={style.homeContent}>
            <div>
                <h1>Herbal Medicine History</h1>
                <p>Archaeological evidence indicates that the use of medicinal plants dates back to the Paleolithic age, approximately 60,000 years ago. Written evidence of herbal remedies dates back over 5,000 years to the Sumerians, who compiled lists of plants.
                </p>
            <HerbSpotlight />
        </div>
            <button className={style.disclaimer_button} onClick={() => setOpen(true)}>Disclaimer</button>
            <Disclaimer setOpen={setOpen} open={open} />
        </div>
    )
}

export default HomePage;