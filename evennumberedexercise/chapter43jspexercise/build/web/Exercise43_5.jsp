<%@ page import = "chapter43.Exercise43_5" %>
<jsp:useBean id = "db" class = "chapter43.Exercise43_5"
    scope = "application"></jsp:useBean>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exercise43_5</title>
    </head>
    <body>
    
        <%
        String ssn = request.getParameter("ssn");
        String table = request.getParameter("course");
        String[] namescore = db.getNameScore(ssn, table);
        if (namescore == null)
            out.println("Not found");
        else 
          out.println(namescore[0]);
          out.println(namescore[1]);
        %>
    
    </body>
</html>