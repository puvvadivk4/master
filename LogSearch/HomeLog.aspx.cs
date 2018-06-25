using IT.Shared.LogBLL;
using IT.Shared.LogDAL;
using IT.Shared.LogEntities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace LogSearch
{
    public partial class HomeLog : System.Web.UI.Page
    {
        Error error;
        Message message;
        LogBLL bll ;
      static  List<Message> messagelist;
        static List<Error> errorlist;
        protected void Page_Load(object sender, EventArgs e)
        {
            ddl_severity.Visible = false;
            lbl_severity.Visible = false;

        }

        protected void btn_submit(object sender, EventArgs e)
        {
            bll = new LogBLL();
            //Connection.CreateCommand("");
            String AppName = txt_AppName.Text;
            String environment = ddl_environment.SelectedValue;

            if (RadioButtonList1.SelectedValue=="Error")
            {                
                error = new Error();
                error.AppName = AppName;
                error.Severity = ddl_severity.SelectedIndex;
                errorlist = bll.ErrorBLL(error, environment);
                if (errorlist != null)
                {
                    FormView2.DataSource = errorlist;
                    FormView2.DataBind();

                }

            }
            else
            {
                message = new Message();
                message.AppName = AppName;
                messagelist = bll.MessageBLL(message, environment);

                if (messagelist != null)
                {
                   // txt_AppName.Text = ((Message)messagelist[0]).Source;
                    FormView1.DataSource = messagelist;//list 
                    FormView1.DataBind();

                }
            }
        }

       

        

        protected void FormView1_PageIndexChanging(object sender, FormViewPageEventArgs e)
        {
            FormView1.PageIndex = e.NewPageIndex;
            Continue();
        }

        private void Continue()
           {
            FormView1.DataSource = messagelist;
            FormView1.DataBind();
        }

        protected void RadioButtonList1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (RadioButtonList1.SelectedValue == "Error")
            {
                ddl_severity.Visible = true;
                lbl_severity.Visible = true;
            }
            else {
                ddl_severity.Visible = false;
                lbl_severity.Visible = false;
            }
            
        }

        protected void FormView2_PageIndexChanging(object sender, FormViewPageEventArgs e)
        {
            FormView2.PageIndex = e.NewPageIndex;
            FormView2ContinuePaging();
        }
        private void FormView2ContinuePaging()
        {
            FormView2.DataSource = messagelist;
            FormView2.DataBind();
        }
    }
}