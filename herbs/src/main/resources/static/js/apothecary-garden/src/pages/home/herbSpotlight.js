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
import style from './style.module.scss';
import teaTreeOil from '../../assests/images/teaTreeOil.jpg';
import turmeric from '../../assests/images/turmeric.jpg';
import valerian from '../../assests/images/valerian.jpg';
import willowBark from '../../assests/images/willowBark.jpg';

export default class HerbSpotlight extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            name: "",
            description: "",
            fact: "",
            picture: "",
        };

        this.newSearch = this.newSearch.bind(this);
    }

    componentDidMount() {
        this.newSearch();
    }

    newSearch() {
        fetch("http://localhost:8080/api/herbs/herbSpotlight")
            .then((response) => response.json())
            .then((data) => {
                this.setState({
                    name: data.name,
                    description: data.description,
                    fact: data.fact,
                    picture: data.picture,
                });
            });
    }
    

    render() {
        let name = this.state.name;
        let description = this.state.description;
        let fact = this.state.fact;
        let picture = this.state.picture;
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
            return (
                <div className={style.herSpotlight}>
                    <h1 className={style.HerbName}>{name}</h1>
                    <p className={style.HerbFact}>{fact}</p>
                    <img className={style.herb_image} src={imageReturn(imgList, picture)} alt='HerbImg' ></img>
                    {/* <p className={style.HerbFact}>{description}</p> */}
                    {/* <button onClick={this.newSearch}>New Herb</button> */}
                </div>
            );
        }
    }    