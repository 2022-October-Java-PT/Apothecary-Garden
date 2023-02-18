import React from "react";

class HerbFavorite extends React.Component {
  render() {
    const fav = this.props.herbsfav.map(item => (
        <div className="list_herb" key={herb.id}>
            <div className="herb_name">
                <h3>{herb.name}</h3>
                <button onClick={() => this.props.delete(herb.id)}>Delete from Favorite</button>
            </div>
        </div>
    ));
    return (
      <div>
        <h2>Favorites</h2>
        {fav}
      </div>
    );
  }
}

export default HerbFavorite;