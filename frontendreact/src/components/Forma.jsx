
import React from 'react';
import '../dist/LoginDm.css';
import { Link } from 'react-router-dom';

 


import Flippy, { FrontSide, BackSide } from 'react-flippy';



export default class Tipo extends React.Component {
  renderFlippy(imageURL,name){
    return (
      <Flippy
        flipOnHover={false} // default false
        flipOnClick={true} // default false
        flipDirection="horizontal" // horizontal or vertical
        ref={(r) => this.flippy = r} // to use toggle method like this.flippy.toggle()
        // if you pass isFlipped prop component will be controlled component.
        // and other props, which will go to div
        style={{ width: '350px', height: '300px' }} /// these are optional style, it is not necessary
      >
        <FrontSide
          style={{
            backgroundColor: '#FFFACD',
          }}
        >
         
          <h3 align="left">{name}</h3>
           <Link to="/confirm">
                    <img  src  ={imageURL} alt="Chocolate con leche" className="rounded-circle" width="250" height="200"  />
                  </Link>
        </FrontSide>
        <BackSide
          style={{ backgroundColor: '#FFFACD'}}>
         <h3 align="left">Dolce Margarita</h3>
        </BackSide>
      </Flippy>
      
    
    
      );
    
      
    
  }


render() {
	
return (
  
  <div className= "flex">
    {this.renderFlippy("https://scontent.faep5-1.fna.fbcdn.net/v/t1.0-9/42387509_890398297830476_1299436836371824640_n.jpg?_nc_cat=100&_nc_ht=scontent.faep5-1.fna&oh=f88f693afc1d462533105be9034d4954&oe=5CB0C507","Zapato y juego de cosmeticos")}
    {this.renderFlippy("https://scontent.faep5-1.fna.fbcdn.net/v/t1.0-9/42465014_890398401163799_8370310975462572032_n.jpg?_nc_cat=109&_nc_ht=scontent.faep5-1.fna&oh=afe38b3b2121d474629b96ef6f361fc9&oe=5C83D0D1","Iphone de Chocolate ")}
    {this.renderFlippy("https://scontent.faep5-1.fna.fbcdn.net/v/t1.0-9/42363042_890398131163826_3402577601330413568_n.jpg?_nc_cat=109&_nc_ht=scontent.faep5-1.fna&oh=1a6d0fe8e2daf2463c606702bec59b82&oe=5C6419B9","Zapato y Cartera ")}
    

    </div>
    
  
  
  );

}
}