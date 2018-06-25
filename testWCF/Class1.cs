using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using testWCF.CustomerAccessWS;

namespace testWCF
{
    class Class1
    {
        static void Main(string[] args)
        {


            BasicHttpBinding binding = new BasicHttpBinding();

            CustomerAccessWS.IndividualClientWSClient client = null;
            EndpointAddress address = new EndpointAddress("http://159.208.198.53/WebServices/IndividualClientWCF/IndividualClientWS.svc?wsdl");
            client = new CustomerAccessWS.IndividualClientWSClient(binding, address);

            //InitializeCustomerAccessDataRequest request = new InitializeCustomerAccessDataRequest();

            //request.initializeCustomerDataRequestHeader = new InitializeCustomerAccessDataRequestArguments();
            //request.initializeCustomerDataRequestHeader.SessionKey = "QM2EQr0vAX0He++8lrdY1nvQhKc=";// "bf6ruXXAyuQ6bQ0S/zfdkgE/8sg="; "QM2EQr0vAX0He++8lrdY1nvQhKc=";
            //request.initializeCustomerDataRequestHeader.SessionId = "QM2EQr0vAX0He++8lrdY1nvQhKc=";
            //request.initializeCustomerDataRequestHeader.ServiceName = "RequestClientInfo"; //RequestClientInfo
            //request.initializeCustomerDataRequestHeader.AccessId = "160126271163";//"160126271163";
            //request.initializeCustomerDataRequestHeader.AuthenticationToken = null;
            //request.initializeCustomerDataRequestHeader.Language = "F";
            //request.initializeCustomerDataRequestHeader.Domain = "CONSUMER";
            //request.initializeCustomerDataRequestHeader.Context = "INTERNET";
            //request.initializeCustomerDataRequestHeader.ApplicationVersion = "1.0";
            //request.initializeCustomerDataRequestBody = new InitializeCustomerDataRequestBody();
            //request.initializeCustomerDataRequestBody.SigninSite = "CLI"; //TODO SLF,SLFADVISOR.initializeCustomerDataRequestHeader = new Arguments();
            //request.initializeCustomerDataRequestHeader.TraceLevel = "10";
            //request.initializeCustomerDataRequestHeader.Requester = "NA";

            //InitializeCustomerAccessDataResponse response = client.InitializeCA(request);

            GetDataWithSessionRequest req = new GetDataWithSessionRequest();
            req.GetDataWithSessionRequestBody = new CustomerAccessWS.GetDataWithSessionRequestBody();
            req.GetDataWithSessionRequestHeader = new testWCF.CustomerAccessWS.GetDataWithSessionRequestArguments();
            req.GetDataWithSessionRequestHeader.ApplicationVersion = "1.0";
            req.GetDataWithSessionRequestHeader.ServiceName = "GetDataWithSession";
            req.GetDataWithSessionRequestHeader.SessionId = "MY_LOCAL_SESSIONKEY_341143";//488//488921
            req.GetDataWithSessionRequestHeader.Language = "E";
            req.GetDataWithSessionRequestHeader.AccessId = "160126895882";//"160126271163";
            req.GetDataWithSessionRequestBody.ClientIdOnCXSystem = "450230C429F4B380";// "F85B940325F4B345";//"DF68CF1B24F4B344";//45//450230C429F4B380
            //req.GetDataWithSessionRequestBody.EbusIntrnlId = "B0B9006B9FD0C7B3C55F06F4C3877437";
            req.GetDataWithSessionRequestBody.ContractInfoRequired = true;
            req.GetDataWithSessionRequestBody.AdvisorId = "";
            req.GetDataWithSessionRequestBody.SupportTool = false;
            req.GetDataWithSessionRequestHeader.Context = "IND_Client_Services";
            req.GetDataWithSessionRequestHeader.Domain = "CONSUMER";
            req.GetDataWithSessionRequestHeader.Requester = "IND_Client_Services";
            req.GetDataWithSessionRequestHeader.TraceLevel = "10";

            //GetDataWithSessionRequest req = new GetDataWithSessionRequest();
            //req.GetDataWithSessionRequestBody = new CustomerAccessWS.GetDataWithSessionRequestBody();
            //req.GetDataWithSessionRequestHeader = new testWCF.CustomerAccessWS.GetDataWithSessionRequestArguments();
            //req.GetDataWithSessionRequestHeader.ApplicationVersion = "1.0";
            //req.GetDataWithSessionRequestHeader.ServiceName = "GetDataWithSession";
            //req.GetDataWithSessionRequestHeader.SessionId = "HI4BwMMG3KEyQz9HIV55uv75wKE2";
            //req.GetDataWithSessionRequestHeader.Language = "E";
            //req.GetDataWithSessionRequestHeader.AccessId = "160126271163";//"160126271163";
            //req.GetDataWithSessionRequestHeader.Domain = "CONSUMER";
            //req.GetDataWithSessionRequestHeader.Context = "IND_Client_Services";
            //req.GetDataWithSessionRequestHeader.Requester = "IND_Client_Services";
            //req.GetDataWithSessionRequestHeader.TraceLevel = "10";
            //req.GetDataWithSessionRequestBody.ClientIdOnCXSystem = "7A0D959525F4B304";//"DF68CF1B24F4B344";
            //req.GetDataWithSessionRequestBody.EbusIntrnlId = "1B2CB4B09FD0C7B335569EF079269361";
            //req.GetDataWithSessionRequestBody.ContractInfoRequired = true;
            //req.GetDataWithSessionRequestBody.AdvisorId = "";
            //req.GetDataWithSessionRequestBody.SupportTool = false;

            GetDataWithSessionResponse respone = client.GetDataWithSession(req);

        }

    }
}
