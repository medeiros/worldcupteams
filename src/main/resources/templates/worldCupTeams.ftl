<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>World Cup: Group ${group}</title>
    <link href="/css/main.css" rel="stylesheet"/>
</head>
<body>
    <h2 class="title">World Cup: Group ${group}</h2>

    <ul>
        <#list teams as team>
            <li>${team}
        </#list>
    </ul>

    <br><br>

    <#list ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'] as groupCode>
        <a href="/WorldCupTeams?group=${groupCode}">Group ${groupCode}</a> |
    </#list>

    <p>
        <i>check cool tutorial at <a href="https://freemarker.apache.org/docs/dgui_quickstart_template.html">https://freemarker.apache.org/docs/dgui_quickstart_template.html</a></i>
    </p>

</body>
</html>