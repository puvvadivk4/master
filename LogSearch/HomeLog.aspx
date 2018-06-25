<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="HomeLog.aspx.cs" Inherits="LogSearch.HomeLog" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
    <style type="text/css">

        .brder {
    border: 1px solid red;
}
        .auto-style1 {
            width: 109px;
        }
        .auto-style3 {
            width: 777px;
        }
        .auto-style4 {
            width: 282px;
        }
        .auto-style7 {
            width: 1108px;
            height: 191px;
            position: absolute;
            top: 158px;
            left: 133px;
            z-index: 1;
        }
        .auto-style8 {
            width: 85px;
            height: 34px;
            position: absolute;
            top: 89px;
            left: 250px;
            z-index: 1;
        }
        .auto-style9 {
            width: 1108px;
            height: 191px;
            position: absolute;
            top: 420px;
            left: 127px;
            z-index: 1;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <table style="width:100%;background-color:honeydew">
            <tr>
                <td  style="color:aqua" class="auto-style1">&nbsp;</td>
                <td colspan="3" style="text-align:center;">
                  <h1>  <asp:Label ID="Label4" runat="server" Text="Log information of tError and tMessage" Font-Bold="True" Font-Italic="True" ForeColor="#FF0066"></asp:Label></h1>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td  style="color:aqua" class="auto-style1">&nbsp;</td>
                <td class="auto-style4"><asp:Label ID="Label5" runat="server" Text="Information Type:"></asp:Label>&nbsp;
                    &nbsp; &nbsp;
                     <asp:RadioButtonList ID="RadioButtonList1" runat="server" AutoPostBack="True" OnSelectedIndexChanged="RadioButtonList1_SelectedIndexChanged" Width="85px" CssClass="auto-style8">
                        <asp:ListItem>Error</asp:ListItem>
                        <asp:ListItem>Message</asp:ListItem>
                    </asp:RadioButtonList>
                     </td>
                <td class="auto-style3">
                    <asp:Label ID="Label1" runat="server" Text="ApplicationName:"></asp:Label>
                    <asp:TextBox ID="txt_AppName" runat="server"></asp:TextBox>
                     </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td class="auto-style1">
                    
                    
                </td>
                <td class="auto-style4">
                    &nbsp;</td>
                <td class="auto-style3">
                    <asp:Label ID="lbl_severity" runat="server" Text="Severity:" BorderStyle="None" Font-Bold="True"></asp:Label>
                    <asp:DropDownList ID="ddl_severity" runat="server">
                    </asp:DropDownList>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <asp:Label ID="Label3" runat="server" Text="Environment"></asp:Label>
                    <asp:DropDownList ID="ddl_environment" runat="server">
                        <asp:ListItem>DEV</asp:ListItem>
                        <asp:ListItem>UAT</asp:ListItem>
                        <asp:ListItem>Local</asp:ListItem>
                    </asp:DropDownList>
                </td>
                <td>&nbsp;</td>
            </tr>
            <tr>
                <td></td><td></td><td class="auto-style3">
                <asp:Button ID="btn_Submit" runat="server" Text="Submit" OnClick="btn_submit" />
                </td>
            </tr>
            <tr style="height:250px">
               <td colspan="3">
                   <asp:FormView ID="FormView1" runat="server" AllowPaging="True" OnPageIndexChanging="FormView1_PageIndexChanging" ValidateRequestMode="Disabled" CssClass="auto-style7">
                                            <ItemTemplate>
                                                &nbsp;&nbsp;&nbsp;
                                                <asp:Label ID="Label6" runat="server" Text="Source"></asp:Label>
                                                <asp:TextBox ID="TextBox1" runat="server" Text='<%# Eval("Source") %>' TextMode="MultiLine" ValidateRequestMode="Disabled" Width="897px" Height="57px"></asp:TextBox>
                                                <br />
                                                <asp:Label ID="Label7" runat="server" Text="Message"></asp:Label>
                                                <asp:TextBox ID="TextBox2" runat="server" Text='<%# Eval("MessageData") %>' TextMode="MultiLine" ValidateRequestMode="Disabled" Width="897px" Height="57px"></asp:TextBox>
                                            </ItemTemplate>
                                        </asp:FormView>
               </td>
                                </tr>
            <tr style="height:430px;position:center">
                                    <td colspan="4" >
                                        <asp:FormView ID="FormView2" runat="server" CssClass="auto-style9" OnPageIndexChanging="FormView2_PageIndexChanging">
                                            <ItemTemplate>
                                                <asp:Label ID="Label8" runat="server"  Text="Description"></asp:Label> 
                                           &nbsp; &nbsp;           <asp:TextBox ID="txt_description" runat="server" TextMode="MultiLine" Width="897px" Height="57px"></asp:TextBox>
                                                <br />
                                                <asp:Label ID="Label9" runat="server" Text="SessionKey"></asp:Label>
                                              &nbsp;   <asp:TextBox ID="txt_Sessionkey" runat="server" TextMode="MultiLine" Width="897px" Height="57px"></asp:TextBox>
                                                <br />
                                                <asp:Label ID="Label10" runat="server" Text="DebugInfo"></asp:Label>
                                           &nbsp;    &nbsp;  <asp:TextBox ID="txt_debugInfo" runat="server" TextMode="MultiLine" Width="897px" Height="57px"></asp:TextBox>
                                                <br />
                                                <asp:Label ID="Label11" runat="server" Text="StackInfo"></asp:Label>
                                            &nbsp;   &nbsp;&nbsp;&nbsp;  <asp:TextBox ID="txt_stackInfo" runat="server" TextMode="MultiLine" Width="897px" Height="57px"></asp:TextBox>
                                                <br />
                                                <asp:Label ID="Label12" runat="server" Text="ExceptionInfo"></asp:Label>
                                                <asp:TextBox ID="txt_exceptionInfo" runat="server" TextMode="MultiLine" Width="897px" Height="57px"></asp:TextBox>
                                                <br />
                                                <asp:Label ID="Label13" runat="server" Text="GeneralInfo"></asp:Label>
                                          &nbsp;   &nbsp; <asp:TextBox ID="txt_generalInfo" runat="server" TextMode="MultiLine" Width="897px" Height="57px"></asp:TextBox>
                                            </ItemTemplate>
                                        </asp:FormView>
                                        
                                    </td>
                                </tr>
                            </table>
    </div>

    </form>

</body>

</html>
       
