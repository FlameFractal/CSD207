package jsfexercise;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Exercise44_02 {
  public String getResponse() {
    String s = "<table border=\"1\">" +
      "<tr><th colspan=\"10\">Multiplication Table</th></tr>" +
      "<tr>" +
      "<td width=\"50\" height=\"17\"></td>";
    for (int j = 1; j <= 9; j++)
      s += "<td width=\"50\" height=\"17\">" + j + "</td>";
    s += "</tr>";

    for (int i = 1; i <= 9; i++) {
      s += "<tr>";
      s += "<td width=\"50\" height=\"17\">" + i + "</td>";
      for (int j = 1; j <= 9; j++) {
        s += "<td width=\"50\" height=\"17\">" + i * j + "</td>";
      }
      s += "<tr>";
    }
    s += "</table>";

    return s;
  }
}
