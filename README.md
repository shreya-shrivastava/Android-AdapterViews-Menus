Overview:

An Android app that displays information about popular movies from the last five years. The app’s main activity displays a list whose items contain information about a particular movie from the last five years. 
This information includes a thumbnail picture of the movie poster (or image from the movie), and two text strings with different size fonts. The thumbnail picture is shown on the left of a list item; the two text strings are shown on top of each other to the right of the thumbnail. The first (top) text string uses a larger font than the second text string; this text string displays the name of the.The second (bottom) text string contains the year the movie was released. 

Implementation Details:

Each list item supports two kinds of functionality, depending on whether an app viewer performs a short vs. a long click on the item. A short click brings up a new activity that shows the entire picture of the selected movie on the entire device display. This picture must be a higher resolution and bigger than the thumbnail displayed earlier. The user can return to the list activity by selecting the “back” soft button on the phone. If, instead, a user clicks anywhere on the displayed picture, you must open a browser activity showing the IMDb web site for the movie. For instance, if your app shows a picture of the movie The Irishman, the app should bring up the IMDb web page for that movie: https://www.imdb.com/title/tt1302006/

A long click on a list item brings up a “context menu” showing the following four options for the list item under consideration:
(1) Display a third activity containing the following information about the movie: when the movie was released, duration of the movie, directors name, stars of the movie, two different ratings for the movie
(2) Go to a web site that shows the trailer for the movie.
(3) Go to the Wikipedia page for the director of the movie.
(4) Go to the IMDb web page for the movie; similar to a short click on the displayed picture.

Android platform:

For this project use a Pixel 3 XL AVD running Pie API 28.
