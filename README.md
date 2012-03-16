<h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
  Scala Dojo 01 - The MailBox
</h4>

  
<div class="wiki-content" style="font-size: 10pt; line-height: 13pt;">
  <h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    Summary
  </h4>
  
  <div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    This inaugural dojo challenge should ease you into Scala gently, with the solution only requiring you to write about 6 lines of code. On the way you'll get <a class="external-link" href="http://www.scala-lang.org/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Scala</a> and <a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git</a> running on your machine, hopefully set up a <a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">GitHub</a> account, started to become familiar with the Scala syntax, <a class="external-link" href="http://www.scala-lang.org/node/120" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">patten matching</a> and the <a class="external-link" href="http://www.scalatest.org/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">ScalaTest</a> framework.<br /> <br /> <a href="http://stuartleneghan.blogspot.com/2012/03/scala-dojos.html" style="font-family: Arial, Helvetica, FreeSans, sans-serif; font-size: small; text-align: left;">Go here to see an overiew of this series of Scala dojos</a>
  </div>
  
  <h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo01-TheMailBox-TheMailboxproblem"></a>The Mailbox problem
  </h4>
  
  <div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    This problem involves completing the implementation of the MailBox.scala class, with the rules of how it should respond to different messages expressed in the tests. There is one rule in Dojo Club, <em>get the tests to go green</em>. <a class="external-link" href="https://github.com/leneghan/scala_dojo" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">The skeleton maven project I have created for the dojo can be found here on github</a>. Though you should not change the existing tests feel free to add new tests along the way.
  </div>
  
  <h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo01-TheMailBox-Gettingthecode"></a>Getting the code
  </h4>
  
  <div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    To get started you can fork the project into your own github repository, this is the preferred method as it means we can easily share our solutions with each other. If you don't wish to do this you can create a local copy from my repository by simply executing the following command.
  </div>
  
  <div class="preformatted panel" style="background-attachment: initial; background-clip: initial; background-color: white; background-image: initial; background-origin: initial; border-bottom-color: rgb(102, 153, 204); border-bottom-style: solid; border-bottom-width: 1px; border-left-color: rgb(102, 153, 204); border-left-style: solid; border-left-width: 1px; border-right-color: rgb(102, 153, 204); border-right-style: solid; border-right-width: 1px; border-top-color: rgb(102, 153, 204); border-top-style: solid; border-top-width: 1px; margin-bottom: 10px; margin-left: 20px; margin-right: 20px; margin-top: 10px; overflow-x: hidden; overflow-y: hidden; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <div class="preformattedContent panelContent" style="background-attachment: initial; background-clip: initial; background-image: initial; background-origin: initial; font-size: 0.95em; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 12px; padding-left: 10px; padding-right: 10px; padding-top: 12px; text-align: left;">
      <pre style="font-family: 'Courier New', Courier, monospace; line-height: 1.3; overflow-x: auto; overflow-y: auto; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">git clone https://github.com/leneghan/scala_dojo.git
</pre>
    </div>
  </div>
  
  <h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo01-TheMailBox-Gettingstartedwithgit"></a>Getting started with git
  </h4>
  
  <div style="font-size: 10pt; line-height: 13pt; margin-bottom: 10px; margin-top: 10px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    If you dont have git currently installed you can download it <a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">here from the git website</a>. When using Git I found this one page cheat sheet useful, it also comes with some pointers about good VCS practice, <a class="external-link" href="http://www.git-tower.com/files/cheatsheet/Git_Cheat_Sheet_grey.pdf" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git_Cheat_Sheet_grey.pdf</a>
  </div>
  
  <h4 style="font-size: 13pt; line-height: normal; margin-bottom: 4px; margin-left: 0px; margin-right: 0px; margin-top: 25px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
    <a href="http://www.blogger.com/blogger.g?blogID=3769493724401867109" name="ScalaDojo01-TheMailBox-Resources"></a>Resources
  </h4>
  
  <ul style="font-size: 10pt; line-height: 13pt;">
    <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
      <a class="external-link" href="http://www.scala-lang.org/node/120" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">A Tour of Scala: Pattern Matching</a>
    </li>
    <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
      <a class="external-link" href="http://www.scalatest.org/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">ScalaTest website</a>
    </li>
    <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
      <a class="external-link" href="http://twitter.github.com/scala_school/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Twitters Scala School</a>
    </li>
    <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
      <a class="external-link" href="https://github.com/" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">GitHub website</a>
    </li>
    <li style="font-size: 10pt; line-height: 13pt; margin-bottom: 0px; margin-left: 0px; margin-right: 0px; margin-top: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px; padding-top: 0px;">
      <a class="external-link" href="http://git-scm.com/download" rel="nofollow" style="color: #326ca6; outline-color: initial; outline-style: none; outline-width: initial; text-decoration: none;">Git download location</a>
    </li>
  </ul>
</div>