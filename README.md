# HtmlInAndroid

**String resources**

``` xml
<string name="html_text">
Je <b>suis</b> <i><u>un texte</u> riche</i> en <font color="#FF0088">couleurs !\n</font>
<a href="https://stackoverflow.com/questions/2734270/how-to-make-links-in-a-textview-clickable">Les liens fonctionnent avec un peu de Java/Kotlin</a>,
les commandes de sauts de <br>ligne</br> ne fo<br />nctionnent pas
mais les smileys (&#x1F61C;), si ! &#128520;</string>
<string name="a_link">Je suis un simple lien sans HTML : http://google.com</string>
```

Supported tags : https://android.googlesource.com/platform/frameworks/base/+/master/core/java/android/text/Html.java#781

NB : The link in the 4th row (string `html_text` with `autoLink="all"`) doesn't work ! Appearance is OK but it's not clickable

![Example](https://github.com/NinoDLC/HtmlInAndroid/blob/master/Screenshot_1575304613.png)
