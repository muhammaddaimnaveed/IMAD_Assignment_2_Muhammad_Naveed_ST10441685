IMAD Assignment 2 Essay

When developing a gaming application, developers are encouraged to implement five key factors in-order to produce a high-quality application that will have a long lifespan in the gaming 
industry. These factors involve having a good layout plan for the application, developing an engaging user interface, application testing, constant maintenance, and regular updates. 
Along with implementing these factors, developers should aim to produce a variety of new concepts and creative ideas to keep the users engaged, increase user’s satisfaction, and provide
a source of entertainment for millions of people around the world.

For my IMAD5112 Assignment 2, I was assigned to develop an application based on a Tamagotchi app whereby, users are given the responsibility to take care and look after their very own virtual 
pets on their digital devices or smartphones. Users constantly need to play, feed, and clean their virtual pets in-order to keep them alive and happy. The main purpose of the application is 
to provide entertainment and allow future pet owners to develop a sense of responsibility for the virtual pet’s well-being, as it mimic’s the responsibility of owning a real pet and looking 
after it on a daily basis. Although the complexity of developing this application was tough, I was able to successfully develop the app and make it comply to all the stipulations stated in the 
assignment using the information I had gathered from lessons, the module manual, YouTube videos and the Internet. 

When a user downloads the application and open’s it, they are introduced to a ten second loading screen which contains my company’s logo and name. Thereafter, the user is taken to the home splash 
screen where they can view the animated characters which are present in the game. After clicking the play button, the user is then taken to a new page where they can pick one of the five characters
present to choose from. After selecting a character, the user is introduced to the animated character on a new page where it gives them the character’s name and the type of animal they have selected.
After clicking the next button on the same page, the user is taken to a new page where they can interact with the character by either clicking the clean, feed or play button. When the user clicks 
one of those buttons, they are taken to a new page where they are presented with a corresponding character animation of the button they have selected (example: animation of the character playing when 
the play button is clicked). The user is then able to interact with the character by clicking on the play, feed or clean button in-order to increase their respective progress bar levels. Once the 
characters progress bar level is complete, the user is notified via a toast that the interaction is complete. After two minutes, the progress levels of each bar start to gradually decrease whereby
the user must then interact with the character once again to increase the levels before the character dies. 

The main challenge I faced while creating this application was to figure out a logical plan for when either one of the clean, play or feed button was clicked, the animation of the character had to 
change in-order to correspond with the selected button. To tackle this problem, I firstly created an activity and placed the play, feed and clean button one next to the other. I then created three
new activities and linked each activity to one of the buttons. In the new activities, I then placed a character animation which corresponded to the buttons (example: animation of the character
eating when the feed button is clicked) and attached a back button to each activity which would allow the user to go back to the main page. Thereafter, I implemented the same logic to all the 
characters in the application and inserted different animations to each activity resolving the challenge I initially faced.

In order to create a design for my application, I firstly browsed through the Internet, PlayStore and AppStore to find Tamagotchi apps in-order to gain inspiration and ideas for my application. 
My aim was to go for a vibrant themed look consisting of different animated character, background themes, colors, and modern app features in-order to create a more engaging, fun, and enjoyable
gaming application. Before starting, I downloaded all my animated character gifs and background images onto my laptop and gave them each a unique id name before placing them into my drawable folder
in Android Studio making it easy for me to access them during the development. 

I started by implementing a dark coral background for my loading screen as it enhanced my company’s logo and name. I then decided to implement a neutral background for my home splash screen consisting
of a park image and inserted my animated characters which I had taken from the Pusheen website along with a play button to go to the next activity. I then decided to go for coral-colored buttons and 
Irish Grover font text in-order to enhance my design and create a unique user interface. After clicking the play button, users are taken to a new page where they are introduced to five portraits of 
different characters to choose from by clicking the buttons with their names on them. After selecting a character, the character is then introduced to the users on a yellow background consisting of 
the character’s name, their species, and an animated gif of the character they have selected. After clicking the next button, the user is then taken to the main page of the application consisting of 
the feed, play and clean button. Here, I decided to insert a living room background to create a neutral home atmosphere and inserted an animated gif of the character. When the user clicks the play,
feed or clean button, they are taken to an activity with either a kitchen, beach or bathroom background where the animated character is shown either eating, playing or being cleaned and in-order to
increase the feeding, playing, or cleaning levels, the user needs to click the feed, play or clean button until the progress bar level is complete. I also decided to put in a back button on the top
right of each activity so that users can easily go back to the main activity and pick a different character if they wish to do so. Overall, I was trying to enhance the aesthetics of my app by using
vibrant colors, different characters, multiple background settings and a unique font in-order to keep the application as simple as possible to maintain a vibrant themed look.

