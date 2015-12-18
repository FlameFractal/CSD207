<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercise43_13</title>
    </head>
    <body>
        <%@ page import = "chapter43.Exercise43_13" %>
        <jsp:useBean id = "poll" class = "chapter43.Exercise43_13"
        scope = "application"></jsp:useBean>

        <form method = "post" action = "Exercise43_13b.jsp">
            <table>
            <% for (int i = 0; i < poll.getQuestions().size(); i++) {%>
                <tr>
                   <td>
                    <label><%= poll.getQuestions().get(i) %></label>
                   </td>
                   <td>
                    <input type = "radio" name = <%= "question" + i%> value = "Yes" /> Yes 
                   </td>
                   <td>
                    <input type = "radio" name = <%= "question" + i%> value = "No" /> No
                   </td>
                </tr>
            <%}%>
            </table>
                <p><input type = "submit" name = "Submit" value = "Submit">
                <input type = "reset" value = "Reset">
            </p>
        </form>
    </body>
</html>