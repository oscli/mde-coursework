# mde-coursework

## Instructions for use:
  ### warning: You may need to create some empty folder before using
  ### 1. In running time eclipse, you can create a file which is end by .pageGenerator
  ### 2. After you complte your programming, save it and go src-gen folder. You will find a html file whose file name is same as the file name that you defined for pageGenerator file.
  ### 3. Open the HTML file, you can see the result of your program
  
  
## Test code:

Head{
 Title = 'My Blog';
 Description="viewport",lable="width=device-width, height=device-height,initial-scale=1";
}

Body{ 
 Section mainPage<Size=900*0>{

 Section welcomeSection <Background-Colour='LightGreen',Size=0*150,Text-location="center", Padding-top=1>{ 
  Heading first <index=1,Font-colour='white',Padding-top=20>="My Website";
  Hightlight-word h1 <Font-colour="orange">="responsive";
  Text intr <Font-colour='white', Font-size=20>="A" + h1 + ' website created by me';     
 }
 
 Section nivSection <Background-Colour='gray',Size=0*30, Section-location="center",Padding-left=30>{
  Link Home <Font-colour='white',Font-size=20>="#";  
  
  Link Gallary <Padding-left = 30, Font-colour='white',Font-size=20>="#";  
  
  Link Code <Padding-left = 30, Font-colour='white',Font-size=20>="#";  
  
  Link Setting <Padding-left = 30, Font-colour='white',Font-size=20> = '#';
   
 }
 Section welcomeSection <Background-Colour='LightGray',Size=200*600, Section-location="left">{
  
  Heading aboutMe  <index=2, Font-colour = 'black',Padding-left=10>="About me";
  
  Heading photeofMe <index=4, Font-colour = 'black',Padding-left=10> = "Photo of me:";
  
  Picture pic <size=100*150,Padding-left=10> = "/Users/wenkaizhang/Desktop/test1.png";
  
  Text introduction <Font-colour='black',Padding-left=10, Padding-right=20>="Some text about me ";
  
  Heading moreTexr <index=2,Font-colour='black',Padding-left=10>="More Text";
  
  Text introduction <Font-colour='black',Padding-left=10, Padding-right=20>="Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla  ";
  
  Picture pic1 <size=100*50,Padding-left=10> = "/Users/wenkaizhang/Desktop/test1.png";
  
  Picture pic2 <size=100*50,Padding-left=10> = "/Users/wenkaizhang/Desktop/test1.png";
  
  Picture pic3 <size=100*50,Padding-left=10> = "/Users/wenkaizhang/Desktop/test1.png";
  
 }
 
 Section welcomeSection <Background-Colour='white',Size=700*600, Section-location="left">{
  Heading titleHEding <index=1,Font-colour='black', Padding-left=20>="Title Heading";
  
  Heading descri <index=3,Font-colour='black', Padding-left=20>="Title description, Dec 7, 2017";
  
  Picture pic4<size=500*100,Padding-left=10> = "/Users/wenkaizhang/Desktop/test1.png";
  
  Text someText <Font-colour='black',Padding-left=10, Padding-right=20>="Bla Bla 
  Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla 
  Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla";
   
  Heading titleHEding <index=1,Font-colour='black', Padding-left=20>="Title Heading";
  
  Heading descri <index=3,Font-colour='black', Padding-left=20>="Title description, Dec 7, 2017";
  
  Picture pic4<size=500*100,Padding-left=10> = "/Users/wenkaizhang/Desktop/test1.png";
  
  Text someText <Font-colour='black',Padding-left=10, Padding-right=20>="Bla Bla 
  Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla 
  Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla Bla";
    
  

 }
 Section welcomeSection <Background-Colour='gray',Size=900*100, Section-location="left", Text-location="center">{
  Heading footer <index=1,Font-colour='black'>="Footer";
  
 }

 }

}