In-order to develop my application, I firstly needed to brainstorm a step-by-step logical plan that would allow me to implement a loading screen, followed by a home splash screen, a screen that would
allow the user to pick a character, a screen to introduce the character, the main page of the character and lastly, the three linked pages where the users are able to either feed, play or clean the 
character before it dies. I gained inspiration from mobile games like My Talking Tom and Pou to develop my app. I used resources such as the module manual, YouTube videos and the Internet to learn 
about Tamagotchi apps. To develop my application, I firstly opened my emulator and entered the code 5555 to activate it. I then opened Android Studio and started working on the design of my application.
After creating the design for my loading screen, I linked my loading screen to the home splash screen and delayed the automatic transition between the two activities by ten seconds using the code 
(val DELAY_TIME: Long = 10000). Thereafter in my home splash screen, in-order to get my button to work, I firstly declared my button and attached it to a set on click listener. I then linked the play 
button to page 2 using the Intent function so when the button is clicked, the user is taken to the page which allows them to select a character of their choice. (var playbutton = findById<Button> 
(R.id.playbutton) playbutton.setOnClickListener {it: view! val intent = Intent (packageContent: this, page2 : : class.java)} startActivity(intent)} ). 

On page 2, I created five buttons with the characters names and gave them their own unique id names. Thereafter, I implemented the same code above for each character so when the user chooses a 
character, they are taken to another page which introduces the character they have selected. After the character introduction, I placed a next button using the linking method to go to the main 
page of each character. Here, you are introduced to the character in the living room. I placed the play, feed, and clean buttons down below and linked each of the buttons to their own new activities
to change the animation of the character with the button they have selected (example: animation of the character eating when the feed button is clicked). Thereafter, I inserted a progress bar in the
activity main of each linked activity and gave them each unique id names. I then declared the progress bars along with the buttons and attached the buttons to a set on click listener which would 
increase the progress bar when clicked. I used an if statement to increase the progress bar level by increments of ten until the level of the progress bar is complete. Once the progress bar reaches 
100 percent, the users receive a message via a toast which informs them that the interaction is complete (if (progressStatus < 100) { progressStatus += 10 progressBar.progress = progressStatus} 
else {Toast.makeText (context: this, text: “Feeding Complete”, Toast.LENGHT_SHORT).show () }). Finally, after two minutes, the level of the progress bar starts to gradually decrease and so the user
need to interact with the character to prevent it from dying. I have implemented the same logical plan to all my characters in-order to attain a fully functioning app and like that I have completed 
my assignment task.

After developing my application, I tested my app by running it on my emulator and it successfully ran complying with all the code and features I implemented in my project. I then signed into my 
existing GitHub account and created a new GitHub repository with a readme file. Thereafter, I copied my code from Android Studio along with my IMAD Assignment 2 essay from Microsoft Word and pasted 
it into the GitHub repository and readme file. To improve the quality of my application, I would add a soothing background audio along with new features, designs, challenges, and activities for users
to keep them engaged and enhance their experience. By developing this app, I have learnt a lot of new concepts and skills to improve the quality of my code and create more complexed projects on my own. 

(1802 Words)

Reference:

The Independent Institution of Education. (2024). Introduction of Mobile Application Development. IMAD5112. Varsity College Pietermaritzburg. [Online]. Available at: Tertiary Students
– IMAD5112MM.pdf – Default View (sharepoint.com). [Accessed: 18 April 2024].

Outfit7 Limited. (2013). My Talking Tom. [Online]. Available at: My Talking Tom - Apps on Google Play. [Accessed: 19 April 2024].

Zakeh Limited. (2012). Pou. [Online]. Available at: Pou - Apps on Google Play. [Accessed: 19 April 2024].

Pusheen. (No Date). Characters. [Online]. Available at: https://pusheen.com. [Accessed: 21 April 2024].

Google. (no date). Animated background images of a kitchen, bathroom and living room. [Online]. Available at: animated background images of a kitchen bathroom and living room - Search Images
(bing.com). [Accessed: 21 April 2024].

Android Minutes - YouTube. (2019). Android Studio - Progress Bar. [Online]. Available at: Android Studio - Progress Bar! (youtube.com). [Accessed: 25 April 2024].

Video Link:

Tamagotchi App (View in 720p/1080p) (youtube.com)

