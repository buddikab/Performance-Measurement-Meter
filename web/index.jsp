<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>


  <form method="POST"  action="/PerformanceMeasurementMeter">


      <table>

          <tr>

              <td>Select a Test Type:</td>
              <td><select name="testType" > <option>Web</option><option>Database</option><option>FTP</option> </select></td>


          </tr>



          <tr>

              <td>Application Port</td>
              <td><input name="applicationPort" type="text" /></td>


          </tr>
          <tr>

              <td>Application Path</td>
              <td><input name="applicationPath" type="text" /></td>


          </tr>
          <tr>

              <td>RequestType</td>
              <td><select name="requestType" > <option>HEAD</option><option>POST</option><option>GET</option> </select></td>


          </tr>
          <tr>

              <td>Accept Type</td>
              <td><select name="acceptType" > <option>text/plain</option><option>application/json</option><option>application/xml</option> </select></td>


          </tr>
          <tr>

              <td>Application URL</td>
              <td><input name="applicationURL" type="text" /></td>


          </tr>

          <tr>

              <td>Do you need to get server details</td>
              <td>  <input name="serverDetails" type="radio" value="Yes" /> Yes <input name="serverDetails" type="radio" value="No" /> No</td>


          </tr>

          <tr>

              <td>Host Name for SSH Login</td>
              <td><input name="hostNameSSH" type="text" /></td>


          </tr>
          <tr>

              <td>Username for SSH Login</td>
              <td><input name="userNameSSH" type="text" /></td>


          </tr>
          <tr>

              <td>Password for SSH Login</td>
              <td><input name="passwordSSH" type="password" /></td>


          </tr>
          <tr>

              <td>Give a time period to get details from the server (Minutes)</td>
              <td><input name="timePeriodSSH" type="text" /></td>


          </tr>
          <tr>

              <td>Enter Terminal Command You want to perform (use ; for multiple commands)</td>
              <td><input name="commandsSSH" type="text" /></td>


          </tr>
          <tr>


              <td></td>
              <td><button type="submit">Run Test</button></td>


          </tr>

      </table>





  </form>



  </body>
</html>