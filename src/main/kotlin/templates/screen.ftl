<html>
<head>
    <title>${name}</title>
</head>
<body>
<h1>
    Welcome ${name}
</h1>

<#list components as component>

    <h1>${component.name}</h1>
    <#if component.type == "Button">
    <button style="width: ${component.size.width}">Teste button</button>
    </#if>

</#list>
</html>