package com.prahlad.prcodeeditor;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.Menu;
import android.view.View;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;

import com.ncorti.slidetoact.SlideToActView;

import org.jetbrains.annotations.NotNull;

import maes.tech.intentanim.CustomIntent;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView user_code;
    SlideToActView run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_code = findViewById(R.id.user_code);
        run = findViewById(R.id.run);

        run.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(@NotNull SlideToActView slideToActView) {
                Run();
                run.resetSlider();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.run:
                Run();
                Toast.makeText(this, "Yup.. Your Webpage is looking Awesome", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.add_html:
                user_code.setText("<!DOCTYPE HTML>\n" +
                        "\n" +
                        "<html>\n" +
                        "\n" +
                        "<head>\n" +
                        "\t<title>PR Code Editor</title>\n" +
                        "\t<style>\n" +
                        "\t</style>\n" +
                        "</head>\n" +
                        "\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>Heloo Beautiful People</h1>\n" +
                        "<p>I Started Coding using PR Code Editor</p>\n" +
                        "<p>Awesome experience for me</p>\n" +
                        "\n" +
                        "\t<footer>\n" +
                        "\t\t<p>Copyright &copy;\t 2019 Coded using PR Code Editor</p>\n" +
                        "\t</footer>\n" +
                        "\t\n" +
                        "\t<script>\n" +
                        "\t</script>\n" +
                        "\n" +
                        "\n" +
                        "</body>\n" +
                        "\n" +
                        "</html>");
                Toast.makeText(this, "Start from here", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.help:
                user_code.setText("<!DOCTYPE html>\n" +
                        "\n" +
                        "<html>\n" +
                        "<!--Your HTML code starts from here -->\n" +
                        "<head>\n" +
                        "<!--Here the head tag starts -->\n" +
                        "<!--Here is the style tag //-->\n" +
                        "\n" +
                        "<!--Here is the style tag //-->\n" +
                        "<!--All the stylings to the html is done here //-->\n" +
                        "<style>\n" +
                        "body {background-color: powderblue;}\n" +
                        "h1   {color: blue;}\n" +
                        "p    {color: red;}\n" +
                        "</style>\n" +
                        "<!--HEre the style tag ends -->\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</head>\n" +
                        "<!--Herethe head tag ends -->\n" +
                        "\n" +
                        "<body>\n" +
                        "  <!--This is the body of the html-->\n" +
                        "<header>\n" +
                        "  <!--Here is the header tag -->\n" +
                        "\n" +
                        "  <!--Here is the scroll text -->\n" +
                        "  <marquee behavior=\"scroll\" direction=\"left\">I Scroll myself</marquee>\n" +
                        "\n" +
                        "  <h1>Heading tag 1</h1>\n" +
                        "  <!--This is the heading tag 1 of the html-->\n" +
                        "  <h2>Heading tag 2</h2>\n" +
                        "  <!--This is the heading tag 2 of the html-->\n" +
                        "  <h3>Heading tag 3</h3>\n" +
                        "  <!--This is the heading tag 3 of the html-->\n" +
                        "  <h4>Heading tag 4</h4>\n" +
                        "  <!--This is the heading tag 4 of the html-->\n" +
                        "\n" +
                        "  <p>Paragraph tag</p>\n" +
                        "  <!--This is the heading tag 4 of the html-->\n" +
                        "\n" +
                        "</header>\n" +
                        "<!--Here is the closing tag of header -->\n" +
                        "\n" +
                        "<footer>\n" +
                        "<!--This is a footer tag -->\n" +
                        "<marquee behavior=\"scroll\" direction=\"left\">End of this WebPage</marquee>\n" +
                        "\n" +
                        "\n" +
                        "</footer>\n" +
                        "<!--This is the end of the footer tag -->\n" +
                        "\n" +
                        "\n" +
                        "<script>\n" +
                        "//<!---This is a script tag //-->\n" +
                        "\n" +
                        "//<!--Here the JavaScript code is linked or written here //-->\n" +
                        "\n" +
                        "\n" +
                        "</script>\n" +
                        "<!--This is the end of script tag -->\n" +
                        "\n" +
                        "</body>\n" +
                        "<!--This is the end of the body tag -->\n" +
                        "</html>\n" +
                        "<!--Your HTML code ends here-->\n");
                Toast.makeText(this, "Basic HTML Tags are here", Toast.LENGTH_SHORT).show();

                return true;
            case R.id.clear:
                user_code.setText("");
                Toast.makeText(this, "Start coding from scratch", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.close:
                finish();
                Toast.makeText(this, "Bye Dear..!!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.update:
                Toast.makeText(this, "Sorry! Not working at present", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.save:
                Toast.makeText(this, "Saving your HardWork", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture1:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>You started learning HTML</h1>\n" +
                        "<p>Here is your first step</p>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 1", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture2:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "  <h1>This is heading 1</h1>\n" +
                        "  <h2>This is heading 2</h2>\n" +
                        "  <h3>This is heading 3</h3>\n" +
                        "  <h4>This is heading 4</h4>\n" +
                        "  <h5>This is heading 5</h5>\n" +
                        "  <h6>This is heading 6</h6>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 2", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture3:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<p>This is a paragraph tag</p>\n" +
                        "<p> Linus Benedict Torvalds was born on 28th December 1969 in Helsinki. He comes from a family of journalists. His father Nils Torvalds is a Finnish politician and perhaps president candidate in the next elections.</p>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 3", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture4:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h2>HTML Links</h2>\n" +
                        "<p>HTML links are defined with the a tag:</p>\n" +
                        "\n" +
                        "<a href=\"http://weblover.000webhostapp.com/\">This is your favorite link</a>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 4", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture5:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h2>HTML Buttons</h2>\n" +
                        "<p>HTML buttons are defined with the button tag:</p>\n" +
                        "\n" +
                        "<button>Here is your button</button>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 5", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture6:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "  <h2>An unordered HTML list</h2>\n" +
                        "\n" +
                        "\n" +
                        "  <ul>\n" +
                        "    <li>PR Browser</li>\n" +
                        "    <li>PR Code Editor</li>\n" +
                        "    <li>PR Notepad</li>\n" +
                        "  </ul>\n" +
                        "\n" +
                        "  <h2>An ordered HTML list</h2>\n" +
                        "\n" +
                        "<ol>\n" +
                        "  <li>PR Browser</li>\n" +
                        "  <li>PR Code Editor</li>\n" +
                        "  <li>PR Notepad</li>\n" +
                        "</ol>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 6", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture7:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h2>You can see the line below this text</h2>\n" +
                        "<hr>\n" +
                        "\n" +
                        "<h2>This is the use of hr tag</h2>\n" +
                        "<hr>\n" +
                        "\n" +
                        "<h2>Another line is here</h2>\n" +
                        "<hr><hr>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 7", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture8:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<style>\n" +
                        "body {background-color: powderblue;}\n" +
                        "h1   {color: blue;}\n" +
                        "p    {color: red;}\n" +
                        "</style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>You started learning CSS</h1>\n" +
                        "<p>Here is your second step</p>\n" +
                        "<p>Here you can observe that the background color and font color is changed.</p>\n" +
                        "<p>This is the purpose of CSS</P>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 8", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture9:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<style>\n" +
                        "  p {\n" +
                        "    border: 1px solid powderblue;\n" +
                        "  }\n" +
                        "</style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>CSS Borders</h1>\n" +
                        "<p>Thanks for adding border to me</p>\n" +
                        "<p>This made me much more special</p>\n" +
                        "<p>Am i looking awesome?</p>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 9", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture10:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<style>\n" +
                        "  p {\n" +
                        "    border: 1px solid powderblue;\n" +
                        "    padding: 30px;\n" +
                        "  }\n" +
                        "</style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>CSS Padding</h1>\n" +
                        "<p>Thanks for adding padding to me</p>\n" +
                        "<p>This made me much more special</p>\n" +
                        "<p>Am i looking awesome?</p>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 10", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture11:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<style>\n" +
                        "  p {\n" +
                        "    border: 1px solid powderblue;\n" +
                        "    margin: 50px;\n" +
                        "  }\n" +
                        "</style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>CSS Margin</h1>\n" +
                        "<p>Thanks for adding Margin to me</p>\n" +
                        "<p>This made me much more special</p>\n" +
                        "<p>Am i looking awesome?</p>\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 11", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture12:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h2 style=\"color:Tomato;\">Heloo Beautiful People</h2>\n" +
                        "\n" +
                        "<p style=\"color:DodgerBlue;\">YEah..!! Message your friend that you even know how to change color in HTML</p>\n" +
                        "\n" +
                        "<p style=\"color:MediumSeaGreen;\">You made this webpage more colorful, Finaly my color is looking awesome as you.</p>\n" +
                        "\n" +
                        "\n" +
                        "<h2 style=\"border: 2px solid Tomato;\">Heloo Beautiful People</h2>\n" +
                        "\n" +
                        "<h3 style=\"border: 2px solid DodgerBlue;\">YEah..!! Message your friend that you even know how to change color in HTML</h3>\n" +
                        "\n" +
                        "<h3 style=\"border: 2px solid Violet;\">You made this webpage more colorful, Finaly my border is looking awesome as you</h3>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 12", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture13:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<style>\n" +
                        "  p {\n" +
                        "\n" +
                        "  }\n" +
                        "  #made{\n" +
                        "    font-size: 200%;\n" +
                        "  }\n" +
                        "  #make {\n" +
                        "    font-family: courier;\n" +
                        "  }\n" +
                        "</style>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>CSS Font-size and Font-style</h1>\n" +
                        "<p id=\"made\">Thanks for making me bigger</p>\n" +
                        "<p>Hey..!! Make me bigger than above</p>\n" +
                        "<p id=\"make\">Is my font a bit different?</p>\n" +
                        "<h3>Hey..!! Make my font different too</h3>\n" +
                        "\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 13", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.lecture14:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<p>Try this font family</p>\n" +
                        "<ol>\n" +
                        "  <li>courier</li>\n" +
                        "  <li>verdana</li>\n" +
                        "  <li>Times New Roman</li>\n" +
                        "  <li>Times</li>\n" +
                        "  <li>serif</li>\n" +
                        "  <li>Georgia</li>\n" +
                        "  <li>monospace</li>\n" +
                        "</ol>\n" +
                        "<p>Google it if you are very much intrested in discovering new fonts</p>\n" +
                        "\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                Toast.makeText(this, "Welcome..! to Lecture 14", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.bootstrap:
                user_code.setText("<!doctype html>\n" +
                        "<html lang=\"en\">\n" +
                        "  <head>\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                        "\n" +
                        "    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" +
                        "\n" +
                        "    <title>Hello, world!</title>\n" +
                        "  </head>\n" +
                        "  <body>\n" +
                        "    <h1>Installing BootStrap</h1>\n" +
                        "    <p>Now you are good to go, use the beauty of bootstrap in your project</p>\n" +
                        "    <p>Hey..!! Beautiful People you are almost into web designing</p>\n" +
                        "\n" +
                        "    <div class=\"alert alert-success\" role=\"alert\">\n" +
                        "  If you can see the green box over me \n" +
                        "  Then you are ready to go with Bootstrap\n" +
                        "</div>\n" +
                        "\n" +
                        "\n" +
                        "    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n" +
                        "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n" +
                        "    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n" +
                        "  </body>\n" +
                        "</html>");

            case R.id.intro:
                user_code.setText("<!doctype html>\n" +
                        "<html lang=\"en\">\n" +
                        "  <head>\n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <title>Assignment 1</title>\n" +
                        "    <style>\n" +
                        "    button {\n" +
                        "    background-color:#25D366;\n" +
                        "    padding: 10px;\n" +
                        "    border: 1px white;\n" +
                        "    \n" +
                        "    }\n" +
                        "    a {\n" +
                        "  text-decoration: none;\n" +
                        "  color: #fff;\n" +
                        "}\n" +
                        "    </style>\n" +
                        "\n" +
                        "  </head>\n" +
                        "  <body>\n" +
                        "    <h1>Assignmentssss....!</h1>\n" +
                        "    <p>Don't worry people we are not going to give assignments as in your collage</p>\n" +
                        "    <p>You are now pretty happy right ?</p> \n" +
                        "    <br>\n" +
                        "    <p>As you already guessed, This Assignments are just based on designing a webpage</p>\n" +
                        "    <p>Hopefully, you can easily do it by your own</p>\n" +
                        "    <p>Yeah....! you dont need slips or etc... to get out of this assignments</p>\n" +
                        "    <br>\n" +
                        "    <p>What to do after completing assignment ?</p>\n" +
                        "    <p>Just send me the screenshot of the webpage and if possible with the code </p>\n" +
                        "    <p>mail me to <strong>prahladtech10@gmail.com</strong></p>\n" +
                        "    <p>OR</p>\n" +
                        "    <button><a href=\"https://wa.me/917396170742?text=Hello%2C%20PR%20I%20am%20from%20PR_Code_Editor.%20My%20Name%20Is%20__\" >WhatsApp</a></button>\n" +
                        "    <p>yup there is no invigilator appointed for you, maybe your heart should be your invigilator</p>\n" +
                        "    <br>\n" +
                        "    <p>I Guess you havent had an assignment like this before, Such a friendly Assignment</p>\n" +
                        "    <br>\n" +
                        "    <br>\n" +
                        "    <p>Hoping that my MAIL should ring with your beautiful webpages</p>\n" +
                        "    <p>See you in the <strong>Assignment 1</strong></p>\n" +
                        "    \n" +
                        "  </body>\n" +
                        "</html>\n");


            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void Run() {
        Intent intent = new Intent(MainActivity.this,Code_activity.class);
        intent.putExtra("code",user_code.getText().toString());
        startActivity(intent);
        CustomIntent.customType(MainActivity.this,"left-to-right");
        Toast.makeText(this, "Wolla.. your webpage is outstanding", Toast.LENGTH_SHORT).show();

    }
}
