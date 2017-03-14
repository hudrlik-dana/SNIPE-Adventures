/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;

/**
 *
 * @author denisegoetz
 */
public enum SafeHouse implements Serializable {
    
    USA("\n This is where all secret agents begin training, graduate upon completion "
      + "\n of their training mission, and recover from death defying accidents. The"
      + "\n exact location of the S.N.I.P.E. academy is classified. This is the safe-house"
      + "\n in the USA. Your trainers and handlers are here to help you become the best"
      + "\n of the best, unseen by most, invisible in plain sight. The code to enter is"
      + "\n your secret spy name and passport.","USA"),
    Germany("\n You take a boat on the Rhine River and the city seems to get smaller and"
      + "\n smaller the further south the boat sails. A thick border of trees line the"
      + "\n river and you are entering the country side. Along the river, you see what "
      + "\n looks like a spectacular castle jutting out of the greenery along the river. "
      + "\n The sun bathes the masonry of the castle, illuminating all the details of the"
      + "\n peaks, windows and a rustic cylinder that looks like a farming silo that is "
      + "\n directly behind the main building. You have arrived at a small cottage hidden"
      + "\n along the mossy covered hillside. This is the safe-house in Germany.","Germany"),
    England("\n You arrived at the Westminster Abby, a gothic styled church of the 13th"
      + "\n century. Steeped deep in history this building has witnessed every coronation"
      + "\n of since the 10th century and sixteen royal weddings. Recalling history, you "
      + "\n remember that the Abby is a burial place of kings, statesmen, poets, scientists,"
      + "\n warriors and musicians.  This regal, magnificent building has the most gorgeous"
      + "\n details.  The windows are a work of geometric art with their varying shapes and"
      + "\n patterns of leaded glass.  People are bustling around, both inside and outside of"
      + "\n the church. You have arrived at the Gothic monastery church shrouded in a thick"
      + "\n fog. Searching the grounds of this medieval architecture wonder, you locate a small"
      + "\n hidden entrance on the north-east side. This is the safe-house in England.","England"),
    Spain("\n A taxi drops you off at the Cathedral of Seville. The building is adorned with"
      + "\n rich detail of centuries past architecture. The stone detail is so fine the patterns"
      + "\n in parts could be described as lace. You step out onto the paver street and see"
      + "\n this 2-story high gate entryway made of stone and rod iron. Next you see the Triumph"
      + "\n of Faith statue tarnished with a grey-blue patina. You step out of the taxi and into"
      + "\n a blustery cold wind that chills you to the bone. The largest Gothic style Christian"
      + "\n cathedral which took a century to build, raises into the sky. This is the safe-house"
      + "\n in Spain.","Spain"),
    Russia("\n After arriving in Red Square in Moscow, you see Lenin’s Mausoleum. The mainly red"
      + "\n stone building contrasts nicely with the charcoal grey accent stones and grey paver "
      + "\n brick streets. The overall look of the building is masculine due to its color and"
      + "\n multileveled rectangular shapes. The red brick wall behind the building stretches"
      + "\n upward surpassing the height of the Mausoleum, serving as a background. This old"
      + "\n burial site has several monuments and you are carefully examining each one as you"
      + "\n try to look like a tourist bundled up in your fur hooded coat. Lenin’s Mausoleum "
      + "\n is the safe house in Russia.","Russia"),
    France("\n You walk to the Cafe De Flore as instructed. It’s easy to find because of its white"
      + "\n lettering mounted to the edge the roof just above the building. It’s a corner cafe with"
      + "\n large round glass windows. Small bistro tables outside form a semicircle around the"
      + "\n rounded building. People are dining while reading the newspaper or talking to friends. "
      + "\n Your safe house for France is located along this street. You notice an older woman"
      + "\n watching you from a dirty window on the second floor of the florist’s shop. She is"
      + "\n your contact with the code to unlock the safe house. She points to the door of the "
      + "\n florist’s shop and disappears from your view. You walk inside and ask the florist if "
      + "\n there is a stairway to the second-floor apartments. You turn around and see the older "
      + "\n woman standing next to you.","France"),
    Canada("\n You travel to Toronto, Ontario in Canada. The city has many tall buildings but the"
      + "\n CN tower is close to double of the tallest building from the naked eye. The building"
      + "\n has pole like structure and the main living space near the top revolving 360 degrees"
      + "\n like a doughnut slowly turning on a stick. This concrete communications and observation"
      + "\n tower in downtown Toronto was the world’s tallest freestanding structure for 34 years."
      + "\n This is the safe house in Canada. You ride the elevator to the observation deck and blend"
      + "\n into the crowd of tourists as you look for the clue and the entrance to the safe house."
      + "\n An older gentleman wearing a very colorful Hawaiian shirt and a large straw hat walks up"
      + "\n next to you, and casually says, “The door you are looking for is below this floor.","Canada"),
    Brazil("\n You are headed for Brazil’s largest city, Sao Paulo. The tropical to subtropical"
      + "\n climate makes it warm year-round but have unpredictable monsoons. This is a well-established"
      + "\n city densely populated with skyscrapers and building of all kinds. Even from the air the "
      + "\n view is a landscape of tall buildings covering the earth. In the far of distance there are"
      + "\n mountains that can only be seen by air. The capital city is filled with tourists haggling"
      + "\n  with the street vendors over prices. You weave in and out of the crowd looking for your"
      + "\n contact at the fireworks stand. You spot him near the bright pink adobe building. This is"
      + "\n the safe house in Brazil.","Brazil"),
    Australia("\n You are headed to the Old Melbourne Jail in Victoria, Australia. It is a museum now"
      + "\n but has quite of history and some say it is haunted. You pull up and see a thick two-story"
      + "\n brick wall with an archway. You enter and see the complex. The jail is constructed of charcoal"
      + "\n grey colored cinder block. The building itself looks a bit like a saltbox construction where"
      + "\n it is one large rectangle atop another. Each small window has metal bars. The whole scene is"
      + "\n dreary and feels like you could be trapped. Today has been exhausting and painful. You really"
      + "\n need a break to rest and recover. The most unlikely place for a safe-house happens to be in the"
      + "\n basement of the Old Melbourne Jail. This is the safe-house for Australia. A nice comfy bed, "
      + "\n hot shower and air conditioning is sounding so good right about now.","Australia");
    
private final String safeHouseDesc;
private final String safeHouseCountry;


SafeHouse(String safeHouseDesc, String safeHouseCountry) { 
this.safeHouseDesc = safeHouseDesc;
this.safeHouseCountry = safeHouseCountry;
} 


public String getSafeHouseDesc() { 
return safeHouseDesc; 
} 

public String getSafeHouseCountry() { 
return safeHouseCountry; 
}
}
