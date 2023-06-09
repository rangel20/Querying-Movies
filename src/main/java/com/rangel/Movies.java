package com.rangel;

import java.util.Set;

public class Movies {

        public static final Movie spaceJam2021 = new MovieBuilder("Space Jam", 2021)
                        .categories("Family", "Animation", "Comedy", "SiFi")
                        .directors("Malcolm D. Lee")
                        .character("LeBron James", "LeBron James", "Stephen Kankole")
                        .character("AI G", "Don Cheadle")
                        .character("Dominic 'Dom' James", "Cedric Joe")
                        .build();

        public static final Movie beingJohnMalkovich = new MovieBuilder("Being John Malkovich", 1999)
                        .categories("Comedy", "Drama", "Fantasy")
                        .directors("Spike Jonze")
                        .character("Craig Schwartz", "John Cusack")
                        .character("John Malkovich", "John Malkovich")
                        .character("Lotte Schwartz", "Cameron Diaz")
                        .character("Maxine Lund", "Catherine Keener")
                        .character("Floris", "Mary Kay Place")
                        .build();

        public static final Movie spiderManNoWayHome = new MovieBuilder("Spider-Man: No Way Home", 2021)
                        .categories("Action", "Adventure", "SiFi")
                        .directors("Jon Watts")
                        .character("Peter Parker / Homem Aranha", "Tom Holland")
                        .character("Michelle 'MJ' Jones", "Zendaya")
                        .character("Stephen Strange / Doutor Estranho", "Benedict Cumberbatch")
                        .character("Max Dillon / Electro", "Jamie Foxx")
                        .character("Dr. Otto Octavius / Doutor Octopus", "Alfred Molina")
                        .build();

        public static final Movie matrixResurrections = new MovieBuilder("Matrix Resurrections", 2021)
                        .categories("SiFi", "Action", "Adventure")
                        .directors("Lana Wachowski")
                        .character("Thomas A. Anderson / Neo", "Keanu Reeves")
                        .character("Tiffany / Trinity", "Carrie-Anne Moss")
                        .character("Morpheus", "Yahya Abdul-Mateen II")
                        .character("Smith", "Jonathan Groff")
                        .character("The Analyst", "Neil Patrick Harris")
                        .build();

        public static final Movie dontLookUp = new MovieBuilder("Don't Look Up", 2021)
                        .categories("Comedy", "Drama", "SiFi")
                        .directors("Adam McKay")
                        .character("Kate Dibiasky", "Jennifer Lawrence")
                        .character("Dr. Randall Mindy", "Leonardo DiCaprio")
                        .character("President Orlean", "Meryl Streep")
                        .character("Dr. Teddy Oglethorpe", "Rob Morgan")
                        .build();

        public static final Movie avengersEndgame = new MovieBuilder("Avengers: Endgame", 2019)
                        .categories("Adventure", "SiFi", "Action")
                        .directors("Joe Russo", "Anthony Russo")
                        .character("Tony Stark / Homem de Ferro", "Robert Downey Jr.")
                        .character("Steve Rogers / Capitão América", "Chris Evans")
                        .character("Bruce Banner / Hulk", "Mark Ruffalo")
                        .character("Thor Odinson", "Chris Hemsworth")
                        .character("Natasha Romanoff / Viúva Negra", "Scarlett Johansson")
                        .character("Clint Barton / Gavião Arqueiro", "Jeremy Renner")
                        .character("Thanos", "Josh Brolin")
                        .build();

        public static final Movie pulpFiction = new MovieBuilder("Pulp Fiction", 1994)
                        .categories("Thriller", "Criminal")
                        .directors("Quentin Tarantino")
                        .character("Vincent Vega", "John Travolta")
                        .character("Jules Winnfield", "Samuel L. Jackson")
                        .character("Mia Wallace", "Uma Thurman")
                        .character("Butch Coolidge", "Bruce Willis")
                        .character("Marsellus Wallace", "Ving Rhames")
                        .character("Winston 'The Wolf' Wolfe", "Harvey Keitel")
                        .build();

        public static final Movie djangoUnchained = new MovieBuilder("Django Unchained", 2012)
                        .categories("Drama", "Western")
                        .directors("Quentin Tarantino")
                        .character("Django Freeman", "Jamie Foxx")
                        .character("Dr. King Schultz", "Christoph Waltz")
                        .character("Calvin J. Candie", "Leonardo DiCaprio")
                        .character("Broomhilda von Shaft", "Kerry Washington")
                        .character("Stephen", "Samuel L. Jackson")
                        .build();

        public static final Movie inglouriousBasterds = new MovieBuilder("Inglourious Basterds", 2009)
                        .categories("Drama", "Action", "Thriller", "War")
                        .directors("Quentin Tarantino")
                        .character("First Lieutenant Aldo 'The Apache' Raine", "Brad Pitt")
                        .character("Shosanna Dreyfus / Emmanuelle Mimieux", "Mélanie Laurent")
                        .character("SS Colonel Hans 'The Jew Hunter' Landa", "Christoph Waltz")
                        .character("Staff Sergeant Donny 'The Bear Jew' Donowitz", "Eli Roth")
                        .character("Lieutenant Archie Hicox", "Michael Fassbender")
                        .character("Bridget von Hammersmark", "Diane Kruger")
                        .build();

        public static final Movie braveheart = new MovieBuilder("Braveheart", 1995)
                        .categories("Action", "Drama", "History", "War")
                        .directors("Mel Gibson")
                        .character("William Wallace", "Mel Gibson")
                        .character("Murron MacClannough", "Catherine McCormack")
                        .character("Princess Isabelle", "Sophie Marceau")
                        .character("King Edward", "Patrick McGoohan")
                        .character("Robert the Bruce", "Angus Macfadyen")
                        .build();

        public static final Movie rockyII = new MovieBuilder("Rocky II", 1997)
                        .categories("Drama")
                        .directors("Sylvester Stallone")
                        .character("Robert 'Rocky' Balboa", "Sylvester Stallone")
                        .character("Adrianna 'Adrian' Balboa", "Talia Shire")
                        .character("Paulie Pennino", "Burt Young")
                        .character("Apollo Creed", "Carl Weathers")
                        .character("Mickey Goldmill", "Burgess Meredith")
                        .character("Tony 'Duke' Evers", "Tony Burton")
                        .build();

        public static final Movie theGreatDictator = new MovieBuilder("The Great Dictator", 1940)
                        .categories("Comedy", "War")
                        .directors("Charlie Chaplin")
                        .character("Adenoid Hynkel", "Charlie Chaplin")
                        .character("Benzino Napaloni", "Jack Oakie")
                        .character("Commander Schultz", "Reginald Gardiner")
                        .character("Garbitsch", "Henry Daniell")
                        .character("Field Marshal Herring", "Billy Gilbert")
                        .build();

        /**
         * Provieds a set of movies. The data is not complete, but is sufficient to test the challenge queries.
         * 
         * @return
         */
        public static Set<Movie> all() {
                return Set.of(
                                spaceJam2021,
                                beingJohnMalkovich,
                                spiderManNoWayHome,
                                matrixResurrections,
                                dontLookUp,
                                avengersEndgame,
                                pulpFiction,
                                djangoUnchained,
                                inglouriousBasterds,
                                braveheart,
                                rockyII,
                                theGreatDictator);
        }
}
