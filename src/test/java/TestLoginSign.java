import Enums.Commands;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class SignIn{
  Matcher matcher;


  public Matcher getMatcher(String input) {
      String regex="^user create --nickname (?<nickname>[a-zA-Z]+) --username (?<username>[a-zA-Z]+) --password (?<password>[a-zA-Z]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher;
    }

  }



public class TestLoginSign {

    @Test
    public void signinCheckUsername(){
SignIn signIn=new SignIn();
Matcher matcher=signIn.getMatcher( "user create --nickname chako --username barzan --password password");
if (matcher.find()) {
    String userName = matcher.group("username");
    String username = "barzan";
    Assert.assertEquals(username, userName);
}
    }

@Test
    public void signinCheckPassword(){
        SignIn signIn=new SignIn();
        Matcher matcher=signIn.getMatcher( "user create --nickname chako --username barzan --password password");
        if (matcher.find()) {
            String passWord = matcher.group("password");
            String password = "password";
            Assert.assertEquals(password,passWord);
        }
    }

    @Test
    public void signinCheckNickname(){
        SignIn signIn=new SignIn();
        Matcher matcher=signIn.getMatcher( "user create --nickname chako --username barzan --password password");
        if (matcher.find()) {
            String nickName = matcher.group("nickname");
            String nickname = "chako";
            Assert.assertEquals(nickname,nickName);
        }
    }

    }






