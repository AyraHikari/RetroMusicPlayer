package me.ayra;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.Locale;

public class system {

  public String getSystemProperty(String key) {
    String value = null;

    try {
        value = (String) Class.forName("android.os.SystemProperties")
                .getMethod("get", String.class).invoke(null, key);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return value;
  }
}
